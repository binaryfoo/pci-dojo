package io.github.binaryfoo.pci.dojo.faker

import io.github.binaryfoo.pci.dojo.faker.Rand.integer
import io.github.binaryfoo.pci.dojo.faker.Rand.digits

/**
 * Data like http://en.wikipedia.org/wiki/Magnetic_stripe_card
 */
object CardData {

  def pan(): String = {
    val lengthMinusOne = integer(13 to 18)
    digits(3 to 6).head.toString + digits().take(lengthMinusOne).mkString("")
  }

  def expiryYYMM(): String = {
    val year = integer(14 to 24)
    val month = integer(1 to 12)
    f"$year$month%02d"
  }

  def track2(): String = {
    // could include service code after expiry date
    pan() + "=" + expiryYYMM() + digits().take(6).mkString("")
  }
}
