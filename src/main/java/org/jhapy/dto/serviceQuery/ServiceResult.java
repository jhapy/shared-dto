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
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Data;
import org.jhapy.dto.utils.DateConverter.Deserialize;
import org.jhapy.dto.utils.DateConverter.Serialize;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.util.function.Consumer;

/**
 * Represents the result of a remote Service call (using Feign)
 *
 * <p>Contains success or failure status, failure message and result data
 *
 * @param <T> Data type of the result (mostly when success)
 */
@Data
public class ServiceResult<T> implements Serializable {

  private String exceptionString;
  private boolean isSuccess;
  private String message;
  private String messageTitle;
  private T data;

  /** Create a new Service Result As Success */
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
  private ObjectMapper jsonObjectMapper() {
    return Jackson2ObjectMapperBuilder.json().modules(module(), new JavaTimeModule()).build();
  }

  @JsonIgnore
  private Module module() {
    SimpleModule module = new SimpleModule();
    module.addSerializer(Instant.class, new Serialize());
    module.addDeserializer(Instant.class, new Deserialize());
    return module;
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

  public void ifSuccessOrElse(Consumer<? super T> action, Consumer<ServiceResult<T>> errorAction) {
    if (isSuccess && data != null) {
      action.accept(data);
    } else {
      errorAction.accept(this);
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

  public T ifSuccessOrWithError(Consumer<ServiceResult<T>> errorAction) {
    if (!isSuccess) errorAction.accept(this);

    return data;
  }
}
