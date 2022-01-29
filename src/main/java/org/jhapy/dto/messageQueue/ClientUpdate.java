package org.jhapy.dto.messageQueue;

import lombok.Data;
import org.jhapy.dto.domain.ClientDTO;

import java.io.Serializable;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 27/03/2021
 */
@Data
public class ClientUpdate implements Serializable {

  private ClientUpdateTypeEnum updateType;
  private ClientDTO clientDTO;
}
