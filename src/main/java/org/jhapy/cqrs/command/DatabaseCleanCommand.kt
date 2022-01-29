package org.jhapy.cqrs.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.*

class DatabaseCleanCommand(
    @TargetAggregateIdentifier
    val id: UUID,
    val uploadId: UUID
) : AbstractBaseCommand()