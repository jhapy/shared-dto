package org.jhapy.dto.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jhapy.dto.utils.StoredFile;

/**
 * A comment can be attached to anything
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Comment extends BaseEntityLongId implements Serializable {

  /**
   * Text of the Comment
   */
  private String content;

  /**
   * List of attachments attached to the comment
   */
  private List<StoredFile> attachments;

  /**
   * In case of a reply, this is the parent comment
   */
  private Comment parent;

  /**
   * Object attached ID
   */
  private Long relatedObjectId;

  /**
   * Object attached Class
   */
  private String relatedObjectClass;
}
