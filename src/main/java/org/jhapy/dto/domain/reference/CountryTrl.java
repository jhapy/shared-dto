package org.jhapy.dto.domain.reference;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.EntityTranslation;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CountryTrl extends EntityTranslation implements Serializable {

  /**
   * Country name
   */
  private String name;
}
