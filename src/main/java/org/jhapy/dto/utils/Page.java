package org.jhapy.dto.utils;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import lombok.Data;

@Data
public class Page<T extends Serializable> implements Serializable {

  private List<T> content = Collections.emptyList();
  private Integer totalPages = 0;
  private Long totalElements;
  private Integer size = 0;
  private Integer number = 0;
  private Integer numberOfElements = 0;
  private Boolean first;
  private Boolean last;
  private Pageable pageable;
  private Long dummy;
}