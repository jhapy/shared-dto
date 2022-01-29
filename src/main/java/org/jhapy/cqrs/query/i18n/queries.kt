package org.jhapy.cqrs.query.i18n;

import org.jhapy.cqrs.AbstractBaseQuery
import org.jhapy.cqrs.AbstractCountAnyMatchingQuery
import org.jhapy.cqrs.AbstractFindAnyMatchingQuery
import org.jhapy.cqrs.AbstractGetByIdGenericQuery
import org.jhapy.dto.domain.i18n.ActionDTO
import org.jhapy.dto.domain.i18n.ElementDTO
import org.jhapy.dto.domain.i18n.MessageDTO
import org.jhapy.dto.utils.Pageable
import java.time.Instant
import java.util.*

class CountAnyMatchingActionQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

class FindAnyMatchingActionQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

class CountAnyMatchingElementQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

class FindAnyMatchingElementQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

class CountAnyMatchingMessageQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

class FindAnyMatchingMessageQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class CountAnyMatchingActionResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

data class FindAnyMatchingActionResponse(val data: List<ActionDTO>)

data class CountAnyMatchingElementResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

data class FindAnyMatchingElementResponse(val data: List<ElementDTO>)

data class CountAnyMatchingMessageResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

data class FindAnyMatchingMessageResponse(val data: List<MessageDTO>)
class GetActionByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetElementByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetMessageByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)

class GetActionByIdResponse(val data: ActionDTO?)
class GetElementByIdResponse(val data: ElementDTO?)
class GetMessageByIdResponse(val data: MessageDTO?)

class GetActionByNameQuery(val name: String) : AbstractBaseQuery()
class GetElementByNameQuery(val name: String) : AbstractBaseQuery()
class GetMessageByNameQuery(val name: String) : AbstractBaseQuery()

class GetActionByNameResponse(val data: ActionDTO?)
class GetElementByNameResponse(val data: ElementDTO?)
class GetMessageByNameResponse(val data: MessageDTO?)

class GetAllActionsQuery : AbstractBaseQuery()
class GetAllElementsQuery : AbstractBaseQuery()
class GetAllMessagesQuery : AbstractBaseQuery()

class GetAllActionsResponse(val data: List<ActionDTO>)
class GetAllElementsResponse(val data: List<ElementDTO>)
class GetAllMessagesResponse(val data: List<MessageDTO>)

class GetExistingLanguagesQuery : AbstractBaseQuery()
data class GetExistingLanguagesResponse(val data: Set<String>) {
    constructor() : this(Collections.emptySet())
}