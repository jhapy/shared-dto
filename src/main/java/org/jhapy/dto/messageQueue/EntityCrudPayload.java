package org.jhapy.dto.messageQueue;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class EntityCrudPayload<T> implements Serializable {
  private Class<T> objectType;
  private T oldValue;
  private T newValue;
  private EntityCrudPayloadType payloadType;
  private Instant timestamp;
}
