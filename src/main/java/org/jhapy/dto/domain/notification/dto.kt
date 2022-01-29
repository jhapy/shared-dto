package org.jhapy.dto.domain.notification

import org.jhapy.dto.domain.BaseEntityUUIDId
import java.util.*

class MailDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    var to: String? = null
    var copyTo: String? = null
    var from: String? = null
    var subject: String? = null
    var body: String? = null
    var attachments: Map<String, ByteArray>? = null
    var attributes: Map<String, String>? = null
    var mailStatus: MailStatusEnum? = null
    var mailAction: String? = null
    var errorMessage: String? = null
    var nbRetry = 0.0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class MailTemplateDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    lateinit var mailAction: String
    var subject: String? = null
    var body: String? = null
    var bodyHtml: String? = null
    var copyTo: String? = null
    var from: String? = null
    var iso3Language: String? = null
}

class SmsDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    var phoneNumber: String? = null
    var body: String? = null
    var smsStatus: SmsStatusEnum? = null
    var smsAction: String? = null
    var attributes: Map<String, String>? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class SmsTemplateDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    lateinit var smsAction: String
    var body: String? = null
    var iso3Language: String? = null
}

class CloudDataMessageDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    var deviceToken: String? = null
    var data: String? = null
    var topic: String? = null
    var cloudDataMessageStatus: CloudDataMessageStatusEnum? = null
    var cloudDataMessageAction: String? = null
    var attributes: Map<String, String>? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class CloudDataMessageTemplateDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    lateinit var data: String
    lateinit var cloudDataMessageAction: String
    var iso3Language: String? = null
}

class CloudNotificationMessageDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    var deviceToken: String? = null
    var title: String? = null
    var body: String? = null
    var data: String? = null
    var cloudNotificationMessageStatus: CloudNotificationMessageStatusEnum? = null
    var cloudNotificationMessageAction: String? = null
    var attributes: Map<String, String>? = null
    var errorMessage: String? = null
    var nbRetry = 0
    var applicationName: String? = null
    var iso3Language: String? = null
}

class CloudNotificationMessageTemplateDTO(id: UUID? = UUID.randomUUID()) : BaseEntityUUIDId(id) {
    lateinit var name: String
    lateinit var cloudNotificationMessageAction: String
    var title: String? = null
    var body: String? = null
    var data: String? = null
    var iso3Language: String? = null
}

enum class MailActionEnum {
    EMAIL_VERIFICATION, EMAIL_FORGET_PASSWORD
}

enum class MailStatusEnum {
    NOT_SENT, SENT, ERROR, RETRYING
}

enum class CloudDataMessageStatusEnum {
    NOT_SENT, SENT, ERROR, RETRYING
}

enum class CloudNotificationMessageStatusEnum {
    NOT_SENT, SENT, ERROR, RETRYING
}

enum class SmsActionEnum {
    SMS_VERIFICATION, SMS_FORGET_PASSWORD
}

enum class SmsStatusEnum {
    NOT_SENT, SENT, ERROR, RETRYING
}