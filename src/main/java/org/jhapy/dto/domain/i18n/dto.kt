package org.jhapy.dto.domain.i18n

import org.jhapy.dto.domain.BaseEntityUUIDId
import org.jhapy.dto.domain.EntityTranslation
import java.util.*

class ActionDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    var category: String? = null
    var translated: Boolean = false
    var translations: List<ActionTrlDTO> = ArrayList()
}

class ActionTrlDTO(id: UUID? = UUID.randomUUID()) : EntityTranslation(id) {
    var name: String? = null
    var value: String? = null
    var tooltip: String? = null
}

class ElementDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    var category: String? = null
    var translated: Boolean = false
    var translations: List<ElementTrlDTO> = ArrayList()
}

class ElementTrlDTO(id: UUID? = UUID.randomUUID()) : EntityTranslation(id) {
    var name: String? = null
    var value: String? = null
    var tooltip: String? = null
}

class MessageDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    var category: String? = null
    var translated: Boolean = false
    var translations: List<MessageTrlDTO> = ArrayList()
}

class MessageTrlDTO(id: UUID? = UUID.randomUUID()) : EntityTranslation(id) {
    var name: String? = null
    var value: String? = null
}