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

package org.jhapy.dto.registry;

import lombok.Data;

import java.util.Set;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 07/06/2020
 */
@Data
public class Thread {

  private Long waitedCount;
  private Long lockOwnerId;
  private Long waitedTime;
  private Set<LockedMonitor> lockedMonitors;
  private Long blockedCount;
  private String threadState;
  private Boolean inNative;
  private Long priority;
  private String threadName;
  private Boolean suspended;
  private Boolean daemon;
  private Long threadId;
  private LockInfo lockInfo;
  private Set<StackTrace> stackTrace;
  private Long blockedTime;
  private String lockName;
  private String lockOwnerName;
  private Set<LockedSynchronizers> lockedSynchronizers;

  @Data
  public static class LockedSynchronizers {

    private Long identityHashCode;
    private String className;
  }

  @Data
  public static class LockInfo {

    private Long identityHashCode;
    private String className;
  }

  @Data
  public static class LockedMonitor {

    private Long identityHashCode;
    private Long lockedStackDepth;
    private String className;
    private LockedStackFrame lockedStackFrame;

    @Data
    public static class LockedStackFrame {

      private String fileName;
      private String moduleVersion;
      private String moduleName;
      private Boolean nativeMethod;
      private String methodName;
      private String className;
      private Long lineNumber;
      private String classLoaderName;
    }
  }

  @Data
  public static class StackTrace {

    private String fileName;
    private String moduleVersion;
    private String moduleName;
    private Boolean nativeMethod;
    private String methodName;
    private String className;
    private Long lineNumber;
    private String classLoaderName;
  }
}