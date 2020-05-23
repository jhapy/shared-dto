package org.jhapy.dto.serviceQuery.reference.intermediateRegion;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jhapy.dto.serviceQuery.BaseRemoteQuery;
import org.jhapy.dto.utils.Pageable;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FindAnyMatchingQuery extends BaseRemoteQuery implements Serializable {

  private String filter;
  private String iso3Language;
  private Pageable pageable;
}
