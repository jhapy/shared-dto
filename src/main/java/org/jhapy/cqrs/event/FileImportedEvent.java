package org.jhapy.cqrs.event;

import lombok.Data;

import java.util.UUID;

@Data
public class FileImportedEvent {
  private UUID id;
  private UUID uploadId;
}