// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/common.proto

package com.google.firestore.v1beta1;

public interface DocumentMaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.DocumentMask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1beta1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  java.util.List<java.lang.String>
      getFieldPathsList();
  /**
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1beta1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  int getFieldPathsCount();
  /**
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1beta1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  java.lang.String getFieldPaths(int index);
  /**
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1beta1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  com.google.protobuf.ByteString
      getFieldPathsBytes(int index);
}