package org.jhapy.cqrs.event.resource

import org.jhapy.cqrs.event.AbstractBaseEvent
import org.jhapy.dto.utils.PdfConvert
import java.util.*

class StoredFileCreatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var filename: String? = null
    var mimeType: String? = null
    var filesize: Long? = null
    var content: ByteArray? = null
    var originalContent: ByteArray? = null
    var pdfConvertStatus: PdfConvert? = null
    var pdfContent: ByteArray? = null
    var metadata: Map<String, String> = HashMap()
    var relatedObjectId: UUID? = null
    var relatedObjectClass: String? = null
    var hasChanged = false
}

class StoredFileUpdatedEvent(id: UUID) : AbstractBaseEvent(id) {
    var filename: String? = null
    var mimeType: String? = null
    var filesize: Long? = null
    var content: ByteArray? = null
    var originalContent: ByteArray? = null
    var pdfConvertStatus: PdfConvert? = null
    var pdfContent: ByteArray? = null
    var metadata: Map<String, String> = HashMap()
    var relatedObjectId: UUID? = null
    var relatedObjectClass: String? = null
    var hasChanged = false
}

class StoredFileDeletedEvent(var id: UUID)