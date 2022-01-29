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
package org.jhapy.dto.searchCriteria.filter;

import java.io.Serial;
import java.util.UUID;

/**
 * Filter class for {@link UUID} type attributes.
 *
 * @see Filter
 */
public class UUIDFilter extends Filter<UUID> {

  @Serial private static final long serialVersionUID = 1L;

  /** Constructor for UUIDFilter. */
  public UUIDFilter() {}

  /**
   * Constructor for UUIDFilter.
   *
   * @param filter a {@link UUIDFilter} object.
   */
  public UUIDFilter(final UUIDFilter filter) {
    super(filter);
  }

  /**
   * copy.
   *
   * @return a {@link UUIDFilter} object.
   */
  public UUIDFilter copy() {
    return new UUIDFilter(this);
  }
}
