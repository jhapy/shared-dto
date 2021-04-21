package org.jhapy.dto.messageQueue;

import java.io.Serializable;
import lombok.Data;
import org.jhapy.dto.domain.i18n.Message;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 27/03/2021
 */
@Data
public class I18NMessageUpdate implements Serializable {

  private I18NUpdateTypeEnum updateType;
  private Message message;
}
