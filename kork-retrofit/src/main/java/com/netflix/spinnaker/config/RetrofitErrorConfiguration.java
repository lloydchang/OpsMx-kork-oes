/*
 * Copyright 2021 Salesforce, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.config;

import com.netflix.spinnaker.kork.retrofit.exceptions.SpinnakerRetrofitExceptionHandlers;
import com.netflix.spinnaker.kork.web.exceptions.ExceptionMessageDecorator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.netflix.spinnaker.kork.retrofit")
public class RetrofitErrorConfiguration {
  @Bean
  SpinnakerRetrofitExceptionHandlers spinnakerRetrofitExceptionHandlers(
      ExceptionMessageDecorator exceptionMessageDecorator) {
    return new SpinnakerRetrofitExceptionHandlers(exceptionMessageDecorator);
  }
}
