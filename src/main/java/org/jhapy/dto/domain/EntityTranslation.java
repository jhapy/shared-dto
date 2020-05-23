package org.jhapy.dto.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Base class for all translations
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class EntityTranslation extends BaseEntityLongId implements Serializable {
  /**
   * Language
   */
  private String  iso3Language;
  private Boolean isTranslated;
  private Boolean isDefault;
  private Long relatedGraphDbId;
}
