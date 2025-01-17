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
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

public final class ApplicationServiceProto {
  private ApplicationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/talent/v4beta1/applicatio"
          + "n_service.proto\022\033google.cloud.talent.v4b"
          + "eta1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032-google/cloud/talent/v4beta"
          + "1/application.proto\032(google/cloud/talent"
          + "/v4beta1/common.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\"s\n\030CreateApplicationRequest\022\023\n\006pare"
          + "nt\030\001 \001(\tB\003\340A\002\022B\n\013application\030\002 \001(\0132(.goo"
          + "gle.cloud.talent.v4beta1.ApplicationB\003\340A"
          + "\002\"*\n\025GetApplicationRequest\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\002\"\217\001\n\030UpdateApplicationRequest\022B\n\013ap"
          + "plication\030\001 \001(\0132(.google.cloud.talent.v4"
          + "beta1.ApplicationB\003\340A\002\022/\n\013update_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMask\"-\n\030Delet"
          + "eApplicationRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"U"
          + "\n\027ListApplicationsRequest\022\023\n\006parent\030\001 \001("
          + "\tB\003\340A\002\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030"
          + "\003 \001(\005\"\264\001\n\030ListApplicationsResponse\022>\n\014ap"
          + "plications\030\001 \003(\0132(.google.cloud.talent.v"
          + "4beta1.Application\022\027\n\017next_page_token\030\002 "
          + "\001(\t\022?\n\010metadata\030\003 \001(\0132-.google.cloud.tal"
          + "ent.v4beta1.ResponseMetadata2\302\010\n\022Applica"
          + "tionService\022\277\001\n\021CreateApplication\0225.goog"
          + "le.cloud.talent.v4beta1.CreateApplicatio"
          + "nRequest\032(.google.cloud.talent.v4beta1.A"
          + "pplication\"I\202\323\344\223\002C\">/v4beta1/{parent=pro"
          + "jects/*/tenants/*/profiles/*}/applicatio"
          + "ns:\001*\022\266\001\n\016GetApplication\0222.google.cloud."
          + "talent.v4beta1.GetApplicationRequest\032(.g"
          + "oogle.cloud.talent.v4beta1.Application\"F"
          + "\202\323\344\223\002@\022>/v4beta1/{name=projects/*/tenant"
          + "s/*/profiles/*/applications/*}\022\313\001\n\021Updat"
          + "eApplication\0225.google.cloud.talent.v4bet"
          + "a1.UpdateApplicationRequest\032(.google.clo"
          + "ud.talent.v4beta1.Application\"U\202\323\344\223\002O2J/"
          + "v4beta1/{application.name=projects/*/ten"
          + "ants/*/profiles/*/applications/*}:\001*\022\252\001\n"
          + "\021DeleteApplication\0225.google.cloud.talent"
          + ".v4beta1.DeleteApplicationRequest\032\026.goog"
          + "le.protobuf.Empty\"F\202\323\344\223\002@*>/v4beta1/{nam"
          + "e=projects/*/tenants/*/profiles/*/applic"
          + "ations/*}\022\307\001\n\020ListApplications\0224.google."
          + "cloud.talent.v4beta1.ListApplicationsReq"
          + "uest\0325.google.cloud.talent.v4beta1.ListA"
          + "pplicationsResponse\"F\202\323\344\223\002@\022>/v4beta1/{p"
          + "arent=projects/*/tenants/*/profiles/*}/a"
          + "pplications\032l\312A\023jobs.googleapis.com\322ASht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "form,https://www.googleapis.com/auth/job"
          + "sB\205\001\n\037com.google.cloud.talent.v4beta1B\027A"
          + "pplicationServiceProtoP\001ZAgoogle.golang."
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
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.ApplicationResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Application",
            });
    internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor,
            new java.lang.String[] {
              "Application", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize",
            });
    internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_descriptor,
            new java.lang.String[] {
              "Applications", "NextPageToken", "Metadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ApplicationResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
