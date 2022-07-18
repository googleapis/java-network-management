/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.networkmanagement.v1.samples;

// [START networkmanagement_v1_generated_reachabilityserviceclient_listconnectivitytests_string_sync]
import com.google.cloud.networkmanagement.v1.ConnectivityTest;
import com.google.cloud.networkmanagement.v1.ReachabilityServiceClient;

public class SyncListConnectivityTestsString {

  public static void main(String[] args) throws Exception {
    syncListConnectivityTestsString();
  }

  public static void syncListConnectivityTestsString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ReachabilityServiceClient reachabilityServiceClient = ReachabilityServiceClient.create()) {
      String parent = "parent-995424086";
      for (ConnectivityTest element :
          reachabilityServiceClient.listConnectivityTests(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END networkmanagement_v1_generated_reachabilityserviceclient_listconnectivitytests_string_sync]
