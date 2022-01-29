package org.jhapy.cqrs.command.notification

import org.jhapy.cqrs.command.CreateEntityCommand
import org.jhapy.cqrs.command.DeleteEntityCommand
import org.jhapy.cqrs.command.UpdateEntityCommand
import org.jhapy.dto.domain.notification.*
import java.io.Serializable
import java.util.*

class CreateMailTemplateCommand(entity: MailTemplateDTO) : CreateEntityCommand<MailTemplateDTO>(entity), Serializable
class UpdateMailTemplateCommand(id: UUID, entity: MailTemplateDTO) : UpdateEntityCommand<MailTemplateDTO>(id, entity),
    Serializable

class DeleteMailTemplateCommand(id: UUID) : DeleteEntityCommand<MailTemplateDTO>(id), Serializable

class CreateSmsTemplateCommand(entity: SmsTemplateDTO) : CreateEntityCommand<SmsTemplateDTO>(entity), Serializable
class UpdateSmsTemplateCommand(id: UUID, entity: SmsTemplateDTO) : UpdateEntityCommand<SmsTemplateDTO>(id, entity),
    Serializable

class DeleteSmsTemplateCommand(id: UUID) : DeleteEntityCommand<SmsTemplateDTO>(id), Serializable

class CreateCloudDataMessageTemplateCommand(entity: CloudDataMessageTemplateDTO) :
    CreateEntityCommand<CloudDataMessageTemplateDTO>(entity), Serializable

class UpdateCloudDataMessageTemplateCommand(id: UUID, entity: CloudDataMessageTemplateDTO) :
    UpdateEntityCommand<CloudDataMessageTemplateDTO>(id, entity), Serializable

class DeleteCloudDataMessageTemplateCommand(id: UUID) : DeleteEntityCommand<CloudDataMessageTemplateDTO>(id),
    Serializable

class CreateCloudNotificationMessageTemplateCommand(entity: CloudNotificationMessageTemplateDTO) :
    CreateEntityCommand<CloudNotificationMessageTemplateDTO>(entity), Serializable

class UpdateCloudNotificationMessageTemplateCommand(id: UUID, entity: CloudNotificationMessageTemplateDTO) :
    UpdateEntityCommand<CloudNotificationMessageTemplateDTO>(id, entity), Serializable

class DeleteCloudNotificationMessageTemplateCommand(id: UUID) :
    DeleteEntityCommand<CloudNotificationMessageTemplateDTO>(id), Serializable

class CreateMailCommand(entity: MailDTO) : CreateEntityCommand<MailDTO>(entity), Serializable
class UpdateMailCommand(id: UUID, entity: MailDTO) : UpdateEntityCommand<MailDTO>(id, entity), Serializable
class DeleteMailCommand(id: UUID) : DeleteEntityCommand<MailDTO>(id), Serializable

class CreateSmsCommand(entity: SmsDTO) : CreateEntityCommand<SmsDTO>(entity), Serializable
class UpdateSmsCommand(id: UUID, entity: SmsDTO) : UpdateEntityCommand<SmsDTO>(id, entity), Serializable
class DeleteSmsCommand(id: UUID) : DeleteEntityCommand<SmsDTO>(id), Serializable

class CreateCloudDataMessageCommand(entity: CloudDataMessageDTO) : CreateEntityCommand<CloudDataMessageDTO>(entity),
    Serializable

class UpdateCloudDataMessageCommand(id: UUID, entity: CloudDataMessageDTO) :
    UpdateEntityCommand<CloudDataMessageDTO>(id, entity), Serializable

class DeleteCloudDataMessageCommand(id: UUID) : DeleteEntityCommand<CloudDataMessageDTO>(id), Serializable

class CreateCloudNotificationMessageCommand(entity: CloudNotificationMessageDTO) :
    CreateEntityCommand<CloudNotificationMessageDTO>(entity), Serializable

class UpdateCloudNotificationMessageCommand(id: UUID, entity: CloudNotificationMessageDTO) :
    UpdateEntityCommand<CloudNotificationMessageDTO>(id, entity), Serializable

class DeleteCloudNotificationMessageCommand(id: UUID) : DeleteEntityCommand<CloudNotificationMessageDTO>(id),
    Serializable
