package org.jhapy.dto.utils;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-25
 */
public class AppContextThread {

  private static final ThreadLocal<String> currentUsername = new ThreadLocal<>();
  private static final ThreadLocal<String> currentSecurityUserId = new ThreadLocal<>();
  private static final ThreadLocal<String> currentSessionId = new ThreadLocal<>();
  private static final ThreadLocal<String> currentIso3Language = new ThreadLocal<>();
  private static final ThreadLocal<LatLng> currentPosition = new ThreadLocal<>();

  public static String getCurrentUsername() {
    return currentUsername.get();
  }

  public static void setCurrentUsername(String _currentUsername) {
    currentUsername.set(_currentUsername);
  }

  public static String getCurrentSecurityUserId() {
    return currentSecurityUserId.get();
  }

  public static void setCurrentSecurityUserId(String _currentSecurityUserId) {
    currentSecurityUserId.set(_currentSecurityUserId);
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
