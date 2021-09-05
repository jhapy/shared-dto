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

import lombok.Data;
import org.jhapy.dto.registry.actuate.ConfigProps.Contexts.Context.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 10/06/2020
 */
@Data
public class ConfigProps {

  private Contexts contexts;

  public List<Bean> getBeans() {
    List<Bean> beans = new ArrayList<>();
    contexts.getContexts().values().forEach(context -> beans.addAll(context.getBeans().values()));
    return beans;
  }

  @Data
  public static class Contexts {

    private Map<String, Context> contexts;

    @Data
    public static class Context {

      private Map<String, Bean> beans;
      private Object parentId;

      @Data
      public static class Bean {

        private String prefix;
        private Map<String, Object> properties;
      }
    }
  }
}