package org.jhapy.cqrs.event;

import lombok.Data;

import java.util.UUID;

@Data
public class UploadSubmittedEvent {
  private UUID id;

  private UUID uploadId;

  private String filename;

  private Boolean isValidated = false;

  private Boolean isImported = false;

  private String errorMessage;
}