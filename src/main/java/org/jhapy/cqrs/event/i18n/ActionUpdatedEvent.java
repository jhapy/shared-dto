package org.jhapy.cqrs.event.i18n;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.cqrs.event.AbstractBaseEvent;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ActionUpdatedEvent extends AbstractBaseEvent {
  protected List<ActionTrlUpdatedEvent> translations = new ArrayList<>();
  private String name;
  private String category;
  private Boolean isTranslated = Boolean.FALSE;
}