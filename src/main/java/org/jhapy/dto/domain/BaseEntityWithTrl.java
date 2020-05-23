package org.jhapy.dto.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class BaseEntityWithTrl<TRANSLATION extends EntityTranslation> extends
    BaseEntityLongId implements
    Serializable {

  private Set<TRANSLATION> translations = new HashSet<>();
}
