package org.jhapy.dto.utils;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MapBounds implements Serializable {

  private LatLng northEast;
  private LatLng southWest;
}
