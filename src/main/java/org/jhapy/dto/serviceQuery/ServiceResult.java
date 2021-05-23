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

package org.jhapy.dto.serviceQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import java.io.Serializable;
import java.time.Instant;
import java.util.function.Consumer;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.jhapy.dto.utils.DateConverter.Deserialize;
import org.jhapy.dto.utils.DateConverter.Serialize;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Represents the result of a remote Service call (using Feign)
 *
 * Contains success or failure status, failure message and result data
 *
 * @param <T> Data type of the result (mostly when success)
 */
@Data
public class ServiceResult<T> implements Serializable {

  private String exceptionString;
  private String exceptionClass;
  private boolean isSuccess;
  private String message;
  private String messageTitle;
  private T data;

  /**
   * Create a new Service Result As Success
   */
  public ServiceResult() {
    isSuccess = true;
  }

  /**
   * Create a new Service Result As Failed with an error message
   *
   * @param message Error message
   */
  public ServiceResult(String message) {
    this(Boolean.FALSE, message, null);
  }

  /**
   * Create a new Service Result As Success with some data
   *
   * @param data Service Result Data
   */
  public ServiceResult(T data) {
    this(Boolean.TRUE, null, data);
  }

  /**
   * Create a new Service Result As Failed with an exception
   *
   * @param throwable Service Result Exception
   */
  public ServiceResult(Throwable throwable) {
    setExceptionClass(throwable.getClass().getName());
    try {
      setExceptionString(jsonObjectMapper().writeValueAsString(throwable));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    setIsSuccess(false);
    setMessage(throwable.getMessage());
  }

  @JsonIgnore
  private ObjectMapper jsonObjectMapper() {
    return Jackson2ObjectMapperBuilder.json()
        .modules(module(), new JavaTimeModule())
        .build();
  }

  @JsonIgnore
  private Module module() {
    SimpleModule module = new SimpleModule();
    module.addSerializer(Instant.class, new Serialize());
    module.addDeserializer(Instant.class, new Deserialize());
    return module;
  }

  /**
   * Create a new Service Result
   *
   * @param isSuccess Service success or not
   * @param message Message to be sent (mostly when error)
   * @param data Data to be sent (mostly when success)
   */
  public ServiceResult(Boolean isSuccess, String message, T data) {
    setIsSuccess(isSuccess);
    setMessage(message);
    setData(data);
  }

  @JsonIgnore
  public Object getException() {
    if (StringUtils.isNotBlank(exceptionString) && StringUtils.isNotBlank(exceptionClass)) {
      try {
        return jsonObjectMapper().readValue(exceptionString, Class.forName(exceptionClass));
      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public boolean getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public void ifSuccess(Consumer<? super T> action) {
    if (isSuccess && data != null) {
      action.accept(data);
    }
  }

  public void ifSuccessOrElse(Consumer<? super T> action, Runnable emptyAction) {
    if (isSuccess && data != null) {
      action.accept(data);
    } else {
      emptyAction.run();
    }
  }

  public T ifSuccessOrElse(T other) {
    if (isSuccess && data != null) {
      return data;
    } else {
      return other;
    }
  }
  public T ifSuccessOrElseWithError(T other, Consumer<ServiceResult<T>> errorAction) {
    if (isSuccess && data != null) {
      return data;
    } else {
      errorAction.accept(this);
      return other;
    }
  }
}
