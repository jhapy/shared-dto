package org.jhapy.dto.messageQueue;

import lombok.Data;
import org.jhapy.dto.domain.i18n.ActionTrlDTO;

import java.io.Serializable;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 27/03/2021
 */
@Data
public class I18NActionTrlUpdate implements Serializable {

  private I18NUpdateTypeEnum updateType;
  private ActionTrlDTO actionTrl;
}