package org.jhapy.dto.domain.notification;

import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityStrId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-07-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Mail extends BaseEntityStrId {
  private String to;

  private String copyTo;

  private String from;

  private String subject;

  private String body;

  private Map<String, byte[]> attachements;

  private Map<String, String> attributes;

  private MailStatusEnum mailStatus;

  private String mailAction;

  private String errorMessage;

  private Integer nbRetry = 0;

  private String applicationName;

  private String iso3Language;
}
