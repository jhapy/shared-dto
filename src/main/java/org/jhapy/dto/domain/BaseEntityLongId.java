package org.jhapy.dto.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-07-05
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class BaseEntityLongId extends BaseEntity {
  public Long getId() {
    return (Long) super.getId();
  }

  public void setId(Long id) {
    super.setId(id);
  }
}
