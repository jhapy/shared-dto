package org.jhapy.cqrs.command.resource

import org.jhapy.cqrs.command.CreateEntityCommand
import org.jhapy.cqrs.command.DeleteEntityCommand
import org.jhapy.cqrs.command.UpdateEntityCommand
import org.jhapy.dto.domain.resource.StoredFileDTO
import java.io.Serializable
import java.util.*

class CreateStoredFileCommand(entity: StoredFileDTO) : CreateEntityCommand<StoredFileDTO>(entity), Serializable
class UpdateStoredFileCommand(id: UUID, entity: StoredFileDTO) : UpdateEntityCommand<StoredFileDTO>(id, entity),
    Serializable

class DeleteStoredFileCommand(id: UUID) : DeleteEntityCommand<StoredFileDTO>(id), Serializable