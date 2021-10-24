package org.jhapy.cqrs.event;

import lombok.Data;

import java.util.UUID;

@Data
public class FileNotValidatedEvent {
  private UUID id;
  private UUID uploadId;
  private String errorMessage;
}