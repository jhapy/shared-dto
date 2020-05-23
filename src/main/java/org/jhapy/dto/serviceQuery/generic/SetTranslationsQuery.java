package org.jhapy.dto.serviceQuery.generic;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jhapy.dto.serviceQuery.BaseRemoteQuery;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SetTranslationsQuery<TRANSLATIONS> extends BaseRemoteQuery implements Serializable {

  @NotNull
  private Long id;

  private List<TRANSLATIONS> translations;
}
