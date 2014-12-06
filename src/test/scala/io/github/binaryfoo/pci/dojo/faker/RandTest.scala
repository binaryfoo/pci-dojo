package io.github.binaryfoo.pci.dojo.faker

import org.scalatest.{FlatSpec, Matchers}

class RandTest extends FlatSpec with Matchers {

  "digits()" should "produce a stream of integers in [0-9] by default" in {
    val digits = Rand.digits().take(10)

    digits should have size 10
    all(digits) should (be >= 0 and be <= 9)
  }

  it should "limit digits produced if passed a range" in {
    val digits = Rand.digits(3 to 6).take(10)

    digits should have size 10
    all(digits) should (be >= 3 and be <= 6)
  }

  "integer()" should "produce na int within the range" in {
    Rand.integer(13 to 18) should (be >= 13 and be <= 18)
  }
}
