package org.jhapy.dto.domain.i18n;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityLongId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-04-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Message extends BaseEntityLongId implements Serializable {

  private String name;

  private String category;

  private Boolean isTranslated = Boolean.FALSE;

  private List<MessageTrl> translations = new ArrayList<>();
}
