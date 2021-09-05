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

import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 06/06/2020
 */
@Data
public class Loggers {

  private Set<LogLevel> levels;
  private Map<String, SingleLoggerLevels> loggers;
  private Map<String, GroupLoggerLevels> groups;

  @Data
  static class LoggerLevels {

    private String configuredLevel;
  }

  @Data
  @EqualsAndHashCode(callSuper = false)
  static class GroupLoggerLevels extends LoggerLevels {

    private List<String> members;
  }

  @Data
  @EqualsAndHashCode(callSuper = false)
  public static class SingleLoggerLevels extends LoggerLevels {

    private String effectiveLevel;
  }

  public enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    FATAL,
    OFF
  }
}