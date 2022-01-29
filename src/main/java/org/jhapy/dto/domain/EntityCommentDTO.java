package org.jhapy.dto.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class EntityCommentDTO extends BaseEntityUUIDId {
  private String topic;

  private String text;

  private UUID relatedEntityId;

  private String relatedEntityName;

  private String authorId;

  private String authorNickname;
}
