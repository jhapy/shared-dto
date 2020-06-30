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

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema
public class Pageable implements Serializable {

  @Schema(description = "Requested page")
  protected Integer page;

  @Schema(description = "Page size")
  protected Integer size;

  @Schema(description = "Page offset")
  protected Integer offset;

  @Schema(description = "Sorting")
  protected Collection<Order> sort;

  /**
   * Creates a new unsorted {@link Pageable}.
   *
   * @param page zero-based page index.
   * @param size the size of the page to be returned.
   * @since 2.0
   */
  public static Pageable of(int page, int size) {
    return of(page, size, null);
  }

  /**
   * Creates a new {@link Pageable} with sort parameters applied.
   *
   * @param page zero-based page index.
   * @param size the size of the page to be returned.
   * @param sort must not be {@literal null}.
   * @since 2.0
   */
  public static Pageable of(int page, int size, List<Order> sort) {
    return new Pageable(page, size, 0, sort);
  }

  @Data
  public static class Order implements Serializable {

    private Direction direction;
    private String property;

    public Order() {
    }

    public Order(String property) {
      this(Direction.ASC, property);
    }

    public Order(Direction direction, String property) {
      this.direction = direction;
      this.property = property;
    }

    public static Order asc(String property) {
      return new Order(Direction.ASC, property);
    }

    public static Order desc(String property) {
      return new Order(Direction.ASC, property);
    }

    public enum Direction {
      ASC, DESC
    }
  }

}