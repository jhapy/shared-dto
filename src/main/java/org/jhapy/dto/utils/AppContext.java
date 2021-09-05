/*
 * Copyright 2020-2020 the original author or authors from the JHapy project.
 *
 * This file is part of the JHapy project, see https://www.jhapy.org/ for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jhapy.dto.utils;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-25
 */
public class AppContext {

  private static AppContext instance;

  private Supplier<String> currentUsernameProvider;
  private Supplier<String> currentNicknameProvider;
  private Supplier<String> currentUserId;
  private Supplier<String> currentSessionIdProvider;
  private Supplier<String> currentIso3LanguageProvider;
  private Supplier<StoredFile> currentAvatarProvider;
  private Supplier<LatLng> currentPositionProvider;
  private Supplier<List<Long>> currentUserActivitiesIds;
  private Supplier<Long> currentClientIdProvider;
  private Supplier<String> currentMailboxProvider;
  private Supplier<String> currentMailboxFullNameProvider;

  private AppContext() {}

  public static AppContext getInstance() {
    if (instance == null) {
      instance = new AppContext();
    }

    return instance;
  }

  public void init(
      Supplier<String> currentUsernameProvider,
      Supplier<String> currentUserIdProvider,
      Supplier<String> currentNicknameProvider,
      Supplier<String> currentSessionIdProvider,
      Supplier<String> currentIso3LanguageProvider,
      Supplier<LatLng> currentPositionProvider,
      Supplier<StoredFile> currentAvatarProvider,
      Supplier<List<Long>> currentUserActivitiesIds) {
    this.currentUsernameProvider = currentUsernameProvider;
    this.currentUserId = currentUserIdProvider;
    this.currentNicknameProvider = currentNicknameProvider;
    this.currentIso3LanguageProvider = currentIso3LanguageProvider;
    this.currentSessionIdProvider = currentSessionIdProvider;
    this.currentPositionProvider = currentPositionProvider;
    this.currentAvatarProvider = currentAvatarProvider;
    this.currentUserActivitiesIds = currentUserActivitiesIds;
  }

  public void init(
      Supplier<String> currentUsernameProvider,
      Supplier<String> currentUserIdProvider,
      Supplier<String> currentNicknameProvider,
      Supplier<String> currentSessionIdProvider,
      Supplier<String> currentIso3LanguageProvider,
      Supplier<LatLng> currentPositionProvider,
      Supplier<StoredFile> currentAvatarProvider,
      Supplier<List<Long>> currentUserActivitiesIds,
      Supplier<Long> currentClientIdProvider,
      Supplier<String> currentMailboxProvider,
      Supplier<String> currentMailboxFullNameProvider) {
    this.currentUsernameProvider = currentUsernameProvider;
    this.currentUserId = currentUserIdProvider;
    this.currentNicknameProvider = currentNicknameProvider;
    this.currentIso3LanguageProvider = currentIso3LanguageProvider;
    this.currentSessionIdProvider = currentSessionIdProvider;
    this.currentPositionProvider = currentPositionProvider;
    this.currentAvatarProvider = currentAvatarProvider;
    this.currentUserActivitiesIds = currentUserActivitiesIds;
    this.currentClientIdProvider = currentClientIdProvider;
    this.currentMailboxProvider = currentMailboxProvider;
    this.currentMailboxFullNameProvider = currentMailboxFullNameProvider;
  }

  public String getCurrentUsername() {
    return currentUsernameProvider == null ? null : currentUsernameProvider.get();
  }

  public String getCurrentUserId() {
    return currentUserId == null ? null : currentUserId.get();
  }

  public String getCurrentNickname() {
    return currentNicknameProvider == null ? null : currentNicknameProvider.get();
  }

  public String getCurrentSessionId() {
    return currentSessionIdProvider == null ? null : currentSessionIdProvider.get();
  }

  public String getCurrentIso3Language() {
    return currentIso3LanguageProvider == null ? null : currentIso3LanguageProvider.get();
  }

  public LatLng getCurrentPosition() {
    return currentPositionProvider == null ? null : currentPositionProvider.get();
  }

  public Long getExternalClientID() {
    return currentClientIdProvider == null ? null : currentClientIdProvider.get();
  }

  public String getMailbox() {
    return currentMailboxProvider == null ? null : currentMailboxProvider.get();
  }

  public String getMailboxFullName() {
    return currentMailboxFullNameProvider == null ? null : currentMailboxFullNameProvider.get();
  }

  public StoredFile getCurrentAvatar() {
    return currentAvatarProvider == null ? null : currentAvatarProvider.get();
  }

  public List<Long> getCurrentUserActivitiesIds() {
    return currentUserActivitiesIds == null
        ? Collections.emptyList()
        : currentUserActivitiesIds.get();
  }
}