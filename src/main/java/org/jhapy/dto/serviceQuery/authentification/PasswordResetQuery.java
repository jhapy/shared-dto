package org.jhapy.dto.serviceQuery.authentification;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jhapy.dto.serviceQuery.BaseRemoteQuery;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordResetQuery extends BaseRemoteQuery {

  @NotNull
  private String username;

  @NotNull
  private String passwordResetToken;

  @NotNull
  private String newPassword;
}
