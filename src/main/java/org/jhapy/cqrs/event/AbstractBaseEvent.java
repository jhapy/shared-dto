package org.jhapy.cqrs.event;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class AbstractBaseEvent {
  private UUID id;

  private Long version;

  private UUID clientId;

  private String clientName;

  private Boolean isActive = Boolean.TRUE;
}