// Copyright (c) 2019 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package basic.itc

import io.circe.Encoder

// N.B. this isn't in the enum package because it's not clear that it will exist in the schema
sealed abstract class ItcWavefrontSensor(
  val ocs2Tag: String
) extends Product with Serializable

object ItcWavefrontSensor {

  case object PWFS  extends ItcWavefrontSensor("PWFS")
  case object OIWFS extends ItcWavefrontSensor("OIWFS")

  implicit val encoder: Encoder[ItcWavefrontSensor] =
    Encoder[String].contramap(_.ocs2Tag)

}