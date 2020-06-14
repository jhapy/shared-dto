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

/**
 * Filter class for {@link Double} type attributes.
 *
 * @see RangeFilter
 */
public class DoubleFilter extends RangeFilter<Double> {

  private static final long serialVersionUID = 1L;

  /**
   * <p>Constructor for DoubleFilter.</p>
   */
  public DoubleFilter() {
  }

  /**
   * <p>Constructor for DoubleFilter.</p>
   *
   * @param filter a {@link DoubleFilter} object.
   */
  public DoubleFilter(final DoubleFilter filter) {
    super(filter);
  }

  /**
   * <p>copy.</p>
   *
   * @return a {@link DoubleFilter} object.
   */
  public DoubleFilter copy() {
    return new DoubleFilter(this);
  }

}
