package org.jhapy.dto.messageQueue;

import java.io.Serializable;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-05-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewSession implements Serializable {

  private String jsessionId;

  private String username;

  private String sourceIp;

  private Instant sessionStart;

  private Boolean isSuccess;

  private String error;
}
