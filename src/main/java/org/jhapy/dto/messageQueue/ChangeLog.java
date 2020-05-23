package org.jhapy.dto.messageQueue;

import java.io.Serializable;
import lombok.Data;
import org.jhapy.dto.domain.audit.Session;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-05-24
 */
@Data
public class ChangeLog implements Serializable {

  private String entity;

  private Long recordId;

  private Session session;

  private String attribute;

  private String oldValue;

  private String newValue;
}
