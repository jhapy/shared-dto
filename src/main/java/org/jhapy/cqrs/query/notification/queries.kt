package org.jhapy.cqrs.query.notification

import org.jhapy.cqrs.AbstractBaseQuery
import org.jhapy.cqrs.AbstractCountAnyMatchingQuery
import org.jhapy.cqrs.AbstractFindAnyMatchingQuery
import org.jhapy.cqrs.AbstractGetByIdGenericQuery
import org.jhapy.dto.domain.i18n.ElementDTO
import org.jhapy.dto.domain.notification.*
import org.jhapy.dto.utils.Pageable
import java.time.Instant
import java.util.*

// Mail Template 

class FindAnyMatchingMailTemplateQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingMailTemplateResponse(val data: List<MailTemplateDTO>)

class CountAnyMatchingMailTemplateQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingMailTemplateResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetMailTemplateByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetMailTemplateByIdResponse(val data: MailTemplateDTO?)

class GetAllMailTemplatesQuery : AbstractBaseQuery()
class GetAllMailTemplatesResponse(val data: List<MailTemplateDTO>)

class GetMailTemplateByMailActionQuery(val mailAction: String) : AbstractBaseQuery()
class GetMailTemplateByMailActionResponse(val data: MailTemplateDTO?)

// Mail

class FindAnyMatchingMailQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingMailResponse(val data: List<MailDTO>)

class CountAnyMatchingMailQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingMailResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetMailByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetMailByIdResponse(val data: MailDTO?)

class GetAllMailsQuery : AbstractBaseQuery()
class GetAllMailsResponse(val data: List<MailDTO>)

// SMS Template

class FindAnyMatchingSmsTemplateQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingSmsTemplateResponse(val data: List<SmsTemplateDTO>)

class CountAnyMatchingSmsTemplateQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingSmsTemplateResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetSmsTemplateByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetSmsTemplateByIdResponse(val data: SmsTemplateDTO?)

class GetAllSmsTemplatesQuery : AbstractBaseQuery()
class GetAllSmsTemplatesResponse(val data: List<SmsTemplateDTO>)

class GetSmsTemplateBySmsActionQuery(val smsAction: String) : AbstractBaseQuery()
class GetSmsTemplateBySmsActionResponse(val data: SmsTemplateDTO?)

// SMS

class FindAnyMatchingSmsQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingSmsResponse(val data: List<SmsDTO>)

class CountAnyMatchingSmsQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingSmsResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetSmsByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetSmsByIdResponse(val data: SmsDTO?)

class GetAllSmssQuery : AbstractBaseQuery()
class GetAllSmssResponse(val data: List<SmsDTO>)

// Cloud Data Message Template

class FindAnyMatchingCloudDataMessageTemplateQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingCloudDataMessageTemplateResponse(val data: List<CloudDataMessageTemplateDTO>)

class CountAnyMatchingCloudDataMessageTemplateQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingCloudDataMessageTemplateResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetCloudDataMessageTemplateByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetCloudDataMessageTemplateByIdResponse(val data: CloudDataMessageTemplateDTO?)

class GetAllCloudDataMessageTemplatesQuery : AbstractBaseQuery()
class GetAllCloudDataMessageTemplatesResponse(val data: List<CloudDataMessageTemplateDTO>)

class GetCloudDataMessageTemplateByCloudDataMessageActionQuery(val cloudDataMessageAction: String) : AbstractBaseQuery()
class GetCloudDataMessageTemplateByCloudDataMessageActionResponse(val data: CloudDataMessageTemplateDTO?)

// Cloud Data Message

class FindAnyMatchingCloudDataMessageQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingCloudDataMessageResponse(val data: List<CloudDataMessageDTO>)

class CountAnyMatchingCloudDataMessageQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingCloudDataMessageResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetCloudDataMessageByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetCloudDataMessageByIdResponse(val data: CloudDataMessageDTO?)

class GetAllCloudDataMessagesQuery : AbstractBaseQuery()
class GetAllCloudDataMessagesResponse(val data: List<CloudDataMessageDTO>)

// Cloud Notification Message Template

class FindAnyMatchingCloudNotificationMessageTemplateQuery(
    filter: String?,
    showInactive: Boolean?,
    pageable: Pageable?
) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingCloudNotificationMessageTemplateResponse(val data: List<CloudNotificationMessageTemplateDTO>)

class CountAnyMatchingCloudNotificationMessageTemplateQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingCloudNotificationMessageTemplateResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetCloudNotificationMessageTemplateByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetCloudNotificationMessageTemplateByIdResponse(val data: CloudNotificationMessageTemplateDTO?)

class GetAllCloudNotificationMessageTemplatesQuery : AbstractBaseQuery()
class GetAllCloudNotificationMessageTemplatesResponse(val data: List<CloudNotificationMessageTemplateDTO>)

class GetCloudNotificationMessageTemplateByCloudNotificationMessageActionQuery(val cloudNotificationMessageAction: String) :
    AbstractBaseQuery()

class GetCloudNotificationMessageTemplateByCloudNotificationMessageActionResponse(val data: CloudNotificationMessageTemplateDTO?)

// Cloud Notification Message

class FindAnyMatchingCloudNotificationMessageQuery(filter: String?, showInactive: Boolean?, pageable: Pageable?) :
    AbstractFindAnyMatchingQuery(filter, showInactive, pageable)

data class FindAnyMatchingCloudNotificationMessageResponse(val data: List<CloudNotificationMessageDTO>)

class CountAnyMatchingCloudNotificationMessageQuery(filter: String?, showInactive: Boolean?) :
    AbstractCountAnyMatchingQuery(filter, showInactive)

data class CountAnyMatchingCloudNotificationMessageResponse(val count: Long) {
    val lastEvent: Long = Instant.now().toEpochMilli()
}

class GetCloudNotificationMessageByIdQuery(id: UUID) : AbstractGetByIdGenericQuery(id)
class GetCloudNotificationMessageByIdResponse(val data: CloudNotificationMessageDTO?)

class GetAllCloudNotificationMessagesQuery : AbstractBaseQuery()
class GetAllCloudNotificationMessagesResponse(val data: List<CloudNotificationMessageDTO>)