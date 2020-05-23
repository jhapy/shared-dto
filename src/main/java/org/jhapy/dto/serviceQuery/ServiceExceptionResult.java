package org.jhapy.dto.serviceQuery;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ServiceExceptionResult extends ServiceResult implements Serializable {

  private Throwable exception;

  public ServiceExceptionResult(Throwable t) {
    this(t, t.getLocalizedMessage());
  }

  public ServiceExceptionResult(Throwable t, String message) {
    setIsSuccess(Boolean.FALSE);
    setMessage(message);
    setException(t);
  }
}
