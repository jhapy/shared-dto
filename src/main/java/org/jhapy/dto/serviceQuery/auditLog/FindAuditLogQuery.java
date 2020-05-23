package org.jhapy.dto.serviceQuery.auditLog;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jhapy.dto.serviceQuery.BaseRemoteQuery;
import org.jhapy.dto.utils.Pageable;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FindAuditLogQuery extends BaseRemoteQuery implements Serializable {
  @NotNull
  private String className;
  @NotNull
  private Long recordId;

  protected Pageable pageable;
}
