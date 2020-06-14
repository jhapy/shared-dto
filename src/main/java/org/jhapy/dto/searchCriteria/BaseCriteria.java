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

package org.jhapy.dto.searchCriteria;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jhapy.dto.searchCriteria.filter.BooleanFilter;
import org.jhapy.dto.searchCriteria.filter.InstantFilter;
import org.jhapy.dto.searchCriteria.filter.LongFilter;
import org.jhapy.dto.searchCriteria.filter.StringFilter;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 10/05/2020
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class BaseCriteria implements Serializable, Criteria {

  private LongFilter id;

  private StringFilter createdBy;

  private InstantFilter created;

  private StringFilter modifiedBy;

  private InstantFilter modified;

  private BooleanFilter isActive;

  @Override
  public BaseCriteria copy() {
    return this.toBuilder().build();
  }
}
