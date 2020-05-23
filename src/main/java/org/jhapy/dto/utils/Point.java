package org.jhapy.dto.utils;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Point implements Serializable {

  private Double x;
  private Double y;
}
