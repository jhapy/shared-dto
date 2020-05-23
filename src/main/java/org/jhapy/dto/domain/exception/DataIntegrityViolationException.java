package org.jhapy.dto.domain.exception;

import java.io.Serializable;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-01
 */
public class DataIntegrityViolationException extends RuntimeException implements Serializable {

  public DataIntegrityViolationException() {
  }

  public DataIntegrityViolationException(String message) {
    super(message);
  }
}
