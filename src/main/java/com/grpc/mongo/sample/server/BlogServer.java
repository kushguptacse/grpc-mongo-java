package com.grpc.mongo.sample.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class BlogServer {

  public static void main(String[] args) throws InterruptedException, IOException {
    System.out.println("Hello gRPC Server!!");
    Server server1 = ServerBuilder.forPort(50053).
        addService(new BlogServiceImpl()).
        build();
    server1.start();
    //since shutdown hook is added
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("Received Shutdown Request");
      server1.shutdown();
      System.out.println("stopped server!!");
    }));

// below line is used to hold the server otherwise application exits as soon as started.
    //now it will await termination
    server1.awaitTermination();
  }

}
