package org.jhapy.cqrs.command.i18n

import org.jhapy.cqrs.command.CreateEntityCommand
import org.jhapy.cqrs.command.DeleteEntityCommand
import org.jhapy.cqrs.command.UpdateEntityCommand
import org.jhapy.dto.domain.i18n.*
import java.io.Serializable
import java.util.*

class CreateActionCommand(entity: ActionDTO) : CreateEntityCommand<ActionDTO>(entity), Serializable
class CreateActionTrlCommand(entity: ActionTrlDTO) : CreateEntityCommand<ActionTrlDTO>(entity), Serializable

class CreateElementCommand(entity: ElementDTO) : CreateEntityCommand<ElementDTO>(entity), Serializable
class CreateElementTrlCommand(entity: ElementTrlDTO) : CreateEntityCommand<ElementTrlDTO>(entity), Serializable

class CreateMessageCommand(entity: MessageDTO) : CreateEntityCommand<MessageDTO>(entity), Serializable
class CreateMessageTrlCommand(entity: MessageTrlDTO) : CreateEntityCommand<MessageTrlDTO>(entity), Serializable

class DeleteActionCommand(id: UUID) : DeleteEntityCommand<ActionDTO>(id), Serializable
class DeleteActionTrlCommand(id: UUID) : DeleteEntityCommand<ActionTrlDTO>(id), Serializable

class DeleteElementCommand(id: UUID) : DeleteEntityCommand<ElementDTO>(id), Serializable
class DeleteElementTrlCommand(id: UUID) : DeleteEntityCommand<ElementTrlDTO>(id), Serializable

class DeleteMessageCommand(id: UUID) : DeleteEntityCommand<MessageDTO>(id), Serializable
class DeleteMessageTrlCommand(id: UUID) : DeleteEntityCommand<MessageTrlDTO>(id), Serializable

class UpdateActionCommand(id: UUID, entity: ActionDTO) : UpdateEntityCommand<ActionDTO>(id, entity), Serializable
class UpdateActionTrlCommand(id: UUID, entity: ActionTrlDTO) : UpdateEntityCommand<ActionTrlDTO>(id, entity),
    Serializable

class UpdateElementCommand(id: UUID, entity: ElementDTO) : UpdateEntityCommand<ElementDTO>(id, entity), Serializable
class UpdateElementTrlCommand(id: UUID, entity: ElementTrlDTO) : UpdateEntityCommand<ElementTrlDTO>(id, entity),
    Serializable

class UpdateMessageCommand(id: UUID, entity: MessageDTO) : UpdateEntityCommand<MessageDTO>(id, entity), Serializable
class UpdateMessageTrlCommand(id: UUID, entity: MessageTrlDTO) : UpdateEntityCommand<MessageTrlDTO>(id, entity),
    Serializable