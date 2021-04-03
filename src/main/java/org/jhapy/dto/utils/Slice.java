package org.jhapy.dto.utils;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import lombok.Data;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 12/12/2020
 */
@Data
public class Slice<T extends Serializable> implements Serializable {
  private List<T> content = Collections.emptyList();
  private Pageable pageable;
  private boolean hasNext;
}
