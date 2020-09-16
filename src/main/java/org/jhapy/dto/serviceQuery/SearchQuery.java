package org.jhapy.dto.serviceQuery;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Alexandre Clavaud.
 * @version 1.0
 * @since 28/08/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SearchQuery extends BaseRemoteQuery implements Serializable {

  String filter;
}
