package org.jhapy.cqrs.event.audit

import org.jhapy.cqrs.event.AbstractBaseEvent
import java.util.*

class LoginEvent(id: UUID) : AbstractBaseEvent(id) {
    var username: String? = null
    var sourceIp: String? = null
    var isSuccess: Boolean? = null
    var error: String? = null
    var jsessionId: String? = null
}

class LogoutEvent(id: UUID) : AbstractBaseEvent(id) {
}

class SessionDeletedEvent(var id: UUID)