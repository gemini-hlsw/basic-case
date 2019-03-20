// Copyright (c) 2019 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package basic.misc

import basic.enum.{ StellarLibrarySpectrum, NonStellarLibrarySpectrum }

sealed trait SpectralDistribution extends Serializable

object SpectralDistribution {

  /** A black body with a temperature in Kelvin. */
  final case class BlackBody(temperature: Double) extends SpectralDistribution

  /** Defined by power law function. */
  final case class PowerLaw(index: Double) extends SpectralDistribution

  /** A library defined spectrum. */
  final case class Library(
    librarySpectrum: Either[StellarLibrarySpectrum, NonStellarLibrarySpectrum]
  ) extends SpectralDistribution

  // TODO: emission line and user-defined

}