package org.jhapy.cqrs.query.resource

import org.jhapy.cqrs.AbstractBaseQuery
import org.jhapy.cqrs.AbstractCountAnyMatchingQuery
import org.jhapy.cqrs.AbstractFindAnyMatchingQuery
import org.jhapy.cqrs.AbstractGetByIdGenericQuery
import org.jhapy.dto.domain.resource.StoredFileDTO
import org.jhapy.dto.utils.Pageable
import java.time.Instant
import java.util.*

class FindAnyMatchingStoredFileQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingStoredFileResponse(val data: List<StoredFileDTO>)

class CountAnyMatchingStoredFileQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingStoredFileResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetStoredFileByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetStoredFileByIdResponse(val data: StoredFileDTO?)

class GetStoredFileByIdNoContentQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetStoredFileByIdNoContentResponse(val data: StoredFileDTO?)

class GetStoredFileByIdPdfContentQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetStoredFileByIdPdfContentResponse(val data: StoredFileDTO?)

class GetAllStoredFilesQuery : AbstractBaseQuery()
class GetAllStoredFilesResponse(val data: List<StoredFileDTO>)