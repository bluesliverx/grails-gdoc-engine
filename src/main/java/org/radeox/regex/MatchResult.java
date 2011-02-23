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


package org.radeox.regex;

/*
 * The result when a Matcher object finds matches in some input
 *
 * @author stephan
 * @team sonicteam
 * @version $Id: MatchResult.java,v 1.2 2004/04/20 09:47:03 stephan Exp $
 */

public abstract class MatchResult {

  /**
   * Create a new MatchResult depending on the used implementation
   *
   * @param matcher Matcher object of the implementation
   * @return MatchResult for the Matcher
   */
  public static MatchResult create(Matcher matcher) {
    return new JdkMatchResult(matcher);
  }

  /**
   * Returns the number of groups (...) found
   *
   * @return Number of found groups
   */
  public abstract int groups();

  /**
   * Return the content of group with the index i
   *
   * @param i index for the group
   * @return Content of the group with the index i
   */
  public abstract String group(int i);

  /**
   * The offset of the beginning of the match for the group with the index i
   *
   * @param i index for the group
   * @return Offset of the group
   */
  public abstract int beginOffset(int i);

  /**
   * The offset of the end of the match for the group with the index i
   *
   * @param i index for the group
   * @return Offset of the group
   */
  public abstract int endOffset(int i);
}