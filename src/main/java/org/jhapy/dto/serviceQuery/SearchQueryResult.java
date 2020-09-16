package org.jhapy.dto.serviceQuery;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 28/08/2020
 */
@Data
@EqualsAndHashCode
@ToString
public class SearchQueryResult implements Serializable {

  private String id;
  private List<String> highlight = new ArrayList<>();
  private String score;
}
