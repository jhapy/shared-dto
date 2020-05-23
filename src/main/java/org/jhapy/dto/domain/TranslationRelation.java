package org.jhapy.dto.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 10/20/19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TranslationRelation<S extends BaseEntityWithTrl, T extends EntityTranslation> extends BaseEntity {
  private Boolean isDefault;

  private String iso3Language;

  private S entity;

  private T entityTrl;
}
