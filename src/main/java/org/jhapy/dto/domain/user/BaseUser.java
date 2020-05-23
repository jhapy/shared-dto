package org.jhapy.dto.domain.user;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.util.StringUtils;
import org.jhapy.dto.domain.BaseEntityLongId;
import org.jhapy.dto.utils.StoredFile;

/**
 * This class represent a User.
 *
 * A User can be : - System user (internal) - Admin user (to administer the platform) - Player or
 * Fan - Owner of a Place
 *
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BaseUser extends BaseEntityLongId implements Serializable {

  private String securityUserId;

  private String email;

  private String firstName;

  private String lastName;

  private String fullName;

  private String nickName;

  private StoredFile avatar = null;

  private String avatarId = null;

  public String getFullName() {
    if (StringUtils.isEmpty( fullName )) {
      String fullName = "";
      if ( ! StringUtils.isEmpty( firstName ))
        fullName += firstName;
      fullName+=" ";
      if ( ! StringUtils.isEmpty( lastName ))
        fullName += lastName;
      return fullName.trim();
    } else
      return fullName;
  }
}
