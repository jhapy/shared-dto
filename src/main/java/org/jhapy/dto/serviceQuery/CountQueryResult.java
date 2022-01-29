package org.jhapy.dto.serviceQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountQueryResult {
  private Long count;
  private Long lastEvent;
}
