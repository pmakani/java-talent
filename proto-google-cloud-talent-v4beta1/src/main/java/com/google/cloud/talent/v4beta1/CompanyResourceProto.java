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
// source: google/cloud/talent/v4beta1/company.proto

package com.google.cloud.talent.v4beta1;

public final class CompanyResourceProto {
  private CompanyResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Company_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Company_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Company_DerivedInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Company_DerivedInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/talent/v4beta1/company.pr"
          + "oto\022\033google.cloud.talent.v4beta1\032\034google"
          + "/api/annotations.proto\032\037google/api/field"
          + "_behavior.proto\032(google/cloud/talent/v4b"
          + "eta1/common.proto\"\370\003\n\007Company\022\014\n\004name\030\001 "
          + "\001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\030\n\013extern"
          + "al_id\030\003 \001(\tB\003\340A\002\0226\n\004size\030\004 \001(\0162(.google."
          + "cloud.talent.v4beta1.CompanySize\022\034\n\024head"
          + "quarters_address\030\005 \001(\t\022\025\n\rhiring_agency\030"
          + "\006 \001(\010\022\020\n\010eeo_text\030\007 \001(\t\022\023\n\013website_uri\030\010"
          + " \001(\t\022\027\n\017career_site_uri\030\t \001(\t\022\021\n\timage_u"
          + "ri\030\n \001(\t\0220\n(keyword_searchable_job_custo"
          + "m_attributes\030\013 \003(\t\022K\n\014derived_info\030\014 \001(\013"
          + "20.google.cloud.talent.v4beta1.Company.D"
          + "erivedInfoB\003\340A\003\022\026\n\tsuspended\030\r \001(\010B\003\340A\003\032"
          + "S\n\013DerivedInfo\022D\n\025headquarters_location\030"
          + "\001 \001(\0132%.google.cloud.talent.v4beta1.Loca"
          + "tionB\202\001\n\037com.google.cloud.talent.v4beta1"
          + "B\024CompanyResourceProtoP\001ZAgoogle.golang."
          + "org/genproto/googleapis/cloud/talent/v4b"
          + "eta1;talent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_Company_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Company_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Company_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ExternalId",
              "Size",
              "HeadquartersAddress",
              "HiringAgency",
              "EeoText",
              "WebsiteUri",
              "CareerSiteUri",
              "ImageUri",
              "KeywordSearchableJobCustomAttributes",
              "DerivedInfo",
              "Suspended",
            });
    internal_static_google_cloud_talent_v4beta1_Company_DerivedInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_Company_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Company_DerivedInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Company_DerivedInfo_descriptor,
            new java.lang.String[] {
              "HeadquartersLocation",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
