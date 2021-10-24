package org.jhapy.dto.serviceQuery;

import lombok.*;

import java.io.Serializable;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 28/08/2020
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SearchQuery extends BaseRemoteQuery implements Serializable {

  String filter;
}