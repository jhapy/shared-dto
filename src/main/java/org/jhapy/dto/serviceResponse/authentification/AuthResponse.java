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

package org.jhapy.dto.serviceResponse.authentification;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse implements Serializable {

  private String accessToken;
  private String tokenType = "Bearer";
  private AuthStatusEnum status;

  public AuthResponse(String accessToken) {
    this(AuthStatusEnum.SUCCESS, accessToken);
  }

  public AuthResponse(AuthStatusEnum status) {
    this(status, null);
  }

  public AuthResponse(AuthStatusEnum status, String accessToken) {
    this.status = status;
    this.accessToken = accessToken;
  }
}
