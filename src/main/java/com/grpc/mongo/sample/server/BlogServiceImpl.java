package com.grpc.mongo.sample.server;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.result.DeleteResult;
import com.proto.mongo.blog.Blog;
import com.proto.mongo.blog.BlogServiceGrpc.BlogServiceImplBase;
import com.proto.mongo.blog.CreateBlogRequest;
import com.proto.mongo.blog.CreateBlogResponse;
import com.proto.mongo.blog.DeleteBlogRequest;
import com.proto.mongo.blog.DeleteBlogResponse;
import com.proto.mongo.blog.FindBlogRequest;
import com.proto.mongo.blog.FindBlogResponse;
import com.proto.mongo.blog.ListBlogRequest;
import com.proto.mongo.blog.ListBlogResponse;
import com.proto.mongo.blog.UpdateBlogRequest;
import com.proto.mongo.blog.UpdateBlogResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.Iterator;
import org.bson.Document;
import org.bson.types.ObjectId;

public class BlogServiceImpl extends BlogServiceImplBase {

  private MongoClient client = MongoClients.create("mongodb://localhost:27017");
  private MongoDatabase database = client.getDatabase("mydb");
  private MongoCollection<Document> collection = database.getCollection("blog");

  @Override
  public void createBlog(CreateBlogRequest request,
      StreamObserver<CreateBlogResponse> responseObserver) {
    Blog blog = request.getBlog();
    //create object in mongo
    Document document = new Document("author_id", blog.getAuthorId())
        .append("title", blog.getTitle())
        .append("content", blog.getContent());
    collection.insertOne(document);
    String id = document.getObjectId("_id").toString();
    CreateBlogResponse createBlogResponse = CreateBlogResponse.newBuilder().setBlog(
        Blog.newBuilder().setAuthorId(blog.getAuthorId()).setContent(blog.getContent())
            .setTitle(blog.getTitle()).setId(id).build()).build();

    responseObserver.onNext(createBlogResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void findBlog(FindBlogRequest request, StreamObserver<FindBlogResponse> responseObserver) {
    try {
      // find by object id - will throw IllegalArgumentException
      ObjectId objectId = new ObjectId(request.getId());

      Document document = collection.find(Filters.eq("_id", objectId)).first();
      if (document == null) {
        responseObserver.onError(
            Status.NOT_FOUND.withDescription("id does not exist in DB: " + request.getId())
                .asRuntimeException());
      } else {
        Blog blog = getBlogObjectFromDocument(document);
        responseObserver.onNext(FindBlogResponse.newBuilder().setBlog(blog).build());
        responseObserver.onCompleted();
      }
    } catch (IllegalArgumentException iae) {
      responseObserver.onError(
          Status.NOT_FOUND.withDescription("invalid id: " + request.getId())
              .augmentDescription(iae.getLocalizedMessage())
              .asRuntimeException());
    }
  }

  @Override
  public void updateBlog(UpdateBlogRequest request,
      StreamObserver<UpdateBlogResponse> responseObserver) {
    Blog blog = request.getBlog();
    try {
      // find by object id - will throw IllegalArgumentException
      ObjectId objectId = new ObjectId(blog.getId());
      //find and update
      Document document = getBlogDocumentFromBlogObject(blog, objectId);
      collection
          .findOneAndReplace(Filters.eq("_id", objectId),
              document, new FindOneAndReplaceOptions().returnDocument(
                  ReturnDocument.AFTER));
      if (document == null) {
        responseObserver.onError(
            Status.NOT_FOUND.withDescription("id does not exist in DB: " + blog.getId())
                .asRuntimeException());
      } else {
        Blog updatedBlog = getBlogObjectFromDocument(document);
        responseObserver.onNext(UpdateBlogResponse.newBuilder().setBlog(updatedBlog).build());
        responseObserver.onCompleted();
      }

    } catch (IllegalArgumentException iae) {
      responseObserver.onError(
          Status.NOT_FOUND.withDescription("invalid id: " + blog.getId())
              .augmentDescription(iae.getLocalizedMessage())
              .asRuntimeException());
    }
  }

  @Override
  public void deleteBlog(DeleteBlogRequest request,
      StreamObserver<DeleteBlogResponse> responseObserver) {
    try {

      ObjectId objectId = new ObjectId(request.getId());
      DeleteResult result = collection.deleteOne(Filters.eq("_id", objectId));
      if (result.getDeletedCount() > 0) {
        responseObserver.onNext(DeleteBlogResponse.newBuilder().setId(request.getId()).build());
        responseObserver.onCompleted();
      } else {
        responseObserver.onError(Status.NOT_FOUND.withDescription("invalid id: " + request.getId())
            .asRuntimeException());
      }
    } catch (IllegalArgumentException iae) {
      responseObserver.onError(Status.NOT_FOUND.withDescription("invalid id: " + request.getId())
          .augmentDescription(iae.getLocalizedMessage())
          .asRuntimeException());
    }

  }

  @Override
  public void listAllBlog(ListBlogRequest request,
      StreamObserver<ListBlogResponse> responseObserver) {

    FindIterable<Document> it = collection.find();
    for (Document doc : it) {
      responseObserver
          .onNext(ListBlogResponse.newBuilder().setBlog(getBlogObjectFromDocument(doc)).build());
    }
    responseObserver.onCompleted();

  }

  private Blog getBlogObjectFromDocument(Document document) {
    return Blog.newBuilder().setAuthorId(document.getString("author_id")).
        setContent(document.getString("content")).setTitle(document.getString("title"))
        .setId(document.getObjectId("_id").toString()).build();
  }

  private Document getBlogDocumentFromBlogObject(Blog blog, ObjectId objectId) {
    return new Document("author_id", blog.getAuthorId())
        .append("title", blog.getTitle())
        .append("content", blog.getContent()).append("_id", objectId);
  }
}
