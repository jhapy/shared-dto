package org.jhapy.dto.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class EntityCommentDTO extends BaseEntityLongId {
  private String topic;

  private String text;

  private Long relatedEntityId;

  private String relatedEntityName;

  private String authorId;

  private String authorNickname;
}