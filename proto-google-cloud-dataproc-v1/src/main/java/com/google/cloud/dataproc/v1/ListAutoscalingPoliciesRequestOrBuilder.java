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
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public interface ListAutoscalingPoliciesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListAutoscalingPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.autoscalingPolicies.list`, the resource name
   *   of the region has the following format:
   *   `projects/{project_id}/regions/{region}`
   * * For `projects.locations.autoscalingPolicies.list`, the resource name
   *   of the location has the following format:
   *   `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.autoscalingPolicies.list`, the resource name
   *   of the region has the following format:
   *   `projects/{project_id}/regions/{region}`
   * * For `projects.locations.autoscalingPolicies.list`, the resource name
   *   of the location has the following format:
   *   `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return in each response.
   * Must be less than or equal to 1000. Defaults to 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The page token, returned by a previous call, to request the
   * next page of results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The page token, returned by a previous call, to request the
   * next page of results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}