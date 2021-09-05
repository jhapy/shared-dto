package org.jhapy.dto.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DbTableDTO extends BaseEntityLongId {
  private String name;

  private String description;

  private String tableName;

  private String entityName;

  private Boolean isDeletable;

  private Boolean isChangeLog;

  private Boolean isSecurityEnabled;

  private AccessLevelEnum accessLevel;
}