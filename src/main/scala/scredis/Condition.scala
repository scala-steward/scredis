/*
 * Copyright (c) 2013 Livestream LLC. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. See accompanying LICENSE file.
 */
package scredis

/**
 * Represents a condition that can be passed to some Redis command, e.g. SET
 */
sealed abstract class Condition(name: String) {
  override def toString = name
}

/**
 * Contains all available conditions
 */
object Condition {
  /**
   * Execute a command only if the value does not exist yet
   */
  case object IfDoesNotExist extends Condition("NX")
  /**
   * Execute a command only if the value already exists
   */
  case object IfAlreadyExists extends Condition("XX")
}