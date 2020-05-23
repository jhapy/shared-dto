package org.jhapy.dto.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-08-19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MapInfoValue {

  private LatLng center;
  private Integer zoom;
  private MapBounds mapBounds;
  private Double radius;
}
