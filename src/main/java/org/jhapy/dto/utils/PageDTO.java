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

package org.jhapy.dto.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
public class PageDTO<T extends Serializable> implements Serializable {

  /** Page content. */
  private List<T> content = Collections.emptyList();

  /** Returns the number of total pages. */
  private Integer totalPages = 0;

  /** Returns the total amount of elements. */
  private Long totalElements;

  /** Returns the size of the page. */
  private Integer size = 0;

  /** Returns the number of the current page. */
  private Integer number = 0;

  /** Returns the number of elements currently on page. */
  private Integer numberOfElements = 0;
  /** Returns whether the current page is the first one. */
  private Boolean first;
  /** Returns whether the current page is the last one. */
  private Boolean last;

  private Pageable pageable;
  private Long dummy;
}