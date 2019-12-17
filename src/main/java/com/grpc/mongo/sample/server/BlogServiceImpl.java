package com.grpc.mongo.sample.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.proto.mongo.blog.Blog;
import com.proto.mongo.blog.BlogServiceGrpc.BlogServiceImplBase;
import com.proto.mongo.blog.CreateBlogRequest;
import com.proto.mongo.blog.CreateBlogResponse;
import com.proto.mongo.blog.FindBlogRequest;
import com.proto.mongo.blog.FindBlogResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.conversions.Bson;
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
        Blog blog = Blog.newBuilder().setAuthorId(document.getString("author_id")).
            setContent(document.getString("content")).setTitle(document.getString("title")).build();
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
}
