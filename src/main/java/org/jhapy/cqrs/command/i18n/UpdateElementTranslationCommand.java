package org.jhapy.cqrs.command.i18n;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateElementTranslationCommand {
  @TargetAggregateIdentifier @NotNull private UUID elementId;
}