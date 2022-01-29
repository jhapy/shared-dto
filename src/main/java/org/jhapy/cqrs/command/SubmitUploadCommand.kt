package org.jhapy.cqrs.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.*
import javax.validation.constraints.NotNull

class SubmitUploadCommand(
    val uploadId: @NotNull UUID,
    val filename: @NotNull String
) : AbstractBaseCommand() {
    @TargetAggregateIdentifier
    val id: UUID = UUID.randomUUID()
}