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
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface EmailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Email)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The usage of the email address. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   */
  int getUsageValue();
  /**
   *
   *
   * <pre>
   * The usage of the email address. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   */
  com.google.cloud.talent.v4beta1.ContactInfoUsage getUsage();

  /**
   *
   *
   * <pre>
   * Email address.
   * Number of characters allowed is 4,000.
   * </pre>
   *
   * <code>string email_address = 2;</code>
   */
  java.lang.String getEmailAddress();
  /**
   *
   *
   * <pre>
   * Email address.
   * Number of characters allowed is 4,000.
   * </pre>
   *
   * <code>string email_address = 2;</code>
   */
  com.google.protobuf.ByteString getEmailAddressBytes();
}
