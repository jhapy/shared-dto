package org.jhapy.cqrs.event.i18n;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.cqrs.event.AbstractBaseTranslationEvent;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ActionTrlUpdatedEvent extends AbstractBaseTranslationEvent {
  private String name;

  private String value;

  private String tooltip;
}