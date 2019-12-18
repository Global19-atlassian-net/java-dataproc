/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/operations.proto

package com.google.cloud.dataproc.v1;

public interface ClusterOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ClusterOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the cluster for the operation.
   * </pre>
   *
   * <code>string cluster_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the cluster for the operation.
   * </pre>
   *
   * <code>string cluster_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cluster UUID for the operation.
   * </pre>
   *
   * <code>string cluster_uuid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterUuid.
   */
  java.lang.String getClusterUuid();
  /**
   *
   *
   * <pre>
   * Output only. Cluster UUID for the operation.
   * </pre>
   *
   * <code>string cluster_uuid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterUuid.
   */
  com.google.protobuf.ByteString getClusterUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current operation status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperationStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. Current operation status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperationStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.dataproc.v1.ClusterOperationStatus getStatus();
  /**
   *
   *
   * <pre>
   * Output only. Current operation status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperationStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterOperationStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The previous operation status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterOperationStatus status_history = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.ClusterOperationStatus> getStatusHistoryList();
  /**
   *
   *
   * <pre>
   * Output only. The previous operation status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterOperationStatus status_history = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterOperationStatus getStatusHistory(int index);
  /**
   *
   *
   * <pre>
   * Output only. The previous operation status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterOperationStatus status_history = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStatusHistoryCount();
  /**
   *
   *
   * <pre>
   * Output only. The previous operation status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterOperationStatus status_history = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.ClusterOperationStatusOrBuilder>
      getStatusHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The previous operation status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.ClusterOperationStatus status_history = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterOperationStatusOrBuilder getStatusHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The operation type.
   * </pre>
   *
   * <code>string operation_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The operationType.
   */
  java.lang.String getOperationType();
  /**
   *
   *
   * <pre>
   * Output only. The operation type.
   * </pre>
   *
   * <code>string operation_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for operationType.
   */
  com.google.protobuf.ByteString getOperationTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Short description of operation.
   * </pre>
   *
   * <code>string description = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Output only. Short description of operation.
   * </pre>
   *
   * <code>string description = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Labels associated with the operation
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Output only. Labels associated with the operation
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Output only. Labels associated with the operation
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Output only. Labels associated with the operation
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Labels associated with the operation
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during operation execution.
   * </pre>
   *
   * <code>repeated string warnings = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the warnings.
   */
  java.util.List<java.lang.String> getWarningsList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during operation execution.
   * </pre>
   *
   * <code>repeated string warnings = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of warnings.
   */
  int getWarningsCount();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during operation execution.
   * </pre>
   *
   * <code>repeated string warnings = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The warnings at the given index.
   */
  java.lang.String getWarnings(int index);
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during operation execution.
   * </pre>
   *
   * <code>repeated string warnings = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the warnings at the given index.
   */
  com.google.protobuf.ByteString getWarningsBytes(int index);
}
