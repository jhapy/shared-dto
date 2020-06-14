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

package org.jhapy.dto.domain.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityStrId;
import org.jhapy.dto.utils.StoredFile;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

/**
 * This class represents a Security User used to login and access the application.
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SecurityKeycloakUser extends BaseEntityStrId implements OAuth2User, UserDetails,
    Serializable {

  /**
   * Username
   */
  @NotNull
  private String username;

  private String email;

  private String mobileNumber;

  private String lastName;

  private String firstName;

  private Boolean emailVerified;

  private String title;

  private StoredFile picture;

  private Boolean isLocal;

  /**
   * Password for login using internal authentication
   */
  //@NotNull
  //@Pattern(regexp = "^(|(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,})$", message = "need 6 or more chars, mixing digits, lowercase and uppercase letters")
  private String password;

  /**
   * Number of consecutive failed login attempt
   */
  private Integer failedLoginAttempts = 0;

  /**
   * Password last modification date
   */
  private Instant passwordLastModification;

  /**
   * Last successful login date
   */
  private Instant lastSuccessfulLogin;

  /**
   * Does this account has expired ?
   */
  private Boolean isAccountExpired;

  /**
   * Is this account locked ?
   */
  private Boolean isAccountLocked;

  /**
   * Is the password expired ?
   */
  private Boolean isCredentialsExpired;

  private Map<String, Object> attributes;

  private List<SecurityKeycloakGroup> groups;

  private List<SecurityKeycloakRole> roles;

  private List<SecurityKeycloakRole> effectiveRoles;

  /**
   * Define the kind of user : Internal, System, External
   */
  @NotNull
  private SecurityUserTypeEnum userType;

  private Locale defaultLocale;

  private Boolean isActivated;

  private VerificationToken verificationToken = new VerificationToken();

  private PasswordResetToken passwordResetToken = new PasswordResetToken();

  private RememberMeToken rememberMeToken = new RememberMeToken();

  @NotNull
  private AuthProviderEnum provider = AuthProviderEnum.LOCAL;

  private String providerId;

  @Override
  @JsonIgnore
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return roles;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  @JsonIgnore
  public boolean isAccountNonExpired() {
    return !getIsAccountExpired();
  }

  @Override
  @JsonIgnore
  public boolean isAccountNonLocked() {
    return !getIsAccountLocked();
  }

  @Override
  @JsonIgnore
  public boolean isCredentialsNonExpired() {
    return !getIsAccountExpired();
  }

  @Override
  @JsonIgnore
  public boolean isEnabled() {
    return getIsActive();
  }

  @Override
  @JsonIgnore
  public String getName() {
    return getUsername();
  }
}
