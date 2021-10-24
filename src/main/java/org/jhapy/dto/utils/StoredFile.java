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

package org.jhapy.dto.utils;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jhapy.dto.domain.BaseEntityUUIDId;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-05-15
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(
    callSuper = true,
    exclude = {"content", "orginalContent", "pdfContent"})
public class StoredFile extends BaseEntityUUIDId implements Serializable {

  private String filename;
  private String mimeType;
  private Long filesize;

  private byte[] content;
  private byte[] orginalContent;
  private PdfConvert pdfConvertStatus;
  private byte[] pdfContent;
  @Builder.Default private Map<String, String> metadata = new HashMap<>();

  private UUID relatedObjectId;
  private String relatedObjectClass;
  @Builder.Default private Boolean hasChanged = Boolean.FALSE;
}