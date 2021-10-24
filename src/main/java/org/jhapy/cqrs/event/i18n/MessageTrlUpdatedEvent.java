package org.jhapy.cqrs.event.i18n;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.cqrs.event.AbstractBaseTranslationEvent;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MessageTrlUpdatedEvent extends AbstractBaseTranslationEvent {
  private String name;

  private String value;
}