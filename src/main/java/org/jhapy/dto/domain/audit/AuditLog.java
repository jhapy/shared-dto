package org.jhapy.dto.domain.audit;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import org.jhapy.dto.domain.BaseEntityLongId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 20/04/2020
 */
@Data
public class AuditLog extends BaseEntityLongId {
private String commit;
private String author;
private LocalDateTime date;
private String change;
}
