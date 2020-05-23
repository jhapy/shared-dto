package org.springframework.security.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public interface GrantedAuthority extends Serializable {

  @JsonIgnore
  String getAuthority();
}
