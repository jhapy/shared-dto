package org.jhapy.dto.caldav;

import lombok.Data;

import java.io.Serializable;

@Data
public class CaldavDurationDTO implements Serializable {
  private Integer days;
  private Integer hours;
  private Integer minutes;
  private Boolean negative;
  private Integer seconds;
  private Integer weeks;
}