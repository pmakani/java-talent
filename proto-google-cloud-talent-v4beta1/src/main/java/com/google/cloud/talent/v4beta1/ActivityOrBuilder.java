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

public interface ActivityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Activity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Activity display name.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Activity display name.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Activity description.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Activity description.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Activity URI.
   * Number of characters allowed is 4,000.
   * </pre>
   *
   * <code>string uri = 3;</code>
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Activity URI.
   * Number of characters allowed is 4,000.
   * </pre>
   *
   * <code>string uri = 3;</code>
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The first creation date of the activity.
   * </pre>
   *
   * <code>.google.type.Date create_date = 4;</code>
   */
  boolean hasCreateDate();
  /**
   *
   *
   * <pre>
   * The first creation date of the activity.
   * </pre>
   *
   * <code>.google.type.Date create_date = 4;</code>
   */
  com.google.type.Date getCreateDate();
  /**
   *
   *
   * <pre>
   * The first creation date of the activity.
   * </pre>
   *
   * <code>.google.type.Date create_date = 4;</code>
   */
  com.google.type.DateOrBuilder getCreateDateOrBuilder();

  /**
   *
   *
   * <pre>
   * The last update date of the activity.
   * </pre>
   *
   * <code>.google.type.Date update_date = 5;</code>
   */
  boolean hasUpdateDate();
  /**
   *
   *
   * <pre>
   * The last update date of the activity.
   * </pre>
   *
   * <code>.google.type.Date update_date = 5;</code>
   */
  com.google.type.Date getUpdateDate();
  /**
   *
   *
   * <pre>
   * The last update date of the activity.
   * </pre>
   *
   * <code>.google.type.Date update_date = 5;</code>
   */
  com.google.type.DateOrBuilder getUpdateDateOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of team members involved in this activity.
   * Number of characters allowed is 100.
   * The limitation for max number of team members is 50.
   * </pre>
   *
   * <code>repeated string team_members = 6;</code>
   */
  java.util.List<java.lang.String> getTeamMembersList();
  /**
   *
   *
   * <pre>
   * A list of team members involved in this activity.
   * Number of characters allowed is 100.
   * The limitation for max number of team members is 50.
   * </pre>
   *
   * <code>repeated string team_members = 6;</code>
   */
  int getTeamMembersCount();
  /**
   *
   *
   * <pre>
   * A list of team members involved in this activity.
   * Number of characters allowed is 100.
   * The limitation for max number of team members is 50.
   * </pre>
   *
   * <code>repeated string team_members = 6;</code>
   */
  java.lang.String getTeamMembers(int index);
  /**
   *
   *
   * <pre>
   * A list of team members involved in this activity.
   * Number of characters allowed is 100.
   * The limitation for max number of team members is 50.
   * </pre>
   *
   * <code>repeated string team_members = 6;</code>
   */
  com.google.protobuf.ByteString getTeamMembersBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of skills used in this activity.
   * The limitation for max number of skills used is 50.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 7;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Skill> getSkillsUsedList();
  /**
   *
   *
   * <pre>
   * A list of skills used in this activity.
   * The limitation for max number of skills used is 50.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 7;</code>
   */
  com.google.cloud.talent.v4beta1.Skill getSkillsUsed(int index);
  /**
   *
   *
   * <pre>
   * A list of skills used in this activity.
   * The limitation for max number of skills used is 50.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 7;</code>
   */
  int getSkillsUsedCount();
  /**
   *
   *
   * <pre>
   * A list of skills used in this activity.
   * The limitation for max number of skills used is 50.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 7;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.SkillOrBuilder>
      getSkillsUsedOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of skills used in this activity.
   * The limitation for max number of skills used is 50.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 7;</code>
   */
  com.google.cloud.talent.v4beta1.SkillOrBuilder getSkillsUsedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Activity name snippet shows how the
   * [display_name][google.cloud.talent.v4beta1.Activity.display_name] is
   * related to a search query. It's empty if the
   * [display_name][google.cloud.talent.v4beta1.Activity.display_name] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string activity_name_snippet = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getActivityNameSnippet();
  /**
   *
   *
   * <pre>
   * Output only. Activity name snippet shows how the
   * [display_name][google.cloud.talent.v4beta1.Activity.display_name] is
   * related to a search query. It's empty if the
   * [display_name][google.cloud.talent.v4beta1.Activity.display_name] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string activity_name_snippet = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getActivityNameSnippetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Activity description snippet shows how the
   * [description][google.cloud.talent.v4beta1.Activity.description] is related
   * to a search query. It's empty if the
   * [description][google.cloud.talent.v4beta1.Activity.description] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string activity_description_snippet = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getActivityDescriptionSnippet();
  /**
   *
   *
   * <pre>
   * Output only. Activity description snippet shows how the
   * [description][google.cloud.talent.v4beta1.Activity.description] is related
   * to a search query. It's empty if the
   * [description][google.cloud.talent.v4beta1.Activity.description] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string activity_description_snippet = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.ByteString getActivityDescriptionSnippetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Skill used snippet shows how the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are related
   * to a search query. It's empty if the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are not
   * related to the search query.
   * </pre>
   *
   * <code>repeated string skills_used_snippet = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<java.lang.String> getSkillsUsedSnippetList();
  /**
   *
   *
   * <pre>
   * Output only. Skill used snippet shows how the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are related
   * to a search query. It's empty if the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are not
   * related to the search query.
   * </pre>
   *
   * <code>repeated string skills_used_snippet = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSkillsUsedSnippetCount();
  /**
   *
   *
   * <pre>
   * Output only. Skill used snippet shows how the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are related
   * to a search query. It's empty if the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are not
   * related to the search query.
   * </pre>
   *
   * <code>repeated string skills_used_snippet = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getSkillsUsedSnippet(int index);
  /**
   *
   *
   * <pre>
   * Output only. Skill used snippet shows how the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are related
   * to a search query. It's empty if the corresponding
   * [skills_used][google.cloud.talent.v4beta1.Activity.skills_used] are not
   * related to the search query.
   * </pre>
   *
   * <code>repeated string skills_used_snippet = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.ByteString getSkillsUsedSnippetBytes(int index);
}
