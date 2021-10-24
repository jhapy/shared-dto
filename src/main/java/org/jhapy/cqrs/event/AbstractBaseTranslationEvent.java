package org.jhapy.cqrs.event;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class AbstractBaseTranslationEvent {
  private UUID id;

  private UUID parentId;

  private UUID clientId;

  private Long version;

  private String iso3Language;

  private Boolean isTranslated;

  private Boolean isDefault;
}