/*
 * Copyright 2020-2020 the original author or authors from the JHapy project.
 *
 * This file is part of the JHapy project, see https://www.jhapy.org/ for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jhapy.dto.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
  private Double alt;

  public LatLng(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public static LatLng latlng(double lat, double lng) {
    return new LatLng(lat, lng);
  }

  public static LatLng latlng(double lat, double lng, double altitude) {
    return new LatLng(lat, lng, altitude);
  }
}