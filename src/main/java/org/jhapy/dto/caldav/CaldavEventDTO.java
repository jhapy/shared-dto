package org.jhapy.dto.caldav;

import lombok.Data;
import lombok.ToString;
import org.jhapy.dto.utils.LatLng;

import java.io.Serializable;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@ToString
@Data
public class CaldavEventDTO implements Serializable {
  private String classification;
  private Instant created;
  private Instant updated;
  private String description;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private String location;
  private LatLng geographicPosition;
  private URI organizer;
  private CaldavEventPriorityEnum priority;
  private LocalDateTime dateStamp;
  private Integer sequenceNo;
  private CaldavEventStatusEnum status;
  private String summary;
  private CaldavEventTransparencyEnum transparency;
  private URI url;
  // Recurrence...
  private CaldavDurationDTO duration;

  private String relatedObjectName;
  private UUID relatedObjectId;

  private String uid;
  private String mailbox;
}
