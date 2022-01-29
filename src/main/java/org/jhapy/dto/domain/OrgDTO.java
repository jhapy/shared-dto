package org.jhapy.dto.domain;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
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
