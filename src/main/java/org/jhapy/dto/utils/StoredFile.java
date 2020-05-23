package org.jhapy.dto.utils;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.domain.BaseEntityStrId;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-05-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, exclude = {"content", "orginalContent"})
public class StoredFile extends BaseEntityStrId implements Serializable {

  private String filename;
  private String mimeType;
  private Long filesize;

  private byte[] content;
  private byte[] orginalContent;

  private Float zoom;

  private Long relatedObjectId;
  private String relatedObjectClass;

  private Boolean hasChanged = Boolean.FALSE;
}