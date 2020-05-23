package org.jhapy.dto.domain;

import java.io.Serializable;
import java.time.Instant;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(exclude = {"createdBy", "modifiedBy", "created", "modified"})
public abstract class BaseEntity implements Serializable {

  /**
   * DB Generated ID
   */
  private Object id;

  /**
   * Who create this record (no ID, use username)
   */
  private String createdBy;

  /**
   * When this record has been created
   */
  private Instant created;

  /**
   * How did the last modification of this record (no ID, use username)
   */
  private String modifiedBy;

  /**
   * When this record was last updated
   */
  private Instant modified;

  /**
   * Version of the record. Used for synchronization and concurrent access.
   */
  private Long version;

  /**
   * Indicate if the current record is active (deactivate instead of delete)
   */
  private Boolean isActive = Boolean.TRUE;

  private Boolean isNew = Boolean.FALSE;
}
