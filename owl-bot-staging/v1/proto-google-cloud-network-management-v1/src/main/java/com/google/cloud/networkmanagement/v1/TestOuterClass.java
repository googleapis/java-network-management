// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1/connectivity_test.proto

package com.google.cloud.networkmanagement.v1;

public final class TestOuterClass {
  private TestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/networkmanagement/v1/conn" +
      "ectivity_test.proto\022!google.cloud.networ" +
      "kmanagement.v1\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032-goog" +
      "le/cloud/networkmanagement/v1/trace.prot" +
      "o\032\037google/protobuf/timestamp.proto\032\027goog" +
      "le/rpc/status.proto\"\307\005\n\020ConnectivityTest" +
      "\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\023\n\013description\030\002 \001(\t" +
      "\022@\n\006source\030\003 \001(\0132+.google.cloud.networkm" +
      "anagement.v1.EndpointB\003\340A\002\022E\n\013destinatio" +
      "n\030\004 \001(\0132+.google.cloud.networkmanagement" +
      ".v1.EndpointB\003\340A\002\022\020\n\010protocol\030\005 \001(\t\022\030\n\020r" +
      "elated_projects\030\006 \003(\t\022\031\n\014display_name\030\007 " +
      "\001(\tB\003\340A\003\022O\n\006labels\030\010 \003(\0132?.google.cloud." +
      "networkmanagement.v1.ConnectivityTest.La" +
      "belsEntry\0224\n\013create_time\030\n \001(\0132\032.google." +
      "protobuf.TimestampB\003\340A\003\0224\n\013update_time\030\013" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022Y\n" +
      "\024reachability_details\030\014 \001(\01326.google.clo" +
      "ud.networkmanagement.v1.ReachabilityDeta" +
      "ilsB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001:t\352Aq\n1networkmanagement." +
      "googleapis.com/ConnectivityTest\022<project" +
      "s/{project}/locations/global/connectivit" +
      "yTests/{test}\"\275\002\n\010Endpoint\022\022\n\nip_address" +
      "\030\001 \001(\t\022\014\n\004port\030\002 \001(\005\022\020\n\010instance\030\003 \001(\t\022\032" +
      "\n\022gke_master_cluster\030\007 \001(\t\022\032\n\022cloud_sql_" +
      "instance\030\010 \001(\t\022\017\n\007network\030\004 \001(\t\022M\n\014netwo" +
      "rk_type\030\005 \001(\01627.google.cloud.networkmana" +
      "gement.v1.Endpoint.NetworkType\022\022\n\nprojec" +
      "t_id\030\006 \001(\t\"Q\n\013NetworkType\022\034\n\030NETWORK_TYP" +
      "E_UNSPECIFIED\020\000\022\017\n\013GCP_NETWORK\020\001\022\023\n\017NON_" +
      "GCP_NETWORK\020\002\"\325\002\n\023ReachabilityDetails\022M\n" +
      "\006result\030\001 \001(\0162=.google.cloud.networkmana" +
      "gement.v1.ReachabilityDetails.Result\022/\n\013" +
      "verify_time\030\002 \001(\0132\032.google.protobuf.Time" +
      "stamp\022!\n\005error\030\003 \001(\0132\022.google.rpc.Status" +
      "\0228\n\006traces\030\005 \003(\0132(.google.cloud.networkm" +
      "anagement.v1.Trace\"a\n\006Result\022\026\n\022RESULT_U" +
      "NSPECIFIED\020\000\022\r\n\tREACHABLE\020\001\022\017\n\013UNREACHAB" +
      "LE\020\002\022\r\n\tAMBIGUOUS\020\004\022\020\n\014UNDETERMINED\020\005B\374\001" +
      "\n%com.google.cloud.networkmanagement.v1B" +
      "\016TestOuterClassP\001ZRgoogle.golang.org/gen" +
      "proto/googleapis/cloud/networkmanagement" +
      "/v1;networkmanagement\252\002!Google.Cloud.Net" +
      "workManagement.V1\312\002!Google\\Cloud\\Network" +
      "Management\\V1\352\002$Google::Cloud::NetworkMa" +
      "nagement::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.networkmanagement.v1.TraceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor,
        new java.lang.String[] { "Name", "Description", "Source", "Destination", "Protocol", "RelatedProjects", "DisplayName", "Labels", "CreateTime", "UpdateTime", "ReachabilityDetails", });
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_descriptor =
      internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1_ConnectivityTest_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1_Endpoint_descriptor,
        new java.lang.String[] { "IpAddress", "Port", "Instance", "GkeMasterCluster", "CloudSqlInstance", "Network", "NetworkType", "ProjectId", });
    internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1_ReachabilityDetails_descriptor,
        new java.lang.String[] { "Result", "VerifyTime", "Error", "Traces", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networkmanagement.v1.TraceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
