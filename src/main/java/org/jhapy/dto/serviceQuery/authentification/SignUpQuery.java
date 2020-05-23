package org.jhapy.dto.serviceQuery.authentification;

import javax.validation.constraints.Email;
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
public class SignUpQuery extends BaseRemoteQuery {

  @Email
  private String email;

  private String mobileNumber;

  @NotBlank
  private String password;

  private String iso3Language;

}
