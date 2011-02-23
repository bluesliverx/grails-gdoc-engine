/*
 *      Copyright 2001-2004 Fraunhofer Gesellschaft, Munich, Germany, for its 
 *      Fraunhofer Institute Computer Architecture and Software Technology
 *      (FIRST), Berlin, Germany
 *      
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.radeox.macro;

import junit.framework.Test;
import junit.framework.TestSuite;

public class RfcMacroTest extends MacroTestSupport {
  public RfcMacroTest(String name) {
    super(name);
  }

  public static Test suite() {
    return new TestSuite(RfcMacroTest.class);
  }

  public void testRfc() {
    String result = engine.render("{rfc:1}", context);
    assertEquals("RFC is rendered","<a href=\"http://zvon.org/tmRFC/RFC1/Output/index.html\">RFC1</a>", result);
  }
}
