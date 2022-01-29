package org.jhapy.cqrs.event.notification

import org.jhapy.cqrs.event.AbstractBaseEvent
import org.jhapy.dto.domain.notification.CloudDataMessageStatusEnum
import org.jhapy.dto.domain.notification.CloudNotificationMessageStatusEnum
import org.jhapy.dto.domain.notification.MailStatusEnum
import org.jhapy.dto.domain.notification.SmsStatusEnum
import java.util.*

class MailTemplateCreatedEvent(id: UUID, var name: String, var mailAction: String) : AbstractBaseEvent(id) {
    var subject: String? = null
    var body: String? = null
    var bodyHtml: String? = null
    var copyTo: String? = null
    var from: String? = null
    var iso3Language: String? = null
}

class MailTemplateUpdatedEvent(id: UUID, var name: String, var mailAction: String) : AbstractBaseEvent(id) {
    var subject: String? = null
    var body: String? = null
    var bodyHtml: String? = null
    var copyTo: String? = null
    var from: String? = null
    var iso3Language: String? = null
}

class MailTemplateDeletedEvent(var id: UUID)

class SmsTemplateCreatedEvent(id: UUID, var name: String, var smsAction: String) : AbstractBaseEvent(id) {
    var body: String? = null
    var iso3Language: String? = null
}

class SmsTemplateUpdatedEvent(id: UUID, var name: String, var smsAction: String) : AbstractBaseEvent(id) {
    var body: String? = null
    var iso3Language: String? = null
}

class SmsTemplateDeletedEvent(var id: UUID)

class CloudDataMessageTemplateCreatedEvent(id: UUID, var name: String, var cloudDataMessageAction: String) :
    AbstractBaseEvent(id) {
    var data: String? = null
    var iso3Language: String? = null
}

class CloudDataMessageTemplateUpdatedEvent(id: UUID, var name: String, var cloudDataMessageAction: String) :
    AbstractBaseEvent(id) {
    var data: String? = null
    var iso3Language: String? = null
}

class CloudDataMessageTemplateDeletedEvent(var id: UUID)

class CloudNotificationMessageTemplateCreatedEvent(
    id: UUID,
    var name: String,
    var cloudNotificationMessageAction: String
) : AbstractBaseEvent(id) {
    var title: String? = null
    var body: String? = null
    var data: String? = null
    var iso3Language: String? = null
}

class CloudNotificationMessageTemplateUpdatedEvent(
    id: UUID,
    var name: String,
    var cloudNotificationMessageAction: String
) : AbstractBaseEvent(id) {
    var title: String? = null
    var body: String? = null
    var data: String? = null
    var iso3Language: String? = null
}

class CloudNotificationMessageTemplateDeletedEvent(var id: UUID)

class MailCreatedEvent(id: UUID, var mailAction: String) : AbstractBaseEvent(id) {
    var to: String? = null
    var copyTo: String? = null
    var from: String? = null
    var subject: String? = null
    var body: String? = null
    var attachments: Map<String, ByteArray>? = null
    var attributes: Map<String, String>? = null
    var applicationName: String? = null
    var iso3Language: String? = null
    var mailStatus: MailStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
}

class MailUpdatedEvent(id: UUID, var mailAction: String) : AbstractBaseEvent(id) {
    var to: String? = null
    var copyTo: String? = null
    var from: String? = null
    var subject: String? = null
    var body: String? = null
    var attachments: Map<String, ByteArray>? = null
    var attributes: Map<String, String>? = null
    var applicationName: String? = null
    var iso3Language: String? = null
    var mailStatus: MailStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
}

class MailDeletedEvent(var id: UUID)

class SmsCreatedEvent(id: UUID, var smsAction: String) : AbstractBaseEvent(id) {
    var phoneNumber: String? = null
    var body: String? = null
    var attributes: Map<String, String>? = null
    var applicationName: String? = null
    var iso3Language: String? = null
    var smsStatus: SmsStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
}

class SmsUpdatedEvent(id: UUID, var smsAction: String) : AbstractBaseEvent(id) {
    var phoneNumber: String? = null
    var body: String? = null
    var attributes: Map<String, String>? = null
    var applicationName: String? = null
    var iso3Language: String? = null
    var smsStatus: SmsStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
}

class SmsDeletedEvent(var id: UUID)

class CloudDataMessageCreatedEvent(id: UUID, var cloudDataMessageAction: String) : AbstractBaseEvent(id) {
    var deviceToken: String? = null
    var data: String? = null
    var topic: String? = null
    var attributes: Map<String, String>? = null
    var cloudDataMessageStatus: CloudDataMessageStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class CloudDataMessageUpdatedEvent(id: UUID, var cloudDataMessageAction: String) : AbstractBaseEvent(id) {
    var deviceToken: String? = null
    var data: String? = null
    var topic: String? = null
    var attributes: Map<String, String>? = null
    var cloudDataMessageStatus: CloudDataMessageStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class CloudDataMessageDeletedEvent(var id: UUID)

class CloudNotificationMessageCreatedEvent(id: UUID, var cloudNotificationMessageAction: String) :
    AbstractBaseEvent(id) {
    var deviceToken: String? = null
    var title: String? = null
    var body: String? = null
    var data: String? = null
    var attributes: Map<String, String>? = null
    var cloudNotificationMessageStatus: CloudNotificationMessageStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class CloudNotificationMessageUpdatedEvent(id: UUID, var cloudNotificationMessageAction: String) :
    AbstractBaseEvent(id) {
    var deviceToken: String? = null
    var title: String? = null
    var body: String? = null
    var data: String? = null
    var attributes: Map<String, String>? = null
    var cloudNotificationMessageStatus: CloudNotificationMessageStatusEnum? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class CloudNotificationMessageDeletedEvent(var id: UUID)