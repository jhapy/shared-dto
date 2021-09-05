/*
 * Copyright 2020-2020 the original author or authors from the JHapy project.
 *
 * This file is part of the JHapy project, see https://www.jhapy.org/ for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jhapy.dto.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.jhapy.dto.utils.StoredFile;

import java.io.Serializable;
import java.util.List;

/**
 * A comment can be attached to anything
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-07
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Comment extends BaseEntityLongId implements Serializable {

  /** Text of the Comment */
  private String content;

  /** List of attachments attached to the comment */
  private List<StoredFile> attachments;

  /** In case of a reply, this is the parent comment */
  private Comment parent;

  /** Object attached ID */
  private Long relatedObjectId;

  /** Object attached Class */
  private String relatedObjectClass;
}