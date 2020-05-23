package org.jhapy.dto.utils;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LatLng implements Serializable {

  private Double lat;
  private Double lng;
}
