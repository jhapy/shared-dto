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
  private Supplier<String> currentSecurityUserIdProvider;
  private Supplier<String> currentSessionIdProvider;
  private Supplier<String> currentIso3LanguageProvider;
  private Supplier<StoredFile> currentAvatarProvider;
  private Supplier<LatLng> currentPositionProvider;
  private Supplier<List<Long>> currentUserActivitiesIds;

  private AppContext() {
  }

  public static AppContext getInstance() {
    if (instance == null) {
      instance = new AppContext();
    }

    return instance;
  }

  public void init(Supplier<String> currentUsernameProvider,
      Supplier<String> currentSecurityUserIdProvider, Supplier<String> currentSessionIdProvider,
      Supplier<String> currentIso3LanguageProvider, Supplier<LatLng> currentPositionProvider,
      Supplier<StoredFile> currentAvatarProvider,
      Supplier<List<Long>> currentUserActivitiesIds) {
    this.currentUsernameProvider = currentUsernameProvider;
    this.currentSecurityUserIdProvider = currentSecurityUserIdProvider;
    this.currentIso3LanguageProvider = currentIso3LanguageProvider;
    this.currentSessionIdProvider = currentSessionIdProvider;
    this.currentPositionProvider = currentPositionProvider;
    this.currentAvatarProvider = currentAvatarProvider;
    this.currentUserActivitiesIds = currentUserActivitiesIds;
  }

  public String getCurrentUsername() {
    return currentUsernameProvider == null ? null : currentUsernameProvider.get();
  }

  public String getCurrentSecurityUserId() {
    return currentSecurityUserIdProvider == null ? null : currentSecurityUserIdProvider.get();
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

  public StoredFile getCurrentAvatar() {
    return currentAvatarProvider == null ? null : currentAvatarProvider.get();
  }

  public List<Long> getCurrentUserActivitiesIds() {
    return currentUserActivitiesIds == null ? Collections.emptyList()
        : currentUserActivitiesIds.get();
  }
}
