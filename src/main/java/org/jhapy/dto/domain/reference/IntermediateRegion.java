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

package org.jhapy.dto.domain.reference;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityLongId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class IntermediateRegion extends
    BaseEntityLongId implements Serializable {

  // From Translation
  private String name;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private SubRegion subRegion;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Set<Region> regions = new HashSet<>();

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Set<Country> countries = new HashSet<>();

  @EqualsAndHashCode.Include
  @ToString.Include
  private String subRegion() {
    return (subRegion != null && subRegion.getId() != null) ? subRegion.getId().toString() : null;
  }
}
