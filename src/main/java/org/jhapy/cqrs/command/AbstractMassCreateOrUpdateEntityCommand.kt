/*
 * Copyright 2020-2020 the original author or authors from the JHapy project.
 *
 * This file is part of the JHapy project, see https://www.jhapy.org/ for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jhapy.cqrs.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import org.jhapy.dto.domain.BaseEntity
import java.io.Serializable
import java.util.*

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
class AbstractMassCreateOrUpdateEntityCommand<T : BaseEntity?>(entity: T) : AbstractBaseCommand(), Serializable {
    @TargetAggregateIdentifier
    val id = UUID.randomUUID()
}