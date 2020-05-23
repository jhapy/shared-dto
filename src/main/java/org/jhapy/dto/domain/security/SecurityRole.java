package org.jhapy.dto.domain.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.jhapy.dto.domain.BaseEntityStrId;

/**
 * This class represent a Security SecurityConst (Used to access and navigate the application)
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SecurityRole extends BaseEntityStrId implements GrantedAuthority, Serializable {

  /**
   * Name of the SecurityConst
   */
  @NotNull
  private String name;
  /**
   * Some description for this role
   */
  private String description;

  @NotNull
  private Boolean canLogin;

  public SecurityRole() {
  }

  public SecurityRole(String authority) {
    setName(authority);
  }

  @JsonIgnore
  public String getAuthority() {
    return name;
  }
}
