package org.jhapy.cqrs.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.*

class ImportUploadCommand(
    @TargetAggregateIdentifier
    val id: UUID,
    val uploadId: UUID
) : AbstractBaseCommand()