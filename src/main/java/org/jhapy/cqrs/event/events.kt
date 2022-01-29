package org.jhapy.cqrs.event

import java.util.*

abstract class AbstractBaseEvent(var id: UUID) {
    var version: Long? = null
    var clientId: UUID? = null
    var clientName: String? = null
    var isActive = true
}

abstract class AbstractBaseTranslationEvent(var id: UUID) {
    var parentId: UUID? = null
    var clientId: UUID? = null
    var version: Long? = null
    var iso3Language: String? = null
    var translated: Boolean? = null
    var isDefault: Boolean? = null
}

class DatabaseCleanedEvent(val id: UUID, val uploadId: UUID)