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

  private String _username;
  private String _securityUserId;
  private String _sessionId;
  private String _iso3Language;
  private LatLng _currentPosition;

  public BaseRemoteQuery() {
    _username = AppContext.getInstance().getCurrentUsername();
    _securityUserId = AppContext.getInstance().getCurrentSecurityUserId();
    _sessionId = AppContext.getInstance().getCurrentSessionId();
    _iso3Language = AppContext.getInstance().getCurrentIso3Language();
    _currentPosition = AppContext.getInstance().getCurrentPosition();
  }
}
