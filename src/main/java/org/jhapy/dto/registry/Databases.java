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

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 07/06/2020
 */
@Data
public class Databases {

  private Value min;
  private Value idle;
  private Value max;
  private Value pending;
  private Value active;
  private Value connections;
  private Stats usage;
  private Stats acquire;
  private Stats creation;

  public List<Stats> getStats() {
    acquire.setName("Acquire");
    creation.setName("Creation");
    usage.setName("usage");
    return Arrays.asList(acquire, creation, usage);
  }

  @Data
  public static class Value {

    private Double value;
  }

  @Data
  public static class Stats {

    private String name;

    @JsonProperty("0.0")
    private Double p000;

    @JsonProperty("0.5")
    private Double p050;

    @JsonProperty("0.75")
    private Double p075;

    @JsonProperty("0.95")
    private Double p095;

    @JsonProperty("0.99")
    private Double p099;

    @JsonProperty("1.0")
    private Double p100;

    private Double max;
    private Double mean;
    private Double totalTime;
    private Double count;
  }
}