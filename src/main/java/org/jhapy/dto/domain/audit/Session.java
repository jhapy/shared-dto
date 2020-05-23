package org.jhapy.dto.domain.audit;

import java.io.Serializable;
import java.time.Instant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityStrId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Session extends BaseEntityStrId implements Serializable {

  private String username;

  private String sourceIp;

  private Instant sessionStart;

  private Instant sessionEnd;

  private Long sessionDuration;

  private Boolean isSuccess;

  private String error;

  private String jsessionId;

}
