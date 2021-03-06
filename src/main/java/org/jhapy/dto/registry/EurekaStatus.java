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

package org.jhapy.dto.registry;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import lombok.Data;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 01/06/2020
 */
@Data
public class EurekaStatus implements Serializable {

  private Date time;
  private String currentTime;
  private String upTime;
  private String environment;
  private String datacenter;
  private Boolean isBelowRenewThreshold;
  private Map<String, String> generalStats;
  private String instanceInfoIpAddr;
  private String instanceInfoStatus;
  private String managementUrl;
}
