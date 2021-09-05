package org.jhapy.dto.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ClientDTO extends BaseEntityLongId {
  private String name;

  private String description;

  private String mailboxDomain;
  private String adminMailbox;
  private String adminMailboxPassword;
  @Builder.Default private Boolean isMailboxDomainCreated = false;

  private Long externalId;
  private Long externalVersion;
}