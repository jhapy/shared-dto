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

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-25
 */
public class AppContextThread {

  private static final ThreadLocal<String> currentUsername = new ThreadLocal<>();
  private static final ThreadLocal<String> currentUserId = new ThreadLocal<>();
  private static final ThreadLocal<String> currentSessionId = new ThreadLocal<>();
  private static final ThreadLocal<String> currentIso3Language = new ThreadLocal<>();
  private static final ThreadLocal<LatLng> currentPosition = new ThreadLocal<>();

  public static String getCurrentUsername() {
    return currentUsername.get();
  }

  public static void setCurrentUsername(String _currentUsername) {
    currentUsername.set(_currentUsername);
  }

  public static String getCurrentUserId() {
    return currentUserId.get();
  }

  public static void setCurrentUserId(String _currentUserId) {
    currentUserId.set(_currentUserId);
  }

  public static String getCurrentSessionId() {
    return currentSessionId.get();
  }

  public static void setCurrentSessionId(String _currentSessionId) {
    currentSessionId.set(_currentSessionId);
  }

  public static String getCurrentIso3Language() {
    return currentIso3Language.get();
  }

  public static void setCurrentIso3Language(String _currentIso3Language) {
    currentIso3Language.set(_currentIso3Language);
  }

  public static LatLng getCurrentPosition() {
    return currentPosition.get();
  }

  public static void setCurrentPosition(LatLng _currentPosition) {
    currentPosition.set(_currentPosition);
  }
}