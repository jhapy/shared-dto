package org.jhapy.dto.domain.security;

import java.util.HashMap;
import java.util.Map;

public enum AuthProviderEnum {
  LOCAL("local"),
  LOCAL_EMAIL("localEmail"),
  LOCAL_MOBILE_NUMBER("localMobileNumber"),
  ACTIVE_DIRECTORY("activeDirectory"),
  FACEBOOK("facebook"),
  GOOGLE("google"),
  GITHUB("github"),
  TWITTER("twitter"),
  PINTEREST("pinterest"),
  FOURSQUARE("foursquare");

  //Lookup table
  private static final Map<String, AuthProviderEnum> lookup = new HashMap<>();

  //Populate the lookup table on loading time
  static {
    for (AuthProviderEnum env : AuthProviderEnum.values()) {
      lookup.put(env.getName(), env);
    }
  }

  private final String name;

  //****** Reverse Lookup Implementation************//

  AuthProviderEnum(String name) {
    this.name = name;
  }

  //This method can be used for reverse lookup purpose
  public static AuthProviderEnum get(String name) {
    return lookup.get(name);
  }

  public String getName() {
    return name;
  }

}
