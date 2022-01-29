package org.jhapy.dto.domain.audit

import org.jhapy.dto.domain.BaseEntityUUIDId
import java.time.Instant
import java.time.LocalDateTime
import java.util.*

class SessionDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    var username: String? = null
    var sourceIp: String? = null
    var sessionStart: Instant? = null
    var sessionEnd: Instant? = null
    var sessionDuration: Long? = null
    var isSuccess: Boolean? = null
    var error: String? = null
    var jsessionId: String? = null
}

class AuditLog(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    var commit: String? = null
    var author: String? = null
    var date: LocalDateTime? = null
    var change: String? = null
}
