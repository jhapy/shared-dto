package org.jhapy.dto.utils;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pageable implements Serializable {

  protected Integer page;
  protected Integer size;
  protected Integer offset;
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