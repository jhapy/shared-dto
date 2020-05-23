package org.jhapy.dto.serviceQuery.authentification;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jhapy.dto.serviceQuery.BaseRemoteQuery;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginQuery extends BaseRemoteQuery {

  @NotBlank
  private String username;

  @NotBlank
  private String password;
}
