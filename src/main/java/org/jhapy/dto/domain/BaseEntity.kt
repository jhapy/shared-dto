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
package org.jhapy.dto.domain

import java.io.Serializable
import java.time.Instant
import java.util.*

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-03-06
 */
abstract class BaseEntity(givenId: Any? = null) : Serializable {

    /** DB Generated ID  */
    open var id: Any? = givenId

    var persisted: Boolean? = false

    /** Who create this record (no ID, use username)  */
    var createdBy: String? = null

    /** When this record has been created  */
    var created: Instant? = null

    /** How did the last modification of this record (no ID, use username)  */
    var modifiedBy: String? = null

    /** When this record was last updated  */
    var modified: Instant? = null

    /** Version of the record. Used for synchronization and concurrent access.  */
    var version: Long? = null
    var clientId: UUID? = null
    var clientName: String? = null

    /** Indicate if the current record is active (deactivate instead of delete)  */
    var isActive = true
}