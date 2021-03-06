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

package org.jhapy.dto.registry.actuate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Data;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 10/06/2020
 */
@Data
public class Env {

  private String[] activeProfiles;
  private PropertySource[] propertySources;

  @Data
  public static class PropertySource {

    private String name;
    private Map<String, Property> properties;

    public List<Property> getPropertyList() {
      properties.keySet().forEach(s -> {
        properties.get(s).setName(s);
      });
      return properties.values().stream().collect(Collectors.toList());
    }

    @Data
    public static class Property {

      private String name;

      private String value;
      private String origin;
    }
  }
}
