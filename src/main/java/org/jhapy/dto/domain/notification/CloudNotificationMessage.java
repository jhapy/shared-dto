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
public class CloudNotificationMessage extends BaseEntityStrId {

  private String deviceToken;

  private String title;

  private String body;

  private String data;

  private CloudNotificationMessageStatusEnum cloudNotificationMessageStatus;

  private String cloudNotificationMessageAction;

  private Map<String, String> attributes;

  private String errorMessage;

  private int nbRetry = 0;

  private String applicationName;

  private String iso3Language;
}
