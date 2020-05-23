package org.jhapy.dto.domain.exception;

import java.io.Serializable;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-04-14
 */
public class EntityNotFoundException extends RuntimeException implements Serializable {

  public EntityNotFoundException() {
  }

  public EntityNotFoundException(String message) {
    super(message);
  }
}
