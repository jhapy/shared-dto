package org.jhapy.cqrs.query.audit

import org.jhapy.cqrs.AbstractBaseQuery
import org.jhapy.cqrs.AbstractCountAnyMatchingQuery
import org.jhapy.cqrs.AbstractFindAnyMatchingQuery
import org.jhapy.cqrs.AbstractGetByIdGenericQuery
import org.jhapy.dto.domain.audit.SessionDTO
import org.jhapy.dto.utils.Pageable
import java.time.Instant
import java.util.*

class FindAnyMatchingSessionQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingSessionResponse(val data: List<SessionDTO>)

class CountAnyMatchingSessionQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingSessionResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetSessionByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetSessionByIdResponse(val data: SessionDTO?)

class GetSessionByJSessionIdQuery(var jsessionId: String) : AbstractBaseQuery()
class GetSessionByJSessionIdResponse(val data: SessionDTO?)

class GetAllSessionsQuery : AbstractBaseQuery()
class GetAllSessionsResponse(val data: List<SessionDTO>)
