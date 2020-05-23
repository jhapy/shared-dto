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
public class ValidateUserQuery extends BaseRemoteQuery {

  private String lastName;

  private String firstName;

  private String email;

  private String nickName;

  @NotNull
  private String securityUserId;

  @NotNull
  private String verificationToken;
}
