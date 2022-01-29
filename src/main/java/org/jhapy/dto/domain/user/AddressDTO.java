package org.jhapy.dto.domain.user;

import lombok.*;
import org.jhapy.dto.domain.BaseEntityUUIDId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AddressDTO extends BaseEntityUUIDId {
  private String address1;
  private String address2;
  private String npa;
  private String city;
  private String country;
}
