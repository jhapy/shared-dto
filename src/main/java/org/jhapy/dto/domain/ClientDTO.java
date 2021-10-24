package org.jhapy.dto.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ClientDTO extends BaseEntityUUIDId {
  private String name;

  private String description;

  private String mailboxDomain;
  private String adminMailbox;
  private String adminMailboxPassword;
  @Builder.Default private Boolean isMailboxDomainCreated = false;

  private UUID externalId;
  private Long externalVersion;
}