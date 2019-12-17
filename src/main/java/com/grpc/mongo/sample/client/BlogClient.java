package com.grpc.mongo.sample.client;

import com.google.protobuf.BlockingService;
import com.proto.mongo.blog.Blog;
import com.proto.mongo.blog.BlogServiceGrpc;
import com.proto.mongo.blog.BlogServiceGrpc.BlogServiceBlockingStub;
import com.proto.mongo.blog.CreateBlogRequest;
import com.proto.mongo.blog.CreateBlogResponse;
import com.proto.mongo.blog.FindBlogRequest;
import com.proto.mongo.blog.FindBlogResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class BlogClient {

  public static void main(String[] args) {
    System.out.println("Blog Client Started !!!");
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext()
        .build();
    BlogServiceBlockingStub blogServiceBlockingStub = BlogServiceGrpc.newBlockingStub(channel);
    String title = "krisha key";
    String authorId = "Ashwin";
    String content = "mystery thriller on philospher stone and kalki avatar";
    System.out.println("Inserting document !!!");
    CreateBlogResponse response = blogServiceBlockingStub
        .createBlog(CreateBlogRequest.newBuilder().setBlog(
            Blog.newBuilder().setTitle(title).setContent(content).setAuthorId(authorId).build())
            .build());
    System.out.println("Object created with Id : ");
    String id = response.getBlog().getId();
    System.out.println(id);

    //find document by id
    System.out.println("Finding document with id - " + id);
    try {
      FindBlogResponse findBlogResponse = blogServiceBlockingStub
          .findBlog(FindBlogRequest.newBuilder().setId(id).build());
      System.out.println("Item Found : ");
      System.out.println(findBlogResponse);
    } catch (StatusRuntimeException sre) {
      sre.printStackTrace();
    }

    //find document by id
    id = "12";
    System.out.println("Finding document with fake-id - " + id);
    try {
      FindBlogResponse findBlogResponse = blogServiceBlockingStub
          .findBlog(FindBlogRequest.newBuilder().setId(id).build());
      System.out.println("Item Found : ");
      System.out.println(findBlogResponse);
    } catch (StatusRuntimeException sre) {
      sre.printStackTrace();
    }
    channel.shutdown();
  }

}
