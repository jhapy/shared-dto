package org.jhapy.dto.domain.reference;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityLongId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SubRegion extends BaseEntityLongId implements Serializable {
  // From Translation
  private String name;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Region region;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Set<Country> countries = new HashSet<>();

  @EqualsAndHashCode.Include
  @ToString.Include
  private String region() {
    return (region != null && region.getId() != null) ? region.getId().toString() : null;
  }
}
