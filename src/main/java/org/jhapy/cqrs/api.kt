package org.jhapy.cqrs

import org.jhapy.dto.utils.AppContext
import org.jhapy.dto.utils.LatLng
import org.jhapy.dto.utils.Pageable
import java.io.Serializable
import java.util.*

abstract class AbstractBaseQuery : Serializable {
    val queryUsername: String?
    val queryNickname: String?
    val queryUserId: UUID?
    val querySessionId: String?
    val queryIso3Language: String?
    val queryCurrentPosition: LatLng?
    val queryExternalClientID: UUID?
    val queryMailbox: String?
    val queryMailboxFullName: String?

    init {
        queryUsername = AppContext.getInstance().currentUsername
        queryUserId = AppContext.getInstance().currentUserId
        queryNickname = AppContext.getInstance().currentNickname
        querySessionId = AppContext.getInstance().currentSessionId
        queryIso3Language = AppContext.getInstance().currentIso3Language
        queryCurrentPosition = AppContext.getInstance().currentPosition
        queryExternalClientID = AppContext.getInstance().externalClientID
        queryMailbox = AppContext.getInstance().mailbox
        queryMailboxFullName = AppContext.getInstance().mailboxFullName
    }
}

abstract class AbstractCountAnyMatchingQuery(val filter: String?, val showInactive: Boolean?) : AbstractBaseQuery()
abstract class AbstractFindAnyMatchingQuery(val filter: String?, val showInactive: Boolean?, var pageable: Pageable?) :
    AbstractBaseQuery()

abstract class AbstractGetAllGenericQuery : AbstractBaseQuery()
abstract class AbstractGetByIdGenericQuery(val id: UUID) : AbstractBaseQuery()

class CountChangedUpdate


