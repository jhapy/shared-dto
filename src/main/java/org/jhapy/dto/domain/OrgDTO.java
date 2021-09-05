package org.jhapy.dto.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class OrgDTO extends BaseEntityLongId {
  private String name;

  private String description;

  private List<Long> childIds;

  private Long parentId;
}