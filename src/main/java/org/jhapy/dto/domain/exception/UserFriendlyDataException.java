package org.jhapy.dto.domain.exception;

import java.io.Serializable;

/**
 * A data integrity violation exception containing a message intended to be shown to the end user.
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-26
 */
public class UserFriendlyDataException extends RuntimeException implements Serializable {

  public UserFriendlyDataException(String message) {
    super(message);
  }

}
