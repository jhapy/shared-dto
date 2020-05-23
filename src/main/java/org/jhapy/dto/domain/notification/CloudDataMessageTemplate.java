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
public class CloudDataMessageTemplate extends BaseEntityStrId {

  @NotNull
  private String name;

  @NotNull
  private String data;

  private String iso3Language;

  @NotNull
  private String cloudDataMessageAction;
}
