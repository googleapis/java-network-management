// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1beta1/connectivity_test.proto

package com.google.cloud.networkmanagement.v1beta1;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The IP address of the endpoint, which can be an external or internal IP.
   * An IPv6 address is only allowed when the test's destination is a
   * [global load balancer
   * VIP](https://cloud.google.com/load-balancing/docs/load-balancing-overview).
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <pre>
   * The IP address of the endpoint, which can be an external or internal IP.
   * An IPv6 address is only allowed when the test's destination is a
   * [global load balancer
   * VIP](https://cloud.google.com/load-balancing/docs/load-balancing-overview).
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <pre>
   * The IP protocol port of the endpoint.
   * Only applicable when protocol is TCP or UDP.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <pre>
   * A Compute Engine instance URI.
   * </pre>
   *
   * <code>string instance = 3;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * A Compute Engine instance URI.
   * </pre>
   *
   * <code>string instance = 3;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * A cluster URI for [Google Kubernetes Engine
   * master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
   * </pre>
   *
   * <code>string gke_master_cluster = 7;</code>
   * @return The gkeMasterCluster.
   */
  java.lang.String getGkeMasterCluster();
  /**
   * <pre>
   * A cluster URI for [Google Kubernetes Engine
   * master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
   * </pre>
   *
   * <code>string gke_master_cluster = 7;</code>
   * @return The bytes for gkeMasterCluster.
   */
  com.google.protobuf.ByteString
      getGkeMasterClusterBytes();

  /**
   * <pre>
   * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
   * </pre>
   *
   * <code>string cloud_sql_instance = 8;</code>
   * @return The cloudSqlInstance.
   */
  java.lang.String getCloudSqlInstance();
  /**
   * <pre>
   * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
   * </pre>
   *
   * <code>string cloud_sql_instance = 8;</code>
   * @return The bytes for cloudSqlInstance.
   */
  com.google.protobuf.ByteString
      getCloudSqlInstanceBytes();

  /**
   * <pre>
   * A Compute Engine network URI.
   * </pre>
   *
   * <code>string network = 4;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * A Compute Engine network URI.
   * </pre>
   *
   * <code>string network = 4;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * Type of the network where the endpoint is located.
   * Applicable only to source endpoint, as destination network type can be
   * inferred from the source.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType network_type = 5;</code>
   * @return The enum numeric value on the wire for networkType.
   */
  int getNetworkTypeValue();
  /**
   * <pre>
   * Type of the network where the endpoint is located.
   * Applicable only to source endpoint, as destination network type can be
   * inferred from the source.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType network_type = 5;</code>
   * @return The networkType.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType getNetworkType();

  /**
   * <pre>
   * Project ID where the endpoint is located.
   * The Project ID can be derived from the URI if you provide a VM instance or
   * network URI.
   * The following are two cases where you must provide the project ID:
   * 1. Only the IP address is specified, and the IP address is within a GCP
   * project.
   * 2. When you are using Shared VPC and the IP address that you provide is
   * from the service project. In this case, the network that the IP address
   * resides in is defined in the host project.
   * </pre>
   *
   * <code>string project_id = 6;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project ID where the endpoint is located.
   * The Project ID can be derived from the URI if you provide a VM instance or
   * network URI.
   * The following are two cases where you must provide the project ID:
   * 1. Only the IP address is specified, and the IP address is within a GCP
   * project.
   * 2. When you are using Shared VPC and the IP address that you provide is
   * from the service project. In this case, the network that the IP address
   * resides in is defined in the host project.
   * </pre>
   *
   * <code>string project_id = 6;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();
}