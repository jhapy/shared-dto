package org.jhapy.dto.domain.resource

import org.jhapy.dto.domain.BaseEntityUUIDId
import org.jhapy.dto.utils.PdfConvert
import java.util.*

class StoredFileDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
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
