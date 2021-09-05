package org.jhapy.dto.messageQueue;

import lombok.Data;
import org.jhapy.dto.domain.i18n.MessageTrlDTO;

import java.io.Serializable;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 27/03/2021
 */
@Data
public class I18NMessageTrlUpdate implements Serializable {

  private I18NUpdateTypeEnum updateType;
  private MessageTrlDTO messageTrl;
}