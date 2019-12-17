package com.proto.mongo.blog;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: blog/blog.proto")
public final class BlogServiceGrpc {

  private BlogServiceGrpc() {}

  public static final String SERVICE_NAME = "blog.BlogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.mongo.blog.CreateBlogRequest,
      com.proto.mongo.blog.CreateBlogResponse> getCreateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlog",
      requestType = com.proto.mongo.blog.CreateBlogRequest.class,
      responseType = com.proto.mongo.blog.CreateBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.mongo.blog.CreateBlogRequest,
      com.proto.mongo.blog.CreateBlogResponse> getCreateBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.mongo.blog.CreateBlogRequest, com.proto.mongo.blog.CreateBlogResponse> getCreateBlogMethod;
    if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
          BlogServiceGrpc.getCreateBlogMethod = getCreateBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.mongo.blog.CreateBlogRequest, com.proto.mongo.blog.CreateBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.CreateBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.CreateBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("CreateBlog"))
              .build();
        }
      }
    }
    return getCreateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.mongo.blog.FindBlogRequest,
      com.proto.mongo.blog.FindBlogResponse> getFindBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindBlog",
      requestType = com.proto.mongo.blog.FindBlogRequest.class,
      responseType = com.proto.mongo.blog.FindBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.mongo.blog.FindBlogRequest,
      com.proto.mongo.blog.FindBlogResponse> getFindBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.mongo.blog.FindBlogRequest, com.proto.mongo.blog.FindBlogResponse> getFindBlogMethod;
    if ((getFindBlogMethod = BlogServiceGrpc.getFindBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getFindBlogMethod = BlogServiceGrpc.getFindBlogMethod) == null) {
          BlogServiceGrpc.getFindBlogMethod = getFindBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.mongo.blog.FindBlogRequest, com.proto.mongo.blog.FindBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.FindBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.FindBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("FindBlog"))
              .build();
        }
      }
    }
    return getFindBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.mongo.blog.UpdateBlogRequest,
      com.proto.mongo.blog.UpdateBlogResponse> getUpdateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBlog",
      requestType = com.proto.mongo.blog.UpdateBlogRequest.class,
      responseType = com.proto.mongo.blog.UpdateBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.mongo.blog.UpdateBlogRequest,
      com.proto.mongo.blog.UpdateBlogResponse> getUpdateBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.mongo.blog.UpdateBlogRequest, com.proto.mongo.blog.UpdateBlogResponse> getUpdateBlogMethod;
    if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
          BlogServiceGrpc.getUpdateBlogMethod = getUpdateBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.mongo.blog.UpdateBlogRequest, com.proto.mongo.blog.UpdateBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.UpdateBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.UpdateBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("updateBlog"))
              .build();
        }
      }
    }
    return getUpdateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.mongo.blog.DeleteBlogRequest,
      com.proto.mongo.blog.DeleteBlogResponse> getDeleteBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBlog",
      requestType = com.proto.mongo.blog.DeleteBlogRequest.class,
      responseType = com.proto.mongo.blog.DeleteBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.mongo.blog.DeleteBlogRequest,
      com.proto.mongo.blog.DeleteBlogResponse> getDeleteBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.mongo.blog.DeleteBlogRequest, com.proto.mongo.blog.DeleteBlogResponse> getDeleteBlogMethod;
    if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
          BlogServiceGrpc.getDeleteBlogMethod = getDeleteBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.mongo.blog.DeleteBlogRequest, com.proto.mongo.blog.DeleteBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.DeleteBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.DeleteBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("deleteBlog"))
              .build();
        }
      }
    }
    return getDeleteBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.mongo.blog.ListBlogRequest,
      com.proto.mongo.blog.ListBlogResponse> getListAllBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAllBlog",
      requestType = com.proto.mongo.blog.ListBlogRequest.class,
      responseType = com.proto.mongo.blog.ListBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.mongo.blog.ListBlogRequest,
      com.proto.mongo.blog.ListBlogResponse> getListAllBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.mongo.blog.ListBlogRequest, com.proto.mongo.blog.ListBlogResponse> getListAllBlogMethod;
    if ((getListAllBlogMethod = BlogServiceGrpc.getListAllBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getListAllBlogMethod = BlogServiceGrpc.getListAllBlogMethod) == null) {
          BlogServiceGrpc.getListAllBlogMethod = getListAllBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.mongo.blog.ListBlogRequest, com.proto.mongo.blog.ListBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listAllBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.ListBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.mongo.blog.ListBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("listAllBlog"))
              .build();
        }
      }
    }
    return getListAllBlogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogServiceStub newStub(io.grpc.Channel channel) {
    return new BlogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BlogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BlogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBlog(com.proto.mongo.blog.CreateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.CreateBlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBlogMethod(), responseObserver);
    }

    /**
     */
    public void findBlog(com.proto.mongo.blog.FindBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.FindBlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindBlogMethod(), responseObserver);
    }

    /**
     */
    public void updateBlog(com.proto.mongo.blog.UpdateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.UpdateBlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBlogMethod(), responseObserver);
    }

    /**
     */
    public void deleteBlog(com.proto.mongo.blog.DeleteBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.DeleteBlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBlogMethod(), responseObserver);
    }

    /**
     */
    public void listAllBlog(com.proto.mongo.blog.ListBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.ListBlogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAllBlogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.mongo.blog.CreateBlogRequest,
                com.proto.mongo.blog.CreateBlogResponse>(
                  this, METHODID_CREATE_BLOG)))
          .addMethod(
            getFindBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.mongo.blog.FindBlogRequest,
                com.proto.mongo.blog.FindBlogResponse>(
                  this, METHODID_FIND_BLOG)))
          .addMethod(
            getUpdateBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.mongo.blog.UpdateBlogRequest,
                com.proto.mongo.blog.UpdateBlogResponse>(
                  this, METHODID_UPDATE_BLOG)))
          .addMethod(
            getDeleteBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.mongo.blog.DeleteBlogRequest,
                com.proto.mongo.blog.DeleteBlogResponse>(
                  this, METHODID_DELETE_BLOG)))
          .addMethod(
            getListAllBlogMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.mongo.blog.ListBlogRequest,
                com.proto.mongo.blog.ListBlogResponse>(
                  this, METHODID_LIST_ALL_BLOG)))
          .build();
    }
  }

  /**
   */
  public static final class BlogServiceStub extends io.grpc.stub.AbstractStub<BlogServiceStub> {
    private BlogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBlog(com.proto.mongo.blog.CreateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.CreateBlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findBlog(com.proto.mongo.blog.FindBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.FindBlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlog(com.proto.mongo.blog.UpdateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.UpdateBlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlog(com.proto.mongo.blog.DeleteBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.DeleteBlogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAllBlog(com.proto.mongo.blog.ListBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.blog.ListBlogResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAllBlogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlogServiceBlockingStub extends io.grpc.stub.AbstractStub<BlogServiceBlockingStub> {
    private BlogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.mongo.blog.CreateBlogResponse createBlog(com.proto.mongo.blog.CreateBlogRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.mongo.blog.FindBlogResponse findBlog(com.proto.mongo.blog.FindBlogRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.mongo.blog.UpdateBlogResponse updateBlog(com.proto.mongo.blog.UpdateBlogRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.mongo.blog.DeleteBlogResponse deleteBlog(com.proto.mongo.blog.DeleteBlogRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.mongo.blog.ListBlogResponse> listAllBlog(
        com.proto.mongo.blog.ListBlogRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListAllBlogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlogServiceFutureStub extends io.grpc.stub.AbstractStub<BlogServiceFutureStub> {
    private BlogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.mongo.blog.CreateBlogResponse> createBlog(
        com.proto.mongo.blog.CreateBlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.mongo.blog.FindBlogResponse> findBlog(
        com.proto.mongo.blog.FindBlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.mongo.blog.UpdateBlogResponse> updateBlog(
        com.proto.mongo.blog.UpdateBlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.mongo.blog.DeleteBlogResponse> deleteBlog(
        com.proto.mongo.blog.DeleteBlogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOG = 0;
  private static final int METHODID_FIND_BLOG = 1;
  private static final int METHODID_UPDATE_BLOG = 2;
  private static final int METHODID_DELETE_BLOG = 3;
  private static final int METHODID_LIST_ALL_BLOG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BLOG:
          serviceImpl.createBlog((com.proto.mongo.blog.CreateBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongo.blog.CreateBlogResponse>) responseObserver);
          break;
        case METHODID_FIND_BLOG:
          serviceImpl.findBlog((com.proto.mongo.blog.FindBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongo.blog.FindBlogResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOG:
          serviceImpl.updateBlog((com.proto.mongo.blog.UpdateBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongo.blog.UpdateBlogResponse>) responseObserver);
          break;
        case METHODID_DELETE_BLOG:
          serviceImpl.deleteBlog((com.proto.mongo.blog.DeleteBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongo.blog.DeleteBlogResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_BLOG:
          serviceImpl.listAllBlog((com.proto.mongo.blog.ListBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongo.blog.ListBlogResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.mongo.blog.BlogOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlogService");
    }
  }

  private static final class BlogServiceFileDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier {
    BlogServiceFileDescriptorSupplier() {}
  }

  private static final class BlogServiceMethodDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BlogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogServiceFileDescriptorSupplier())
              .addMethod(getCreateBlogMethod())
              .addMethod(getFindBlogMethod())
              .addMethod(getUpdateBlogMethod())
              .addMethod(getDeleteBlogMethod())
              .addMethod(getListAllBlogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
