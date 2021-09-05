package org.jhapy.dto.messageQueue;

import lombok.Data;
import org.jhapy.dto.domain.i18n.ElementTrlDTO;

import java.io.Serializable;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 27/03/2021
 */
@Data
public class I18NElementTrlUpdate implements Serializable {

  private I18NUpdateTypeEnum updateType;
  private ElementTrlDTO elementTrl;
}