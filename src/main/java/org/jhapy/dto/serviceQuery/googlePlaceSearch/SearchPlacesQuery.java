package org.jhapy.dto.serviceQuery.googlePlaceSearch;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jhapy.dto.serviceQuery.BaseRemoteQuery;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SearchPlacesQuery extends BaseRemoteQuery implements Serializable {

  private String name;
  private String city;
  private Double radius;
}
