package org.jhapy.dto.serviceQuery;

import java.io.Serializable;
import lombok.Data;
import org.jhapy.dto.utils.AppContext;
import org.jhapy.dto.utils.LatLng;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
@Data
public class BaseRemoteQuery implements Serializable {

  private String queryUsername;
  private String querySecurityUserId;
  private String querySessionId;
  private String queryIso3Language;
  private LatLng queryCurrentPosition;

  public BaseRemoteQuery() {
    queryUsername = AppContext.getInstance().getCurrentUsername();
    querySecurityUserId = AppContext.getInstance().getCurrentSecurityUserId();
    querySessionId = AppContext.getInstance().getCurrentSessionId();
    queryIso3Language = AppContext.getInstance().getCurrentIso3Language();
    queryCurrentPosition = AppContext.getInstance().getCurrentPosition();
  }
}
