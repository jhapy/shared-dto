package org.jhapy.dto.domain.reference;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityLongId;

/**
 * Referential for countries, based on the ISO 3166 list
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Country extends BaseEntityLongId implements Serializable {
  // From Translation
  private String name;

  /**
   * Alpha-2 code
   */
  private String iso2;

  /**
   * Alpha-3 code
   */
  private String iso3;

  /**
   * Dialing code prefix
   */
  private String dialingCode;

  /**
   * Is European Union
   */
  private Boolean isEU;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Region region;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private SubRegion subRegion;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private IntermediateRegion intermediateRegion;

  @EqualsAndHashCode.Include
  @ToString.Include
  private String region() {
    return (region != null && region.getId() != null) ? region.getId().toString() : null;
  }

  @EqualsAndHashCode.Include
  @ToString.Include
  private String subRegion() {
    return (subRegion != null && subRegion.getId() != null) ? subRegion.getId().toString() : null;
  }

  @EqualsAndHashCode.Include
  @ToString.Include
  private String intermediateRegion() {
    return (intermediateRegion != null && intermediateRegion.getId() != null) ? intermediateRegion
        .getId().toString() : null;
  }
}
