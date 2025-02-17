/*
 * Copyright (c) 2018-2020, Sylvain Baudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.sbaudoin.yamllint;

import com.github.sbaudoin.yamllint.rules.RuleTester;

public class YamlLintConfigExceptionTest extends RuleTester {
    public void testInit() {
        assertNull(new YamlLintConfigException().getMessage());
        Throwable t = new Throwable("Throwable");
        YamlLintConfigException e = new YamlLintConfigException("Message", t);
        assertEquals("Message", e.getMessage());
        assertNotNull(e.getCause());
        assertEquals("Throwable", e.getCause().getMessage());
    }
}
