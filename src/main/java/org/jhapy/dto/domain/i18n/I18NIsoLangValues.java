package org.jhapy.dto.domain.i18n;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 27/03/2021
 */
@Data
public class I18NIsoLangValues implements Serializable {

  private Integer recordVersion;
  private String isoLang;
  private Map<String, String> values;
}
