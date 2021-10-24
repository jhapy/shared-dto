package org.jhapy.cqrs.command;

import lombok.*;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ImportUploadCommand extends AbstractBaseCommand {
  @TargetAggregateIdentifier private UUID id;

  @NotNull private UUID uploadId;
}