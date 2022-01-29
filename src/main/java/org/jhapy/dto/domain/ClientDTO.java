package org.jhapy.dto.domain;

import lombok.*;

import java.util.UUID;

@Data
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
  private Boolean isMailboxDomainCreated = false;

  private UUID externalId;
  private Long externalVersion;
}
