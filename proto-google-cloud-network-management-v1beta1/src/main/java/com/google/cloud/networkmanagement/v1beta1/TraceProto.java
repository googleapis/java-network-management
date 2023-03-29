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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

package com.google.cloud.networkmanagement.v1beta1;

public final class TraceProto {
  private TraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_Trace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_Trace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_Step_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_InstanceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_InstanceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_NetworkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_NetworkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_FirewallInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_FirewallInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_RouteInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_RouteInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ForwardingRuleInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ForwardingRuleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerBackend_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerBackend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_VpnGatewayInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_VpnGatewayInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_VpnTunnelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_VpnTunnelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_EndpointInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_EndpointInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_DeliverInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_DeliverInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_ForwardInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ForwardInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_DropInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_DropInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_GKEMasterInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_GKEMasterInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_CloudSQLInstanceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_CloudSQLInstanceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_CloudFunctionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_CloudFunctionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1beta1_VpcConnectorInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_VpcConnectorInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/networkmanagement/v1beta1"
          + "/trace.proto\022&google.cloud.networkmanage"
          + "ment.v1beta1\"\221\001\n\005Trace\022K\n\rendpoint_info\030"
          + "\001 \001(\01324.google.cloud.networkmanagement.v"
          + "1beta1.EndpointInfo\022;\n\005steps\030\002 \003(\0132,.goo"
          + "gle.cloud.networkmanagement.v1beta1.Step"
          + "\"\242\020\n\004Step\022\023\n\013description\030\001 \001(\t\022A\n\005state\030"
          + "\002 \001(\01622.google.cloud.networkmanagement.v"
          + "1beta1.Step.State\022\023\n\013causes_drop\030\003 \001(\010\022\022"
          + "\n\nproject_id\030\004 \001(\t\022H\n\010instance\030\005 \001(\01324.g"
          + "oogle.cloud.networkmanagement.v1beta1.In"
          + "stanceInfoH\000\022H\n\010firewall\030\006 \001(\01324.google."
          + "cloud.networkmanagement.v1beta1.Firewall"
          + "InfoH\000\022B\n\005route\030\007 \001(\01321.google.cloud.net"
          + "workmanagement.v1beta1.RouteInfoH\000\022H\n\010en"
          + "dpoint\030\010 \001(\01324.google.cloud.networkmanag"
          + "ement.v1beta1.EndpointInfoH\000\022U\n\017forwardi"
          + "ng_rule\030\t \001(\0132:.google.cloud.networkmana"
          + "gement.v1beta1.ForwardingRuleInfoH\000\022M\n\013v"
          + "pn_gateway\030\n \001(\01326.google.cloud.networkm"
          + "anagement.v1beta1.VpnGatewayInfoH\000\022K\n\nvp"
          + "n_tunnel\030\013 \001(\01325.google.cloud.networkman"
          + "agement.v1beta1.VpnTunnelInfoH\000\022Q\n\rvpc_c"
          + "onnector\030\025 \001(\01328.google.cloud.networkman"
          + "agement.v1beta1.VpcConnectorInfoH\000\022F\n\007de"
          + "liver\030\014 \001(\01323.google.cloud.networkmanage"
          + "ment.v1beta1.DeliverInfoH\000\022F\n\007forward\030\r "
          + "\001(\01323.google.cloud.networkmanagement.v1b"
          + "eta1.ForwardInfoH\000\022B\n\005abort\030\016 \001(\01321.goog"
          + "le.cloud.networkmanagement.v1beta1.Abort"
          + "InfoH\000\022@\n\004drop\030\017 \001(\01320.google.cloud.netw"
          + "orkmanagement.v1beta1.DropInfoH\000\022Q\n\rload"
          + "_balancer\030\020 \001(\01328.google.cloud.networkma"
          + "nagement.v1beta1.LoadBalancerInfoH\000\022F\n\007n"
          + "etwork\030\021 \001(\01323.google.cloud.networkmanag"
          + "ement.v1beta1.NetworkInfoH\000\022K\n\ngke_maste"
          + "r\030\022 \001(\01325.google.cloud.networkmanagement"
          + ".v1beta1.GKEMasterInfoH\000\022Z\n\022cloud_sql_in"
          + "stance\030\023 \001(\0132<.google.cloud.networkmanag"
          + "ement.v1beta1.CloudSQLInstanceInfoH\000\022S\n\016"
          + "cloud_function\030\024 \001(\01329.google.cloud.netw"
          + "orkmanagement.v1beta1.CloudFunctionInfoH"
          + "\000\"\364\004\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\027\n\023ST"
          + "ART_FROM_INSTANCE\020\001\022\027\n\023START_FROM_INTERN"
          + "ET\020\002\022\036\n\032START_FROM_PRIVATE_NETWORK\020\003\022\031\n\025"
          + "START_FROM_GKE_MASTER\020\025\022!\n\035START_FROM_CL"
          + "OUD_SQL_INSTANCE\020\026\022\035\n\031START_FROM_CLOUD_F"
          + "UNCTION\020\027\022\037\n\033APPLY_INGRESS_FIREWALL_RULE"
          + "\020\004\022\036\n\032APPLY_EGRESS_FIREWALL_RULE\020\005\022\017\n\013AP"
          + "PLY_ROUTE\020\006\022\031\n\025APPLY_FORWARDING_RULE\020\007\022\025"
          + "\n\021SPOOFING_APPROVED\020\010\022\026\n\022ARRIVE_AT_INSTA"
          + "NCE\020\t\022$\n ARRIVE_AT_INTERNAL_LOAD_BALANCE"
          + "R\020\n\022$\n ARRIVE_AT_EXTERNAL_LOAD_BALANCER\020"
          + "\013\022\031\n\025ARRIVE_AT_VPN_GATEWAY\020\014\022\030\n\024ARRIVE_A"
          + "T_VPN_TUNNEL\020\r\022\033\n\027ARRIVE_AT_VPC_CONNECTO"
          + "R\020\030\022\007\n\003NAT\020\016\022\024\n\020PROXY_CONNECTION\020\017\022\013\n\007DE"
          + "LIVER\020\020\022\010\n\004DROP\020\021\022\013\n\007FORWARD\020\022\022\t\n\005ABORT\020"
          + "\023\022\035\n\031VIEWER_PERMISSION_MISSING\020\024B\013\n\tstep"
          + "_info\"\266\001\n\014InstanceInfo\022\024\n\014display_name\030\001"
          + " \001(\t\022\013\n\003uri\030\002 \001(\t\022\021\n\tinterface\030\003 \001(\t\022\023\n\013"
          + "network_uri\030\004 \001(\t\022\023\n\013internal_ip\030\005 \001(\t\022\023"
          + "\n\013external_ip\030\006 \001(\t\022\024\n\014network_tags\030\007 \003("
          + "\t\022\033\n\017service_account\030\010 \001(\tB\002\030\001\"J\n\013Networ"
          + "kInfo\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t"
          + "\022\030\n\020matched_ip_range\030\004 \001(\t\"\353\003\n\014FirewallI"
          + "nfo\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\021"
          + "\n\tdirection\030\003 \001(\t\022\016\n\006action\030\004 \001(\t\022\020\n\010pri"
          + "ority\030\005 \001(\005\022\023\n\013network_uri\030\006 \001(\t\022\023\n\013targ"
          + "et_tags\030\007 \003(\t\022\037\n\027target_service_accounts"
          + "\030\010 \003(\t\022\016\n\006policy\030\t \001(\t\022a\n\022firewall_rule_"
          + "type\030\n \001(\0162E.google.cloud.networkmanagem"
          + "ent.v1beta1.FirewallInfo.FirewallRuleTyp"
          + "e\"\304\001\n\020FirewallRuleType\022\"\n\036FIREWALL_RULE_"
          + "TYPE_UNSPECIFIED\020\000\022%\n!HIERARCHICAL_FIREW"
          + "ALL_POLICY_RULE\020\001\022\025\n\021VPC_FIREWALL_RULE\020\002"
          + "\022\035\n\031IMPLIED_VPC_FIREWALL_RULE\020\003\022/\n+SERVE"
          + "RLESS_VPC_ACCESS_MANAGED_FIREWALL_RULE\020\004"
          + "\"\201\006\n\tRouteInfo\022O\n\nroute_type\030\010 \001(\0162;.goo"
          + "gle.cloud.networkmanagement.v1beta1.Rout"
          + "eInfo.RouteType\022T\n\rnext_hop_type\030\t \001(\0162="
          + ".google.cloud.networkmanagement.v1beta1."
          + "RouteInfo.NextHopType\022\024\n\014display_name\030\001 "
          + "\001(\t\022\013\n\003uri\030\002 \001(\t\022\025\n\rdest_ip_range\030\003 \001(\t\022"
          + "\020\n\010next_hop\030\004 \001(\t\022\023\n\013network_uri\030\005 \001(\t\022\020"
          + "\n\010priority\030\006 \001(\005\022\025\n\rinstance_tags\030\007 \003(\t\""
          + "\211\001\n\tRouteType\022\032\n\026ROUTE_TYPE_UNSPECIFIED\020"
          + "\000\022\n\n\006SUBNET\020\001\022\n\n\006STATIC\020\002\022\013\n\007DYNAMIC\020\003\022\022"
          + "\n\016PEERING_SUBNET\020\004\022\022\n\016PEERING_STATIC\020\005\022\023"
          + "\n\017PEERING_DYNAMIC\020\006\"\266\002\n\013NextHopType\022\035\n\031N"
          + "EXT_HOP_TYPE_UNSPECIFIED\020\000\022\017\n\013NEXT_HOP_I"
          + "P\020\001\022\025\n\021NEXT_HOP_INSTANCE\020\002\022\024\n\020NEXT_HOP_N"
          + "ETWORK\020\003\022\024\n\020NEXT_HOP_PEERING\020\004\022\031\n\025NEXT_H"
          + "OP_INTERCONNECT\020\005\022\027\n\023NEXT_HOP_VPN_TUNNEL"
          + "\020\006\022\030\n\024NEXT_HOP_VPN_GATEWAY\020\007\022\035\n\031NEXT_HOP"
          + "_INTERNET_GATEWAY\020\010\022\026\n\022NEXT_HOP_BLACKHOL"
          + "E\020\t\022\020\n\014NEXT_HOP_ILB\020\n\022\035\n\031NEXT_HOP_ROUTER"
          + "_APPLIANCE\020\013\"\237\001\n\022ForwardingRuleInfo\022\024\n\014d"
          + "isplay_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\030\n\020matche"
          + "d_protocol\030\003 \001(\t\022\032\n\022matched_port_range\030\006"
          + " \001(\t\022\013\n\003vip\030\004 \001(\t\022\016\n\006target\030\005 \001(\t\022\023\n\013net"
          + "work_uri\030\007 \001(\t\"\270\004\n\020LoadBalancerInfo\022e\n\022l"
          + "oad_balancer_type\030\001 \001(\0162I.google.cloud.n"
          + "etworkmanagement.v1beta1.LoadBalancerInf"
          + "o.LoadBalancerType\022\030\n\020health_check_uri\030\002"
          + " \001(\t\022M\n\010backends\030\003 \003(\0132;.google.cloud.ne"
          + "tworkmanagement.v1beta1.LoadBalancerBack"
          + "end\022Z\n\014backend_type\030\004 \001(\0162D.google.cloud"
          + ".networkmanagement.v1beta1.LoadBalancerI"
          + "nfo.BackendType\022\023\n\013backend_uri\030\005 \001(\t\"\217\001\n"
          + "\020LoadBalancerType\022\"\n\036LOAD_BALANCER_TYPE_"
          + "UNSPECIFIED\020\000\022\024\n\020INTERNAL_TCP_UDP\020\001\022\023\n\017N"
          + "ETWORK_TCP_UDP\020\002\022\016\n\nHTTP_PROXY\020\003\022\r\n\tTCP_"
          + "PROXY\020\004\022\r\n\tSSL_PROXY\020\005\"Q\n\013BackendType\022\034\n"
          + "\030BACKEND_TYPE_UNSPECIFIED\020\000\022\023\n\017BACKEND_S"
          + "ERVICE\020\001\022\017\n\013TARGET_POOL\020\002\"\373\002\n\023LoadBalanc"
          + "erBackend\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002"
          + " \001(\t\022y\n\033health_check_firewall_state\030\003 \001("
          + "\0162T.google.cloud.networkmanagement.v1bet"
          + "a1.LoadBalancerBackend.HealthCheckFirewa"
          + "llState\022,\n$health_check_allowing_firewal"
          + "l_rules\030\004 \003(\t\022,\n$health_check_blocking_f"
          + "irewall_rules\030\005 \003(\t\"j\n\030HealthCheckFirewa"
          + "llState\022+\n\'HEALTH_CHECK_FIREWALL_STATE_U"
          + "NSPECIFIED\020\000\022\016\n\nCONFIGURED\020\001\022\021\n\rMISCONFI"
          + "GURED\020\002\"\204\001\n\016VpnGatewayInfo\022\024\n\014display_na"
          + "me\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\023\n\013network_uri\030\003 \001"
          + "(\t\022\022\n\nip_address\030\004 \001(\t\022\026\n\016vpn_tunnel_uri"
          + "\030\005 \001(\t\022\016\n\006region\030\006 \001(\t\"\363\002\n\rVpnTunnelInfo"
          + "\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\026\n\016s"
          + "ource_gateway\030\003 \001(\t\022\026\n\016remote_gateway\030\004 "
          + "\001(\t\022\031\n\021remote_gateway_ip\030\005 \001(\t\022\031\n\021source"
          + "_gateway_ip\030\006 \001(\t\022\023\n\013network_uri\030\007 \001(\t\022\016"
          + "\n\006region\030\010 \001(\t\022W\n\014routing_type\030\t \001(\0162A.g"
          + "oogle.cloud.networkmanagement.v1beta1.Vp"
          + "nTunnelInfo.RoutingType\"[\n\013RoutingType\022\034"
          + "\n\030ROUTING_TYPE_UNSPECIFIED\020\000\022\017\n\013ROUTE_BA"
          + "SED\020\001\022\020\n\014POLICY_BASED\020\002\022\013\n\007DYNAMIC\020\003\"\321\001\n"
          + "\014EndpointInfo\022\021\n\tsource_ip\030\001 \001(\t\022\026\n\016dest"
          + "ination_ip\030\002 \001(\t\022\020\n\010protocol\030\003 \001(\t\022\023\n\013so"
          + "urce_port\030\004 \001(\005\022\030\n\020destination_port\030\005 \001("
          + "\005\022\032\n\022source_network_uri\030\006 \001(\t\022\037\n\027destina"
          + "tion_network_uri\030\007 \001(\t\022\030\n\020source_agent_u"
          + "ri\030\010 \001(\t\"\245\002\n\013DeliverInfo\022J\n\006target\030\001 \001(\016"
          + "2:.google.cloud.networkmanagement.v1beta"
          + "1.DeliverInfo.Target\022\024\n\014resource_uri\030\002 \001"
          + "(\t\"\263\001\n\006Target\022\026\n\022TARGET_UNSPECIFIED\020\000\022\014\n"
          + "\010INSTANCE\020\001\022\014\n\010INTERNET\020\002\022\016\n\nGOOGLE_API\020"
          + "\003\022\016\n\nGKE_MASTER\020\004\022\026\n\022CLOUD_SQL_INSTANCE\020"
          + "\005\022\031\n\025PSC_PUBLISHED_SERVICE\020\006\022\022\n\016PSC_GOOG"
          + "LE_API\020\007\022\016\n\nPSC_VPC_SC\020\010\"\222\002\n\013ForwardInfo"
          + "\022J\n\006target\030\001 \001(\0162:.google.cloud.networkm"
          + "anagement.v1beta1.ForwardInfo.Target\022\024\n\014"
          + "resource_uri\030\002 \001(\t\"\240\001\n\006Target\022\026\n\022TARGET_"
          + "UNSPECIFIED\020\000\022\017\n\013PEERING_VPC\020\001\022\017\n\013VPN_GA"
          + "TEWAY\020\002\022\020\n\014INTERCONNECT\020\003\022\016\n\nGKE_MASTER\020"
          + "\004\022\"\n\036IMPORTED_CUSTOM_ROUTE_NEXT_HOP\020\005\022\026\n"
          + "\022CLOUD_SQL_INSTANCE\020\006\"\235\004\n\tAbortInfo\022F\n\005c"
          + "ause\030\001 \001(\01627.google.cloud.networkmanagem"
          + "ent.v1beta1.AbortInfo.Cause\022\024\n\014resource_"
          + "uri\030\002 \001(\t\022#\n\033projects_missing_permission"
          + "\030\003 \003(\t\"\214\003\n\005Cause\022\025\n\021CAUSE_UNSPECIFIED\020\000\022"
          + "\023\n\017UNKNOWN_NETWORK\020\001\022\016\n\nUNKNOWN_IP\020\002\022\023\n\017"
          + "UNKNOWN_PROJECT\020\003\022\025\n\021PERMISSION_DENIED\020\004"
          + "\022\026\n\022NO_SOURCE_LOCATION\020\005\022\024\n\020INVALID_ARGU"
          + "MENT\020\006\022\022\n\016NO_EXTERNAL_IP\020\007\022\032\n\026UNINTENDED"
          + "_DESTINATION\020\010\022\022\n\016TRACE_TOO_LONG\020\t\022\022\n\016IN"
          + "TERNAL_ERROR\020\n\022\035\n\031SOURCE_ENDPOINT_NOT_FO"
          + "UND\020\013\022\035\n\031MISMATCHED_SOURCE_NETWORK\020\014\022\"\n\036"
          + "DESTINATION_ENDPOINT_NOT_FOUND\020\r\022\"\n\036MISM"
          + "ATCHED_DESTINATION_NETWORK\020\016\022\017\n\013UNSUPPOR"
          + "TED\020\017\"\276\007\n\010DropInfo\022E\n\005cause\030\001 \001(\01626.goog"
          + "le.cloud.networkmanagement.v1beta1.DropI"
          + "nfo.Cause\022\024\n\014resource_uri\030\002 \001(\t\"\324\006\n\005Caus"
          + "e\022\025\n\021CAUSE_UNSPECIFIED\020\000\022\034\n\030UNKNOWN_EXTE"
          + "RNAL_ADDRESS\020\001\022\031\n\025FOREIGN_IP_DISALLOWED\020"
          + "\002\022\021\n\rFIREWALL_RULE\020\003\022\014\n\010NO_ROUTE\020\004\022\023\n\017RO"
          + "UTE_BLACKHOLE\020\005\022\027\n\023ROUTE_WRONG_NETWORK\020\006"
          + "\022\037\n\033PRIVATE_TRAFFIC_TO_INTERNET\020\007\022$\n PRI"
          + "VATE_GOOGLE_ACCESS_DISALLOWED\020\010\022\027\n\023NO_EX"
          + "TERNAL_ADDRESS\020\t\022\034\n\030UNKNOWN_INTERNAL_ADD"
          + "RESS\020\n\022\034\n\030FORWARDING_RULE_MISMATCH\020\013\022 \n\034"
          + "FORWARDING_RULE_NO_INSTANCES\020\014\0228\n4FIREWA"
          + "LL_BLOCKING_LOAD_BALANCER_BACKEND_HEALTH"
          + "_CHECK\020\r\022\030\n\024INSTANCE_NOT_RUNNING\020\016\022\030\n\024TR"
          + "AFFIC_TYPE_BLOCKED\020\017\022\"\n\036GKE_MASTER_UNAUT"
          + "HORIZED_ACCESS\020\020\022*\n&CLOUD_SQL_INSTANCE_U"
          + "NAUTHORIZED_ACCESS\020\021\022\036\n\032DROPPED_INSIDE_G"
          + "KE_SERVICE\020\022\022$\n DROPPED_INSIDE_CLOUD_SQL"
          + "_SERVICE\020\023\022%\n!GOOGLE_MANAGED_SERVICE_NO_"
          + "PEERING\020\024\022$\n CLOUD_SQL_INSTANCE_NO_IP_AD"
          + "DRESS\020\025\022\035\n\031CLOUD_FUNCTION_NOT_ACTIVE\020\026\022\031"
          + "\n\025VPC_CONNECTOR_NOT_SET\020\027\022\035\n\031VPC_CONNECT"
          + "OR_NOT_RUNNING\020\030\022#\n\037FORWARDING_RULE_REGI"
          + "ON_MISMATCH\020\031\022\037\n\033PSC_CONNECTION_NOT_ACCE"
          + "PTED\020\032\"k\n\rGKEMasterInfo\022\023\n\013cluster_uri\030\002"
          + " \001(\t\022\033\n\023cluster_network_uri\030\004 \001(\t\022\023\n\013int"
          + "ernal_ip\030\005 \001(\t\022\023\n\013external_ip\030\006 \001(\t\"\210\001\n\024"
          + "CloudSQLInstanceInfo\022\024\n\014display_name\030\001 \001"
          + "(\t\022\013\n\003uri\030\002 \001(\t\022\023\n\013network_uri\030\004 \001(\t\022\023\n\013"
          + "internal_ip\030\005 \001(\t\022\023\n\013external_ip\030\006 \001(\t\022\016"
          + "\n\006region\030\007 \001(\t\"\\\n\021CloudFunctionInfo\022\024\n\014d"
          + "isplay_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\020\n\010locati"
          + "on\030\003 \001(\t\022\022\n\nversion_id\030\004 \001(\003\"G\n\020VpcConne"
          + "ctorInfo\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 "
          + "\001(\t\022\020\n\010location\030\003 \001(\tB\222\002\n*com.google.clo"
          + "ud.networkmanagement.v1beta1B\nTraceProto"
          + "P\001ZXcloud.google.com/go/networkmanagemen"
          + "t/apiv1beta1/networkmanagementpb;network"
          + "managementpb\252\002&Google.Cloud.NetworkManag"
          + "ement.V1Beta1\312\002&Google\\Cloud\\NetworkMana"
          + "gement\\V1beta1\352\002)Google::Cloud::NetworkM"
          + "anagement::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_networkmanagement_v1beta1_Trace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_Trace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_Trace_descriptor,
            new java.lang.String[] {
              "EndpointInfo", "Steps",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_Step_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1beta1_Step_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_Step_descriptor,
            new java.lang.String[] {
              "Description",
              "State",
              "CausesDrop",
              "ProjectId",
              "Instance",
              "Firewall",
              "Route",
              "Endpoint",
              "ForwardingRule",
              "VpnGateway",
              "VpnTunnel",
              "VpcConnector",
              "Deliver",
              "Forward",
              "Abort",
              "Drop",
              "LoadBalancer",
              "Network",
              "GkeMaster",
              "CloudSqlInstance",
              "CloudFunction",
              "StepInfo",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_InstanceInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1beta1_InstanceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_InstanceInfo_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Uri",
              "Interface",
              "NetworkUri",
              "InternalIp",
              "ExternalIp",
              "NetworkTags",
              "ServiceAccount",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_NetworkInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1beta1_NetworkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_NetworkInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Uri", "MatchedIpRange",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_FirewallInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1beta1_FirewallInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_FirewallInfo_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Uri",
              "Direction",
              "Action",
              "Priority",
              "NetworkUri",
              "TargetTags",
              "TargetServiceAccounts",
              "Policy",
              "FirewallRuleType",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_RouteInfo_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1beta1_RouteInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_RouteInfo_descriptor,
            new java.lang.String[] {
              "RouteType",
              "NextHopType",
              "DisplayName",
              "Uri",
              "DestIpRange",
              "NextHop",
              "NetworkUri",
              "Priority",
              "InstanceTags",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ForwardingRuleInfo_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkmanagement_v1beta1_ForwardingRuleInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ForwardingRuleInfo_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Uri",
              "MatchedProtocol",
              "MatchedPortRange",
              "Vip",
              "Target",
              "NetworkUri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerInfo_descriptor,
            new java.lang.String[] {
              "LoadBalancerType", "HealthCheckUri", "Backends", "BackendType", "BackendUri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerBackend_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerBackend_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_LoadBalancerBackend_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Uri",
              "HealthCheckFirewallState",
              "HealthCheckAllowingFirewallRules",
              "HealthCheckBlockingFirewallRules",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_VpnGatewayInfo_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_networkmanagement_v1beta1_VpnGatewayInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_VpnGatewayInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Uri", "NetworkUri", "IpAddress", "VpnTunnelUri", "Region",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_VpnTunnelInfo_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_networkmanagement_v1beta1_VpnTunnelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_VpnTunnelInfo_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Uri",
              "SourceGateway",
              "RemoteGateway",
              "RemoteGatewayIp",
              "SourceGatewayIp",
              "NetworkUri",
              "Region",
              "RoutingType",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_EndpointInfo_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_networkmanagement_v1beta1_EndpointInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_EndpointInfo_descriptor,
            new java.lang.String[] {
              "SourceIp",
              "DestinationIp",
              "Protocol",
              "SourcePort",
              "DestinationPort",
              "SourceNetworkUri",
              "DestinationNetworkUri",
              "SourceAgentUri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_DeliverInfo_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_networkmanagement_v1beta1_DeliverInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_DeliverInfo_descriptor,
            new java.lang.String[] {
              "Target", "ResourceUri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_ForwardInfo_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_networkmanagement_v1beta1_ForwardInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_ForwardInfo_descriptor,
            new java.lang.String[] {
              "Target", "ResourceUri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_descriptor,
            new java.lang.String[] {
              "Cause", "ResourceUri", "ProjectsMissingPermission",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_DropInfo_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_networkmanagement_v1beta1_DropInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_DropInfo_descriptor,
            new java.lang.String[] {
              "Cause", "ResourceUri",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_GKEMasterInfo_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_networkmanagement_v1beta1_GKEMasterInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_GKEMasterInfo_descriptor,
            new java.lang.String[] {
              "ClusterUri", "ClusterNetworkUri", "InternalIp", "ExternalIp",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_CloudSQLInstanceInfo_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_networkmanagement_v1beta1_CloudSQLInstanceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_CloudSQLInstanceInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Uri", "NetworkUri", "InternalIp", "ExternalIp", "Region",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_CloudFunctionInfo_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_networkmanagement_v1beta1_CloudFunctionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_CloudFunctionInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Uri", "Location", "VersionId",
            });
    internal_static_google_cloud_networkmanagement_v1beta1_VpcConnectorInfo_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_networkmanagement_v1beta1_VpcConnectorInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1beta1_VpcConnectorInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Uri", "Location",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
