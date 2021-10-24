package org.jhapy.dto.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class OrgDTO extends BaseEntityUUIDId {
  private String name;

  private String description;

  private List<UUID> childIds;

  private UUID parentId;
}