// Copyright (c) 2019 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package basic
package itc

import io.circe.Encoder
import io.circe.generic.semiauto._

case class ItcParameters(
  source:      ItcSourceDefinition,
  observation: ItcObservationDetails,
  conditions:  ItcObservingConditions,
  telescope:   ItcTelescopeDetails,
  instrument:  ItcInstrumentDetails
)

object ItcParameters {
  implicit val encoder: Encoder[ItcParameters] = deriveEncoder
}