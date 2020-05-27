package org.jhapy.dto.searchCriteria;

import java.io.Serializable;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jhapy.dto.searchCriteria.filter.BooleanFilter;
import org.jhapy.dto.searchCriteria.filter.InstantFilter;
import org.jhapy.dto.searchCriteria.filter.LongFilter;
import org.jhapy.dto.searchCriteria.filter.StringFilter;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 10/05/2020
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class BaseCriteria implements Serializable, Criteria {
  private LongFilter id;

  private StringFilter createdBy;

  private InstantFilter created;

  private StringFilter modifiedBy;

  private InstantFilter modified;

  private BooleanFilter isActive;

  @Override
  public BaseCriteria copy() {
    return this.toBuilder().build();
  }
}
