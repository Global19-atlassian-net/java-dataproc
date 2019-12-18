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

public interface DeleteAutoscalingPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.DeleteAutoscalingPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.autoscalingPolicies.delete`, the resource name
   *   of the policy has the following format:
   *   `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`
   * * For `projects.locations.autoscalingPolicies.delete`, the resource name
   *   of the policy has the following format:
   *   `projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.autoscalingPolicies.delete`, the resource name
   *   of the policy has the following format:
   *   `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`
   * * For `projects.locations.autoscalingPolicies.delete`, the resource name
   *   of the policy has the following format:
   *   `projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
