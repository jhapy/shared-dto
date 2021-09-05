package org.jhapy.dto.serviceQuery;

import lombok.Builder;
import lombok.Data;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 28/08/2020
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class SearchQueryResult implements Serializable {

  private String id;
  @Builder.Default private List<String> highlight = new ArrayList<>();
  private String score;
}