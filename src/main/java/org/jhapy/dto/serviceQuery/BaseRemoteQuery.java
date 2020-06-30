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

package org.jhapy.dto.serviceQuery;


import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;
import org.jhapy.dto.utils.AppContext;
import org.jhapy.dto.utils.LatLng;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
@Schema
public class BaseRemoteQuery implements Serializable {

  @Schema(description = "Username of the caller")
  private String queryUsername;

  @Schema(description = "User Id of the caller")
  private String queryUserId;

  @Schema(description = "Session Id of the caller")
  private String querySessionId;

  @Schema(description = "ISO3 Language of the caller")
  private String queryIso3Language;

  @Schema(description = "GPS position of the caller")
  private LatLng queryCurrentPosition;

  public BaseRemoteQuery() {
    queryUsername = AppContext.getInstance().getCurrentUsername();
    queryUserId = AppContext.getInstance().getCurrentUserId();
    querySessionId = AppContext.getInstance().getCurrentSessionId();
    queryIso3Language = AppContext.getInstance().getCurrentIso3Language();
    queryCurrentPosition = AppContext.getInstance().getCurrentPosition();
  }
}
