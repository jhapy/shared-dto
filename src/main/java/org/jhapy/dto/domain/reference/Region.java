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
@EqualsAndHashCode(callSuper = true, exclude = {"countries"})
@ToString(callSuper = true, exclude = {"countries"})
public class Region extends BaseEntityLongId implements Serializable {
  // From Translation
  private String name;

  private Set<Country> countries = new HashSet<>();
}
