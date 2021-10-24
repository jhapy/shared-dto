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

package org.jhapy.dto.domain.user;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.StringUtils;
import org.jhapy.dto.domain.BaseEntityUUIDId;
import org.jhapy.dto.utils.StoredFile;

import java.io.Serializable;
import java.util.UUID;

/**
 * This class represent a User.
 *
 * <p>A User can be : - System user (internal) - Admin user (to administer the platform) - Player or
 * Fan - Owner of a Place
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BaseUser extends BaseEntityUUIDId implements Serializable {

  private String securityUserId;

  private String email;

  private String firstName;

  private String lastName;

  private String fullName;

  private String nickName;

  @Builder.Default private StoredFile avatar = null;

  @Builder.Default private UUID avatarId = null;

  public String getFullName() {
    if (StringUtils.isEmpty(fullName)) {
      String fullName = "";
      if (!StringUtils.isEmpty(firstName)) {
        fullName += firstName;
      }
      fullName += " ";
      if (!StringUtils.isEmpty(lastName)) {
        fullName += lastName;
      }
      return fullName.trim();
    } else {
      return fullName;
    }
  }
}