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

public interface PhoneOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Phone)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The usage of the phone. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   */
  int getUsageValue();
  /**
   *
   *
   * <pre>
   * The usage of the phone. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   */
  com.google.cloud.talent.v4beta1.ContactInfoUsage getUsage();

  /**
   *
   *
   * <pre>
   * The phone type. For example, LANDLINE, MOBILE, FAX.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Phone.PhoneType type = 2;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The phone type. For example, LANDLINE, MOBILE, FAX.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Phone.PhoneType type = 2;</code>
   */
  com.google.cloud.talent.v4beta1.Phone.PhoneType getType();

  /**
   *
   *
   * <pre>
   * Phone number.
   * Any phone formats are supported and only exact matches are performed on
   * searches. For example, if a phone number in profile is provided in the
   * format of "(xxx)xxx-xxxx", in profile searches the same phone format
   * has to be provided.
   * Number of characters allowed is 20.
   * </pre>
   *
   * <code>string number = 3;</code>
   */
  java.lang.String getNumber();
  /**
   *
   *
   * <pre>
   * Phone number.
   * Any phone formats are supported and only exact matches are performed on
   * searches. For example, if a phone number in profile is provided in the
   * format of "(xxx)xxx-xxxx", in profile searches the same phone format
   * has to be provided.
   * Number of characters allowed is 20.
   * </pre>
   *
   * <code>string number = 3;</code>
   */
  com.google.protobuf.ByteString getNumberBytes();

  /**
   *
   *
   * <pre>
   * When this number is available. Any descriptive string is expected.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string when_available = 4;</code>
   */
  java.lang.String getWhenAvailable();
  /**
   *
   *
   * <pre>
   * When this number is available. Any descriptive string is expected.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string when_available = 4;</code>
   */
  com.google.protobuf.ByteString getWhenAvailableBytes();
}
