package org.jhapy.dto.domain.notification;

import javax.validation.constraints.NotNull;
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
public class CloudNotificationMessageTemplate extends BaseEntityStrId {

  @NotNull
  private String name;

  private String title;

  private String body;

  private String data;

  private String iso3Language;

  @NotNull
  private String cloudNotificationMessageAction;
}
