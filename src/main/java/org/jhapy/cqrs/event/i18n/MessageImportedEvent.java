package org.jhapy.cqrs.event.i18n;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jhapy.dto.domain.i18n.MessageDTO;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageImportedEvent {
  private Map<String, MessageDTO> messages;
}