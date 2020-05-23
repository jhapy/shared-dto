package org.jhapy.dto.utils;

import org.jhapy.dto.domain.BaseEntity;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-26
 */
public final class EntityUtil {

  private EntityUtil() {
  }

  public static String getName(Class<? extends BaseEntity> type) {
    // All main domain have simple one word names, so this is sufficient. Metadata
    // could be added to the class if necessary.
    return type.getSimpleName();
  }
}
