package org.jhapy.cqrs.event.i18n

import org.jhapy.cqrs.event.AbstractBaseEvent
import org.jhapy.cqrs.event.AbstractBaseTranslationEvent
import org.jhapy.dto.domain.i18n.ActionDTO
import org.jhapy.dto.domain.i18n.ElementDTO
import org.jhapy.dto.domain.i18n.MessageDTO
import java.util.*

class ActionImportedEvent {
    var actions: Map<String, ActionDTO> = HashMap()
}

class ActionCreatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var name: String? = null
    var category: String? = null
    var translated = false
    var translations: List<ActionTrlCreatedEvent> = ArrayList()
}

class ActionUpdatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var name: String? = null
    var category: String? = null
    var translated = false
    var translations: List<ActionTrlUpdatedEvent> = ArrayList()
}

class ActionDeletedEvent(var id: UUID)

class ActionTrlCreatedEvent(id: UUID) : AbstractBaseTranslationEvent(id) {
    var name: String? = null
    var value: String? = null
    var tooltip: String? = null
}

class ActionTrlDeletedEvent(var id: UUID)

class ActionTrlUpdatedEvent(id: UUID) : AbstractBaseTranslationEvent(id) {
    var name: String? = null
    var value: String? = null
    var tooltip: String? = null
}

class ElementImportedEvent {
    var elements: Map<String, ElementDTO> = HashMap()
}

class ElementCreatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var name: String? = null
    var category: String? = null
    var translated = false
    var translations: List<ElementTrlCreatedEvent> = ArrayList()
}

class ElementUpdatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var name: String? = null
    var category: String? = null
    var translated = false
    var translations: List<ElementTrlUpdatedEvent> = ArrayList()
}

class ElementDeletedEvent(var id: UUID)

class ElementTrlCreatedEvent(id: UUID) : AbstractBaseTranslationEvent(id) {
    var name: String? = null
    var value: String? = null
    var tooltip: String? = null
}

class ElementTrlDeletedEvent(var id: UUID)

class ElementTrlUpdatedEvent(id: UUID) : AbstractBaseTranslationEvent(id) {
    var name: String? = null
    var value: String? = null
    var tooltip: String? = null
}

class MessageImportedEvent {
    var messages: Map<String, MessageDTO> = HashMap()
}

class MessageCreatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var name: String? = null
    var category: String? = null
    var translated = false
    var translations: List<MessageTrlCreatedEvent> = ArrayList()
}

class MessageUpdatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var name: String? = null
    var category: String? = null
    var translated = false
    var translations: List<MessageTrlUpdatedEvent> = ArrayList()
}

class MessageDeletedEvent(var id: UUID)

class MessageTrlCreatedEvent(id: UUID) : AbstractBaseTranslationEvent(id) {
    var name: String? = null
    var value: String? = null
}

class MessageTrlDeletedEvent(var id: UUID)

class MessageTrlUpdatedEvent(id: UUID) : AbstractBaseTranslationEvent(id) {
    var name: String? = null
    var value: String? = null
}

class FileNotImportedEvent(var id: UUID, var uploadId: UUID, var errorMessage: String)
class FileImportedEvent(var id: UUID, var uploadId: UUID)
class FileValidatedEvent(var id: UUID, var uploadId: UUID)
class FileNotValidatedEvent(var id: UUID, var uploadId: UUID, var errorMessage: String)
class UploadSubmittedEvent(var id: UUID, var uploadId: UUID) {
    var filename: String? = null
    var validated = false
    var imported = false
    var errorMessage: String? = null
}