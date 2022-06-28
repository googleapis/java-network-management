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

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/networkmanagement/v1beta1"
          + "/trace.proto\022&google.cloud.networkmanage"
          + "ment.v1beta1\032\034google/api/annotations.pro"
          + "to\"\221\001\n\005Trace\022K\n\rendpoint_info\030\001 \001(\01324.go"
          + "ogle.cloud.networkmanagement.v1beta1.End"
          + "pointInfo\022;\n\005steps\030\002 \003(\0132,.google.cloud."
          + "networkmanagement.v1beta1.Step\"\276\016\n\004Step\022"
          + "\023\n\013description\030\001 \001(\t\022A\n\005state\030\002 \001(\01622.go"
          + "ogle.cloud.networkmanagement.v1beta1.Ste"
          + "p.State\022\023\n\013causes_drop\030\003 \001(\010\022\022\n\nproject_"
          + "id\030\004 \001(\t\022H\n\010instance\030\005 \001(\01324.google.clou"
          + "d.networkmanagement.v1beta1.InstanceInfo"
          + "H\000\022H\n\010firewall\030\006 \001(\01324.google.cloud.netw"
          + "orkmanagement.v1beta1.FirewallInfoH\000\022B\n\005"
          + "route\030\007 \001(\01321.google.cloud.networkmanage"
          + "ment.v1beta1.RouteInfoH\000\022H\n\010endpoint\030\010 \001"
          + "(\01324.google.cloud.networkmanagement.v1be"
          + "ta1.EndpointInfoH\000\022U\n\017forwarding_rule\030\t "
          + "\001(\0132:.google.cloud.networkmanagement.v1b"
          + "eta1.ForwardingRuleInfoH\000\022M\n\013vpn_gateway"
          + "\030\n \001(\01326.google.cloud.networkmanagement."
          + "v1beta1.VpnGatewayInfoH\000\022K\n\nvpn_tunnel\030\013"
          + " \001(\01325.google.cloud.networkmanagement.v1"
          + "beta1.VpnTunnelInfoH\000\022F\n\007deliver\030\014 \001(\01323"
          + ".google.cloud.networkmanagement.v1beta1."
          + "DeliverInfoH\000\022F\n\007forward\030\r \001(\01323.google."
          + "cloud.networkmanagement.v1beta1.ForwardI"
          + "nfoH\000\022B\n\005abort\030\016 \001(\01321.google.cloud.netw"
          + "orkmanagement.v1beta1.AbortInfoH\000\022@\n\004dro"
          + "p\030\017 \001(\01320.google.cloud.networkmanagement"
          + ".v1beta1.DropInfoH\000\022Q\n\rload_balancer\030\020 \001"
          + "(\01328.google.cloud.networkmanagement.v1be"
          + "ta1.LoadBalancerInfoH\000\022F\n\007network\030\021 \001(\0132"
          + "3.google.cloud.networkmanagement.v1beta1"
          + ".NetworkInfoH\000\022K\n\ngke_master\030\022 \001(\01325.goo"
          + "gle.cloud.networkmanagement.v1beta1.GKEM"
          + "asterInfoH\000\022Z\n\022cloud_sql_instance\030\023 \001(\0132"
          + "<.google.cloud.networkmanagement.v1beta1"
          + ".CloudSQLInstanceInfoH\000\"\270\004\n\005State\022\025\n\021STA"
          + "TE_UNSPECIFIED\020\000\022\027\n\023START_FROM_INSTANCE\020"
          + "\001\022\027\n\023START_FROM_INTERNET\020\002\022\036\n\032START_FROM"
          + "_PRIVATE_NETWORK\020\003\022\031\n\025START_FROM_GKE_MAS"
          + "TER\020\025\022!\n\035START_FROM_CLOUD_SQL_INSTANCE\020\026"
          + "\022\037\n\033APPLY_INGRESS_FIREWALL_RULE\020\004\022\036\n\032APP"
          + "LY_EGRESS_FIREWALL_RULE\020\005\022\017\n\013APPLY_ROUTE"
          + "\020\006\022\031\n\025APPLY_FORWARDING_RULE\020\007\022\025\n\021SPOOFIN"
          + "G_APPROVED\020\010\022\026\n\022ARRIVE_AT_INSTANCE\020\t\022$\n "
          + "ARRIVE_AT_INTERNAL_LOAD_BALANCER\020\n\022$\n AR"
          + "RIVE_AT_EXTERNAL_LOAD_BALANCER\020\013\022\031\n\025ARRI"
          + "VE_AT_VPN_GATEWAY\020\014\022\030\n\024ARRIVE_AT_VPN_TUN"
          + "NEL\020\r\022\007\n\003NAT\020\016\022\024\n\020PROXY_CONNECTION\020\017\022\013\n\007"
          + "DELIVER\020\020\022\010\n\004DROP\020\021\022\013\n\007FORWARD\020\022\022\t\n\005ABOR"
          + "T\020\023\022\035\n\031VIEWER_PERMISSION_MISSING\020\024B\013\n\tst"
          + "ep_info\"\266\001\n\014InstanceInfo\022\024\n\014display_name"
          + "\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\021\n\tinterface\030\003 \001(\t\022\023"
          + "\n\013network_uri\030\004 \001(\t\022\023\n\013internal_ip\030\005 \001(\t"
          + "\022\023\n\013external_ip\030\006 \001(\t\022\024\n\014network_tags\030\007 "
          + "\003(\t\022\033\n\017service_account\030\010 \001(\tB\002\030\001\"J\n\013Netw"
          + "orkInfo\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001"
          + "(\t\022\030\n\020matched_ip_range\030\004 \001(\t\"\272\003\n\014Firewal"
          + "lInfo\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t"
          + "\022\021\n\tdirection\030\003 \001(\t\022\016\n\006action\030\004 \001(\t\022\020\n\010p"
          + "riority\030\005 \001(\005\022\023\n\013network_uri\030\006 \001(\t\022\023\n\013ta"
          + "rget_tags\030\007 \003(\t\022\037\n\027target_service_accoun"
          + "ts\030\010 \003(\t\022\016\n\006policy\030\t \001(\t\022a\n\022firewall_rul"
          + "e_type\030\n \001(\0162E.google.cloud.networkmanag"
          + "ement.v1beta1.FirewallInfo.FirewallRuleT"
          + "ype\"\223\001\n\020FirewallRuleType\022\"\n\036FIREWALL_RUL"
          + "E_TYPE_UNSPECIFIED\020\000\022%\n!HIERARCHICAL_FIR"
          + "EWALL_POLICY_RULE\020\001\022\025\n\021VPC_FIREWALL_RULE"
          + "\020\002\022\035\n\031IMPLIED_VPC_FIREWALL_RULE\020\003\"\342\005\n\tRo"
          + "uteInfo\022O\n\nroute_type\030\010 \001(\0162;.google.clo"
          + "ud.networkmanagement.v1beta1.RouteInfo.R"
          + "outeType\022T\n\rnext_hop_type\030\t \001(\0162=.google"
          + ".cloud.networkmanagement.v1beta1.RouteIn"
          + "fo.NextHopType\022\024\n\014display_name\030\001 \001(\t\022\013\n\003"
          + "uri\030\002 \001(\t\022\025\n\rdest_ip_range\030\003 \001(\t\022\020\n\010next"
          + "_hop\030\004 \001(\t\022\023\n\013network_uri\030\005 \001(\t\022\020\n\010prior"
          + "ity\030\006 \001(\005\022\025\n\rinstance_tags\030\007 \003(\t\"\211\001\n\tRou"
          + "teType\022\032\n\026ROUTE_TYPE_UNSPECIFIED\020\000\022\n\n\006SU"
          + "BNET\020\001\022\n\n\006STATIC\020\002\022\013\n\007DYNAMIC\020\003\022\022\n\016PEERI"
          + "NG_SUBNET\020\004\022\022\n\016PEERING_STATIC\020\005\022\023\n\017PEERI"
          + "NG_DYNAMIC\020\006\"\227\002\n\013NextHopType\022\035\n\031NEXT_HOP"
          + "_TYPE_UNSPECIFIED\020\000\022\017\n\013NEXT_HOP_IP\020\001\022\025\n\021"
          + "NEXT_HOP_INSTANCE\020\002\022\024\n\020NEXT_HOP_NETWORK\020"
          + "\003\022\024\n\020NEXT_HOP_PEERING\020\004\022\031\n\025NEXT_HOP_INTE"
          + "RCONNECT\020\005\022\027\n\023NEXT_HOP_VPN_TUNNEL\020\006\022\030\n\024N"
          + "EXT_HOP_VPN_GATEWAY\020\007\022\035\n\031NEXT_HOP_INTERN"
          + "ET_GATEWAY\020\010\022\026\n\022NEXT_HOP_BLACKHOLE\020\t\022\020\n\014"
          + "NEXT_HOP_ILB\020\n\"\237\001\n\022ForwardingRuleInfo\022\024\n"
          + "\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\030\n\020matc"
          + "hed_protocol\030\003 \001(\t\022\032\n\022matched_port_range"
          + "\030\006 \001(\t\022\013\n\003vip\030\004 \001(\t\022\016\n\006target\030\005 \001(\t\022\023\n\013n"
          + "etwork_uri\030\007 \001(\t\"\270\004\n\020LoadBalancerInfo\022e\n"
          + "\022load_balancer_type\030\001 \001(\0162I.google.cloud"
          + ".networkmanagement.v1beta1.LoadBalancerI"
          + "nfo.LoadBalancerType\022\030\n\020health_check_uri"
          + "\030\002 \001(\t\022M\n\010backends\030\003 \003(\0132;.google.cloud."
          + "networkmanagement.v1beta1.LoadBalancerBa"
          + "ckend\022Z\n\014backend_type\030\004 \001(\0162D.google.clo"
          + "ud.networkmanagement.v1beta1.LoadBalance"
          + "rInfo.BackendType\022\023\n\013backend_uri\030\005 \001(\t\"\217"
          + "\001\n\020LoadBalancerType\022\"\n\036LOAD_BALANCER_TYP"
          + "E_UNSPECIFIED\020\000\022\024\n\020INTERNAL_TCP_UDP\020\001\022\023\n"
          + "\017NETWORK_TCP_UDP\020\002\022\016\n\nHTTP_PROXY\020\003\022\r\n\tTC"
          + "P_PROXY\020\004\022\r\n\tSSL_PROXY\020\005\"Q\n\013BackendType\022"
          + "\034\n\030BACKEND_TYPE_UNSPECIFIED\020\000\022\023\n\017BACKEND"
          + "_SERVICE\020\001\022\017\n\013TARGET_POOL\020\002\"\373\002\n\023LoadBala"
          + "ncerBackend\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri"
          + "\030\002 \001(\t\022y\n\033health_check_firewall_state\030\003 "
          + "\001(\0162T.google.cloud.networkmanagement.v1b"
          + "eta1.LoadBalancerBackend.HealthCheckFire"
          + "wallState\022,\n$health_check_allowing_firew"
          + "all_rules\030\004 \003(\t\022,\n$health_check_blocking"
          + "_firewall_rules\030\005 \003(\t\"j\n\030HealthCheckFire"
          + "wallState\022+\n\'HEALTH_CHECK_FIREWALL_STATE"
          + "_UNSPECIFIED\020\000\022\016\n\nCONFIGURED\020\001\022\021\n\rMISCON"
          + "FIGURED\020\002\"\204\001\n\016VpnGatewayInfo\022\024\n\014display_"
          + "name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\023\n\013network_uri\030\003"
          + " \001(\t\022\022\n\nip_address\030\004 \001(\t\022\026\n\016vpn_tunnel_u"
          + "ri\030\005 \001(\t\022\016\n\006region\030\006 \001(\t\"\363\002\n\rVpnTunnelIn"
          + "fo\022\024\n\014display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\026\n"
          + "\016source_gateway\030\003 \001(\t\022\026\n\016remote_gateway\030"
          + "\004 \001(\t\022\031\n\021remote_gateway_ip\030\005 \001(\t\022\031\n\021sour"
          + "ce_gateway_ip\030\006 \001(\t\022\023\n\013network_uri\030\007 \001(\t"
          + "\022\016\n\006region\030\010 \001(\t\022W\n\014routing_type\030\t \001(\0162A"
          + ".google.cloud.networkmanagement.v1beta1."
          + "VpnTunnelInfo.RoutingType\"[\n\013RoutingType"
          + "\022\034\n\030ROUTING_TYPE_UNSPECIFIED\020\000\022\017\n\013ROUTE_"
          + "BASED\020\001\022\020\n\014POLICY_BASED\020\002\022\013\n\007DYNAMIC\020\003\"\267"
          + "\001\n\014EndpointInfo\022\021\n\tsource_ip\030\001 \001(\t\022\026\n\016de"
          + "stination_ip\030\002 \001(\t\022\020\n\010protocol\030\003 \001(\t\022\023\n\013"
          + "source_port\030\004 \001(\005\022\030\n\020destination_port\030\005 "
          + "\001(\005\022\032\n\022source_network_uri\030\006 \001(\t\022\037\n\027desti"
          + "nation_network_uri\030\007 \001(\t\"\345\001\n\013DeliverInfo"
          + "\022J\n\006target\030\001 \001(\0162:.google.cloud.networkm"
          + "anagement.v1beta1.DeliverInfo.Target\022\024\n\014"
          + "resource_uri\030\002 \001(\t\"t\n\006Target\022\026\n\022TARGET_U"
          + "NSPECIFIED\020\000\022\014\n\010INSTANCE\020\001\022\014\n\010INTERNET\020\002"
          + "\022\016\n\nGOOGLE_API\020\003\022\016\n\nGKE_MASTER\020\004\022\026\n\022CLOU"
          + "D_SQL_INSTANCE\020\005\"\222\002\n\013ForwardInfo\022J\n\006targ"
          + "et\030\001 \001(\0162:.google.cloud.networkmanagemen"
          + "t.v1beta1.ForwardInfo.Target\022\024\n\014resource"
          + "_uri\030\002 \001(\t\"\240\001\n\006Target\022\026\n\022TARGET_UNSPECIF"
          + "IED\020\000\022\017\n\013PEERING_VPC\020\001\022\017\n\013VPN_GATEWAY\020\002\022"
          + "\020\n\014INTERCONNECT\020\003\022\016\n\nGKE_MASTER\020\004\022\"\n\036IMP"
          + "ORTED_CUSTOM_ROUTE_NEXT_HOP\020\005\022\026\n\022CLOUD_S"
          + "QL_INSTANCE\020\006\"\214\004\n\tAbortInfo\022F\n\005cause\030\001 \001"
          + "(\01627.google.cloud.networkmanagement.v1be"
          + "ta1.AbortInfo.Cause\022\024\n\014resource_uri\030\002 \001("
          + "\t\022#\n\033projects_missing_permission\030\003 \003(\t\"\373"
          + "\002\n\005Cause\022\025\n\021CAUSE_UNSPECIFIED\020\000\022\023\n\017UNKNO"
          + "WN_NETWORK\020\001\022\016\n\nUNKNOWN_IP\020\002\022\023\n\017UNKNOWN_"
          + "PROJECT\020\003\022\025\n\021PERMISSION_DENIED\020\004\022\026\n\022NO_S"
          + "OURCE_LOCATION\020\005\022\024\n\020INVALID_ARGUMENT\020\006\022\022"
          + "\n\016NO_EXTERNAL_IP\020\007\022\032\n\026UNINTENDED_DESTINA"
          + "TION\020\010\022\022\n\016TRACE_TOO_LONG\020\t\022\022\n\016INTERNAL_E"
          + "RROR\020\n\022\035\n\031SOURCE_ENDPOINT_NOT_FOUND\020\013\022\035\n"
          + "\031MISMATCHED_SOURCE_NETWORK\020\014\022\"\n\036DESTINAT"
          + "ION_ENDPOINT_NOT_FOUND\020\r\022\"\n\036MISMATCHED_D"
          + "ESTINATION_NETWORK\020\016\"\237\006\n\010DropInfo\022E\n\005cau"
          + "se\030\001 \001(\01626.google.cloud.networkmanagemen"
          + "t.v1beta1.DropInfo.Cause\022\024\n\014resource_uri"
          + "\030\002 \001(\t\"\265\005\n\005Cause\022\025\n\021CAUSE_UNSPECIFIED\020\000\022"
          + "\034\n\030UNKNOWN_EXTERNAL_ADDRESS\020\001\022\031\n\025FOREIGN"
          + "_IP_DISALLOWED\020\002\022\021\n\rFIREWALL_RULE\020\003\022\014\n\010N"
          + "O_ROUTE\020\004\022\023\n\017ROUTE_BLACKHOLE\020\005\022\027\n\023ROUTE_"
          + "WRONG_NETWORK\020\006\022\037\n\033PRIVATE_TRAFFIC_TO_IN"
          + "TERNET\020\007\022$\n PRIVATE_GOOGLE_ACCESS_DISALL"
          + "OWED\020\010\022\027\n\023NO_EXTERNAL_ADDRESS\020\t\022\034\n\030UNKNO"
          + "WN_INTERNAL_ADDRESS\020\n\022\034\n\030FORWARDING_RULE"
          + "_MISMATCH\020\013\022 \n\034FORWARDING_RULE_NO_INSTAN"
          + "CES\020\014\0228\n4FIREWALL_BLOCKING_LOAD_BALANCER"
          + "_BACKEND_HEALTH_CHECK\020\r\022\030\n\024INSTANCE_NOT_"
          + "RUNNING\020\016\022\030\n\024TRAFFIC_TYPE_BLOCKED\020\017\022\"\n\036G"
          + "KE_MASTER_UNAUTHORIZED_ACCESS\020\020\022*\n&CLOUD"
          + "_SQL_INSTANCE_UNAUTHORIZED_ACCESS\020\021\022\036\n\032D"
          + "ROPPED_INSIDE_GKE_SERVICE\020\022\022$\n DROPPED_I"
          + "NSIDE_CLOUD_SQL_SERVICE\020\023\022%\n!GOOGLE_MANA"
          + "GED_SERVICE_NO_PEERING\020\024\022$\n CLOUD_SQL_IN"
          + "STANCE_NO_IP_ADDRESS\020\025\"k\n\rGKEMasterInfo\022"
          + "\023\n\013cluster_uri\030\002 \001(\t\022\033\n\023cluster_network_"
          + "uri\030\004 \001(\t\022\023\n\013internal_ip\030\005 \001(\t\022\023\n\013extern"
          + "al_ip\030\006 \001(\t\"\210\001\n\024CloudSQLInstanceInfo\022\024\n\014"
          + "display_name\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\023\n\013netwo"
          + "rk_uri\030\004 \001(\t\022\023\n\013internal_ip\030\005 \001(\t\022\023\n\013ext"
          + "ernal_ip\030\006 \001(\t\022\016\n\006region\030\007 \001(\tB\221\002\n*com.g"
          + "oogle.cloud.networkmanagement.v1beta1B\nT"
          + "raceProtoP\001ZWgoogle.golang.org/genproto/"
          + "googleapis/cloud/networkmanagement/v1bet"
          + "a1;networkmanagement\252\002&Google.Cloud.Netw"
          + "orkManagement.V1Beta1\312\002&Google\\Cloud\\Net"
          + "workManagement\\V1beta1\352\002)Google::Cloud::"
          + "NetworkManagement::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
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
              "Deliver",
              "Forward",
              "Abort",
              "Drop",
              "LoadBalancer",
              "Network",
              "GkeMaster",
              "CloudSqlInstance",
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
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
