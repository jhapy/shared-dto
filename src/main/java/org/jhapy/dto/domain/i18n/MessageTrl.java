package org.jhapy.dto.domain.i18n;

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
public class MessageTrl extends EntityTranslation implements Serializable {

  private String name;
  /**
   * Message Value
   */
  private String value;
}
