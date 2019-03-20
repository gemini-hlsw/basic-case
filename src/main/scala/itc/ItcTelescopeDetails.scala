// Copyright (c) 2019 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package basic.itc

import io.circe.{ Encoder, Json }

final case class ItcTelescopeDetails(wfs: ItcWavefrontSensor)

object ItcTelescopeDetails {

  implicit val encoder: Encoder[ItcTelescopeDetails] =
    new Encoder[ItcTelescopeDetails] {
      def apply(a: ItcTelescopeDetails): Json =
        Json.obj(
          "mirrorCoating"  -> Json.fromString("SILVER"),
          "instrumentPort" -> Json.fromString("SIDE_LOOKING"),
          "wfs"            -> ItcWavefrontSensor.encoder(a.wfs)
        )
    }

}