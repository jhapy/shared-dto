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

import org.jhapy.dto.utils.AppContext
import org.jhapy.dto.utils.LatLng
import java.io.Serializable
import java.util.*

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 2019-06-02
 */
abstract class AbstractBaseCommand protected constructor() : Serializable {
    var queryUsername: String? = null
    var queryNickname: String? = null
    var queryUserId: UUID? = null
    var querySessionId: String? = null
    var queryIso3Language: String? = null
    var queryCurrentPosition: LatLng? = null
    var queryExternalClientID: UUID? = null
    var queryMailbox: String? = null
    var queryMailboxFullName: String? = null

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