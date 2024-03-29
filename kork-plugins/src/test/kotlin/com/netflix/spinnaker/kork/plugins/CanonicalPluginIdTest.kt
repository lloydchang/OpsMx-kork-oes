/*
 * Copyright 2020 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.spinnaker.kork.plugins

import dev.minutest.junit.JUnit5Minutests
import dev.minutest.rootContext
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class CanonicalPluginIdTest : JUnit5Minutests {

  fun tests() = rootContext {
    /*listOf(
      Pair("io.spinnaker.helloworld", true),
      Pair("com.netflix.streaming.platform.delivery-engineering.my-plugin-name", true),
      Pair("my/org.helloworld", false),
      Pair("helloworld", false),
      Pair(".helloworld", false),
      Pair("helloworld.", false),
      Pair(".", false)
    ).forEach { testValue ->
      test("reports '${testValue.first}' as ${if (testValue.second) "valid" else "malformed"}") {
        expectThat(CanonicalPluginId.isValid(testValue.first)).isEqualTo(testValue.second)
      }
    }*/
  }
}
