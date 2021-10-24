package org.jhapy.cqrs.event;

import lombok.Data;

import java.util.UUID;

@Data
public class FileValidatedEvent {
  private UUID id;
  private UUID uploadId;
}