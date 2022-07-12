// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1beta1/reachability.proto

package com.google.cloud.networkmanagement.v1beta1;

public final class ReachabilityServiceProto {
  private ReachabilityServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/networkmanagement/v1beta1" +
      "/reachability.proto\022&google.cloud.networ" +
      "kmanagement.v1beta1\032\034google/api/annotati" +
      "ons.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032>google/cl" +
      "oud/networkmanagement/v1beta1/connectivi" +
      "ty_test.proto\032#google/longrunning/operat" +
      "ions.proto\032 google/protobuf/field_mask.p" +
      "roto\032\037google/protobuf/timestamp.proto\032\027g" +
      "oogle/api/client.proto\"|\n\034ListConnectivi" +
      "tyTestsRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\021\n\tp" +
      "age_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006fi" +
      "lter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"\232\001\n\035ListCon" +
      "nectivityTestsResponse\022K\n\tresources\030\001 \003(" +
      "\01328.google.cloud.networkmanagement.v1bet" +
      "a1.ConnectivityTest\022\027\n\017next_page_token\030\002" +
      " \001(\t\022\023\n\013unreachable\030\003 \003(\t\"/\n\032GetConnecti" +
      "vityTestRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"\233\001\n\035C" +
      "reateConnectivityTestRequest\022\023\n\006parent\030\001" +
      " \001(\tB\003\340A\002\022\024\n\007test_id\030\002 \001(\tB\003\340A\002\022O\n\010resou" +
      "rce\030\003 \001(\01328.google.cloud.networkmanageme" +
      "nt.v1beta1.ConnectivityTestB\003\340A\002\"\246\001\n\035Upd" +
      "ateConnectivityTestRequest\0224\n\013update_mas" +
      "k\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002" +
      "\022O\n\010resource\030\002 \001(\01328.google.cloud.networ" +
      "kmanagement.v1beta1.ConnectivityTestB\003\340A" +
      "\002\"2\n\035DeleteConnectivityTestRequest\022\021\n\004na" +
      "me\030\001 \001(\tB\003\340A\002\"1\n\034RerunConnectivityTestRe" +
      "quest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"\326\001\n\021OperationMe" +
      "tadata\022/\n\013create_time\030\001 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\022\016\n\006target\030\003 \001(\t\022\014\n" +
      "\004verb\030\004 \001(\t\022\025\n\rstatus_detail\030\005 \001(\t\022\030\n\020ca" +
      "ncel_requested\030\006 \001(\010\022\023\n\013api_version\030\007 \001(" +
      "\t2\243\r\n\023ReachabilityService\022\355\001\n\025ListConnec" +
      "tivityTests\022D.google.cloud.networkmanage" +
      "ment.v1beta1.ListConnectivityTestsReques" +
      "t\032E.google.cloud.networkmanagement.v1bet" +
      "a1.ListConnectivityTestsResponse\"G\202\323\344\223\002A" +
      "\022?/v1beta1/{parent=projects/*/locations/" +
      "global}/connectivityTests\022\334\001\n\023GetConnect" +
      "ivityTest\022B.google.cloud.networkmanageme" +
      "nt.v1beta1.GetConnectivityTestRequest\0328." +
      "google.cloud.networkmanagement.v1beta1.C" +
      "onnectivityTest\"G\202\323\344\223\002A\022?/v1beta1/{name=" +
      "projects/*/locations/global/connectivity" +
      "Tests/*}\022\241\002\n\026CreateConnectivityTest\022E.go" +
      "ogle.cloud.networkmanagement.v1beta1.Cre" +
      "ateConnectivityTestRequest\032\035.google.long" +
      "running.Operation\"\240\001\202\323\344\223\002K\"?/v1beta1/{pa" +
      "rent=projects/*/locations/global}/connec" +
      "tivityTests:\010resource\312AL\n7google.cloud.n" +
      "etworkmanagement.v1beta1.ConnectivityTes" +
      "t\022\021OperationMetadata\022\252\002\n\026UpdateConnectiv" +
      "ityTest\022E.google.cloud.networkmanagement" +
      ".v1beta1.UpdateConnectivityTestRequest\032\035" +
      ".google.longrunning.Operation\"\251\001\202\323\344\223\002T2H" +
      "/v1beta1/{resource.name=projects/*/locat" +
      "ions/global/connectivityTests/*}:\010resour" +
      "ce\312AL\n7google.cloud.networkmanagement.v1" +
      "beta1.ConnectivityTest\022\021OperationMetadat" +
      "a\022\236\002\n\025RerunConnectivityTest\022D.google.clo" +
      "ud.networkmanagement.v1beta1.RerunConnec" +
      "tivityTestRequest\032\035.google.longrunning.O" +
      "peration\"\237\001\202\323\344\223\002J\"E/v1beta1/{name=projec" +
      "ts/*/locations/global/connectivityTests/" +
      "*}:rerun:\001*\312AL\n7google.cloud.networkmana" +
      "gement.v1beta1.ConnectivityTest\022\021Operati" +
      "onMetadata\022\364\001\n\026DeleteConnectivityTest\022E." +
      "google.cloud.networkmanagement.v1beta1.D" +
      "eleteConnectivityTestRequest\032\035.google.lo" +
      "ngrunning.Operation\"t\202\323\344\223\002A*?/v1beta1/{n" +
      "ame=projects/*/locations/global/connecti" +
      "vityTests/*}\312A*\n\025google.protobuf.Empty\022\021" +
      "OperationMetadata\032T\312A networkmanagement." +
      "googleapis.com\322A.https://www.googleapis." +
      "com/auth/cloud-platformB\237\002\n*com.google.c" +
      "loud.networkmanagement.v1beta1B\030Reachabi" +
      "lityServiceProtoP\001ZWgoogle.golang.org/ge" +
      "nproto/googleapis/cloud/networkmanagemen" +
      "t/v1beta1;networkmanagement\252\002&Google.Clo" +
      "ud.NetworkManagement.V1Beta1\312\002&Google\\Cl" +
      "oud\\NetworkManagement\\V1beta1\352\002)Google::" +
      "Cloud::NetworkManagement::V1beta1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.networkmanagement.v1beta1.TestOuterClass.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_descriptor,
        new java.lang.String[] { "Resources", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Parent", "TestId", "Resource", });
    internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "Resource", });
    internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusDetail", "CancelRequested", "ApiVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networkmanagement.v1beta1.TestOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
