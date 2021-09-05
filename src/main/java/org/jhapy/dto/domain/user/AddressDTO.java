package org.jhapy.dto.domain.user;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jhapy.dto.domain.BaseEntityLongId;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AddressDTO extends BaseEntityLongId {
  private String address1;
  private String address2;
  private String npa;
  private String city;
  private String country;
}