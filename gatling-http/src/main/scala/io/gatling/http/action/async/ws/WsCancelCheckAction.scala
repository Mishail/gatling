/**
 * Copyright 2011-2015 GatlingCorp (http://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.http.action.async.ws

import io.gatling.core.session._
import io.gatling.core.stats.StatsEngine
import io.gatling.http.action.async.{ CancelCheckAction, CancelCheckActionCreator }

import akka.actor.ActorRef

object WsCancelCheckAction extends CancelCheckActionCreator[WsCancelCheckAction]

class WsCancelCheckAction(
  requestName: Expression[String],
  wsName:      String,
  statsEngine: StatsEngine,
  next:        ActorRef
) extends CancelCheckAction(requestName, wsName, statsEngine, next) with WsAction
