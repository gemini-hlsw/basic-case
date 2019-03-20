// Copyright (c) 2019 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package basic.syntax

import scala.concurrent.duration._

final class FiniteDurationOps(val self: FiniteDuration) extends AnyVal {

  /** Returns this `FiniteDuration` in double-precision seconds. */
  def toDoubleSeconds: Double =
    self.toNanos / 1000000000.0

  /** Second-precision ceiling. */
  def secondsCeil: FiniteDuration =
    toDoubleSeconds.ceil.seconds

  /** Second-precision ceiling, if `b` otherwise return this value unchanged. */
  def secondsCeilIf(b: Boolean): FiniteDuration =
    if (b) secondsCeil else self

}

trait ToFiniteDurationOps {
  implicit def toFiniteDurationOps(self: FiniteDuration): FiniteDurationOps =
    new FiniteDurationOps(self)
}

object finiteduration extends ToFiniteDurationOps
