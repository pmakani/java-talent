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
// source: google/cloud/talent/v4beta1/application.proto

package com.google.cloud.talent.v4beta1;

public final class ApplicationResourceProto {
  private ApplicationResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Application_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Application_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/talent/v4beta1/applicatio"
          + "n.proto\022\033google.cloud.talent.v4beta1\032\034go"
          + "ogle/api/annotations.proto\032\037google/api/f"
          + "ield_behavior.proto\032(google/cloud/talent"
          + "/v4beta1/common.proto\032\037google/protobuf/t"
          + "imestamp.proto\032\036google/protobuf/wrappers"
          + ".proto\032\026google/type/date.proto\"\340\007\n\013Appli"
          + "cation\022\014\n\004name\030\001 \001(\t\022\030\n\013external_id\030\037 \001("
          + "\tB\003\340A\002\022\024\n\007profile\030\002 \001(\tB\003\340A\003\022\013\n\003job\030\004 \001("
          + "\t\022\017\n\007company\030\005 \001(\t\022+\n\020application_date\030\007"
          + " \001(\0132\021.google.type.Date\022M\n\005stage\030\013 \001(\01629"
          + ".google.cloud.talent.v4beta1.Application"
          + ".ApplicationStageB\003\340A\002\022H\n\005state\030\r \001(\01629."
          + "google.cloud.talent.v4beta1.Application."
          + "ApplicationState\022:\n\ninterviews\030\020 \003(\0132&.g"
          + "oogle.cloud.talent.v4beta1.Interview\022,\n\010"
          + "referral\030\022 \001(\0132\032.google.protobuf.BoolVal"
          + "ue\0224\n\013create_time\030\023 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\002\022/\n\013update_time\030\024 \001(\0132\032."
          + "google.protobuf.Timestamp\022\025\n\routcome_not"
          + "es\030\025 \001(\t\0225\n\007outcome\030\026 \001(\0162$.google.cloud"
          + ".talent.v4beta1.Outcome\0221\n\010is_match\030\034 \001("
          + "\0132\032.google.protobuf.BoolValueB\003\340A\003\022\036\n\021jo"
          + "b_title_snippet\030\035 \001(\tB\003\340A\003\"\220\001\n\020Applicati"
          + "onState\022!\n\035APPLICATION_STATE_UNSPECIFIED"
          + "\020\000\022\017\n\013IN_PROGRESS\020\001\022\026\n\022CANDIDATE_WITHDRE"
          + "W\020\002\022\025\n\021EMPLOYER_WITHDREW\020\003\022\r\n\tCOMPLETED\020"
          + "\004\022\n\n\006CLOSED\020\005\"\251\001\n\020ApplicationStage\022!\n\035AP"
          + "PLICATION_STAGE_UNSPECIFIED\020\000\022\007\n\003NEW\020\001\022\n"
          + "\n\006SCREEN\020\002\022\031\n\025HIRING_MANAGER_REVIEW\020\003\022\r\n"
          + "\tINTERVIEW\020\004\022\022\n\016OFFER_EXTENDED\020\005\022\022\n\016OFFE"
          + "R_ACCEPTED\020\006\022\013\n\007STARTED\020\007B\206\001\n\037com.google"
          + ".cloud.talent.v4beta1B\030ApplicationResour"
          + "ceProtoP\001ZAgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/talent/v4beta1;talent\242\002\003C"
          + "TSb\006proto3"
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
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_Application_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Application_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Application_descriptor,
            new java.lang.String[] {
              "Name",
              "ExternalId",
              "Profile",
              "Job",
              "Company",
              "ApplicationDate",
              "Stage",
              "State",
              "Interviews",
              "Referral",
              "CreateTime",
              "UpdateTime",
              "OutcomeNotes",
              "Outcome",
              "IsMatch",
              "JobTitleSnippet",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
