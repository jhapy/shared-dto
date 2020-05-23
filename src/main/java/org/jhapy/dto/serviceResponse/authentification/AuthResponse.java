package org.jhapy.dto.serviceResponse.authentification;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse implements Serializable {

  private String accessToken;
  private String tokenType = "Bearer";
  private AuthStatusEnum status;

  public AuthResponse(String accessToken) {
    this(AuthStatusEnum.SUCCESS, accessToken);
  }

  public AuthResponse(AuthStatusEnum status) {
    this(status, null);
  }

  public AuthResponse(AuthStatusEnum status, String accessToken) {
    this.status = status;
    this.accessToken = accessToken;
  }
}
