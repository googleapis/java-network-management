/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/networkmanagement/v1/reachability.proto

package com.google.cloud.networkmanagement.v1;

public final class ReachabilityServiceProto {
  private ReachabilityServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/networkmanagement/v1/reac"
          + "hability.proto\022!google.cloud.networkmana"
          + "gement.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\0329google/cloud/networkmanagement/v1/"
          + "connectivity_test.proto\032#google/longrunn"
          + "ing/operations.proto\032 google/protobuf/fi"
          + "eld_mask.proto\032\037google/protobuf/timestam"
          + "p.proto\"|\n\034ListConnectivityTestsRequest\022"
          + "\023\n\006parent\030\001 \001(\tB\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022"
          + "\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010o"
          + "rder_by\030\005 \001(\t\"\225\001\n\035ListConnectivityTestsR"
          + "esponse\022F\n\tresources\030\001 \003(\01323.google.clou"
          + "d.networkmanagement.v1.ConnectivityTest\022"
          + "\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachable\030"
          + "\003 \003(\t\"/\n\032GetConnectivityTestRequest\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\002\"\226\001\n\035CreateConnectivityTes"
          + "tRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\024\n\007test_id"
          + "\030\002 \001(\tB\003\340A\002\022J\n\010resource\030\003 \001(\01323.google.c"
          + "loud.networkmanagement.v1.ConnectivityTe"
          + "stB\003\340A\002\"\241\001\n\035UpdateConnectivityTestReques"
          + "t\0224\n\013update_mask\030\001 \001(\0132\032.google.protobuf"
          + ".FieldMaskB\003\340A\002\022J\n\010resource\030\002 \001(\01323.goog"
          + "le.cloud.networkmanagement.v1.Connectivi"
          + "tyTestB\003\340A\002\"2\n\035DeleteConnectivityTestReq"
          + "uest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"1\n\034RerunConnecti"
          + "vityTestRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"\326\001\n\021O"
          + "perationMetadata\022/\n\013create_time\030\001 \001(\0132\032."
          + "google.protobuf.Timestamp\022,\n\010end_time\030\002 "
          + "\001(\0132\032.google.protobuf.Timestamp\022\016\n\006targe"
          + "t\030\003 \001(\t\022\014\n\004verb\030\004 \001(\t\022\025\n\rstatus_detail\030\005"
          + " \001(\t\022\030\n\020cancel_requested\030\006 \001(\010\022\023\n\013api_ve"
          + "rsion\030\007 \001(\t2\226\r\n\023ReachabilityService\022\347\001\n\025"
          + "ListConnectivityTests\022?.google.cloud.net"
          + "workmanagement.v1.ListConnectivityTestsR"
          + "equest\032@.google.cloud.networkmanagement."
          + "v1.ListConnectivityTestsResponse\"K\202\323\344\223\002<"
          + "\022:/v1/{parent=projects/*/locations/globa"
          + "l}/connectivityTests\332A\006parent\022\324\001\n\023GetCon"
          + "nectivityTest\022=.google.cloud.networkmana"
          + "gement.v1.GetConnectivityTestRequest\0323.g"
          + "oogle.cloud.networkmanagement.v1.Connect"
          + "ivityTest\"I\202\323\344\223\002<\022:/v1/{name=projects/*/"
          + "locations/global/connectivityTests/*}\332A\004"
          + "name\022\254\002\n\026CreateConnectivityTest\022@.google"
          + ".cloud.networkmanagement.v1.CreateConnec"
          + "tivityTestRequest\032\035.google.longrunning.O"
          + "peration\"\260\001\202\323\344\223\002F\":/v1/{parent=projects/"
          + "*/locations/global}/connectivityTests:\010r"
          + "esource\332A\027parent,test_id,resource\312AG\n2go"
          + "ogle.cloud.networkmanagement.v1.Connecti"
          + "vityTest\022\021OperationMetadata\022\262\002\n\026UpdateCo"
          + "nnectivityTest\022@.google.cloud.networkman"
          + "agement.v1.UpdateConnectivityTestRequest"
          + "\032\035.google.longrunning.Operation\"\266\001\202\323\344\223\002O"
          + "2C/v1/{resource.name=projects/*/location"
          + "s/global/connectivityTests/*}:\010resource\332"
          + "A\024update_mask,resource\312AG\n2google.cloud."
          + "networkmanagement.v1.ConnectivityTest\022\021O"
          + "perationMetadata\022\217\002\n\025RerunConnectivityTe"
          + "st\022?.google.cloud.networkmanagement.v1.R"
          + "erunConnectivityTestRequest\032\035.google.lon"
          + "grunning.Operation\"\225\001\202\323\344\223\002E\"@/v1/{name=p"
          + "rojects/*/locations/global/connectivityT"
          + "ests/*}:rerun:\001*\312AG\n2google.cloud.networ"
          + "kmanagement.v1.ConnectivityTest\022\021Operati"
          + "onMetadata\022\361\001\n\026DeleteConnectivityTest\022@."
          + "google.cloud.networkmanagement.v1.Delete"
          + "ConnectivityTestRequest\032\035.google.longrun"
          + "ning.Operation\"v\202\323\344\223\002<*:/v1/{name=projec"
          + "ts/*/locations/global/connectivityTests/"
          + "*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021Ope"
          + "rationMetadata\032T\312A networkmanagement.goo"
          + "gleapis.com\322A.https://www.googleapis.com"
          + "/auth/cloud-platformB\206\002\n%com.google.clou"
          + "d.networkmanagement.v1B\030ReachabilityServ"
          + "iceProtoP\001ZRgoogle.golang.org/genproto/g"
          + "oogleapis/cloud/networkmanagement/v1;net"
          + "workmanagement\252\002!Google.Cloud.NetworkMan"
          + "agement.V1\312\002!Google\\Cloud\\NetworkManagem"
          + "ent\\V1\352\002$Google::Cloud::NetworkManagemen"
          + "t::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networkmanagement.v1.TestOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TestId", "Resource",
            });
    internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Resource",
            });
    internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkmanagement_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networkmanagement.v1.TestOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
