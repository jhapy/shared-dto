package org.jhapy.dto.utils;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 12/12/2020
 */
@Data
@SuperBuilder
public class Slice<T extends Serializable> implements Serializable {
  @Builder.Default private List<T> content = Collections.emptyList();
  private Pageable pageable;
  private boolean hasNext;
}