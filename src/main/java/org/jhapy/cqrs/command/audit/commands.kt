package org.jhapy.cqrs.command.audit

import org.axonframework.modelling.command.TargetAggregateIdentifier
import org.jhapy.cqrs.command.AbstractBaseCommand
import org.jhapy.cqrs.command.DeleteEntityCommand
import org.jhapy.dto.domain.audit.SessionDTO
import java.io.Serializable
import java.util.*

class LoginCommand() : AbstractBaseCommand() {
    @TargetAggregateIdentifier
    val id: UUID = UUID.randomUUID()

    lateinit var username: String
    lateinit var sourceIp: String
    var isSuccess: Boolean = true
    var error: String? = null
    lateinit var jsessionId: String
}

class LogoutCommand(id: UUID) : AbstractBaseCommand()

class DeleteSessionCommand(id: UUID) : DeleteEntityCommand<SessionDTO>(id), Serializable
