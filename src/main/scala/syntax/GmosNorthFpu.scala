// Copyright (c) 2019 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package basic.syntax

import gem.enum.GmosNorthFpu
import gem.enum.GmosNorthFpu._

import gem.math.Angle

/**
 * Syntax extensions for missing properties. These need to be folded back into the Gem enumerations.
 */
final class GmosNorthFpuOps(val self: GmosNorthFpu) extends AnyVal {

  def effectiveSlitWidth: Angle =
    self match {
      case Ifu1          => Angle.fromMicroarcseconds( 310000)
      case Ifu2          => Angle.fromMicroarcseconds( 310000)
      case Ifu3          => Angle.fromMicroarcseconds( 310000)
      case Ns0           => Angle.fromMicroarcseconds( 250000)
      case Ns1           => Angle.fromMicroarcseconds( 500000)
      case Ns2           => Angle.fromMicroarcseconds( 750000)
      case Ns3           => Angle.fromMicroarcseconds(1000000)
      case Ns4           => Angle.fromMicroarcseconds(1500000)
      case Ns5           => Angle.fromMicroarcseconds(2000000)
      case LongSlit_0_25 => Angle.fromMicroarcseconds( 250000)
      case LongSlit_0_50 => Angle.fromMicroarcseconds( 500000)
      case LongSlit_0_75 => Angle.fromMicroarcseconds( 750000)
      case LongSlit_1_00 => Angle.fromMicroarcseconds(1000000)
      case LongSlit_1_50 => Angle.fromMicroarcseconds(1500000)
      case LongSlit_2_00 => Angle.fromMicroarcseconds(2000000)
      case LongSlit_5_00 => Angle.fromMicroarcseconds(5000000)
    }

  def isIfu: Boolean =
    self match {
      case Ifu1          => true
      case Ifu2          => true
      case Ifu3          => true
      case Ns0           => false
      case Ns1           => false
      case Ns2           => false
      case Ns3           => false
      case Ns4           => false
      case Ns5           => false
      case LongSlit_0_25 => false
      case LongSlit_0_50 => false
      case LongSlit_0_75 => false
      case LongSlit_1_00 => false
      case LongSlit_1_50 => false
      case LongSlit_2_00 => false
      case LongSlit_5_00 => false
    }

  def isNodAndShuffle: Boolean =
    self match {
      case Ifu1          => false
      case Ifu2          => false
      case Ifu3          => false
      case Ns0           => true
      case Ns1           => true
      case Ns2           => true
      case Ns3           => true
      case Ns4           => true
      case Ns5           => true
      case LongSlit_0_25 => false
      case LongSlit_0_50 => false
      case LongSlit_0_75 => false
      case LongSlit_1_00 => false
      case LongSlit_1_50 => false
      case LongSlit_2_00 => false
      case LongSlit_5_00 => false
    }

  def ocs2Tag: String =
    self match {
      case Ifu1          => "IFU_1"
      case Ifu2          => "IFU_2"
      case Ifu3          => "IFU_3"
      case Ns0           => "NS_0"
      case Ns1           => "NS_1"
      case Ns2           => "NS_2"
      case Ns3           => "NS_3"
      case Ns4           => "NS_4"
      case Ns5           => "NS_5"
      case LongSlit_0_25 => "LONGSLIT_1"
      case LongSlit_0_50 => "LONGSLIT_2"
      case LongSlit_0_75 => "LONGSLIT_3"
      case LongSlit_1_00 => "LONGSLIT_4"
      case LongSlit_1_50 => "LONGSLIT_5"
      case LongSlit_2_00 => "LONGSLIT_6"
      case LongSlit_5_00 => "LONGSLIT_7"
    }

}

trait ToGmosNorthFpuOps {
  implicit def toGmosNorthFpuOps(self: GmosNorthFpu): GmosNorthFpuOps =
    new GmosNorthFpuOps(self)
}

object gmosnorthfpu extends ToGmosNorthFpuOps