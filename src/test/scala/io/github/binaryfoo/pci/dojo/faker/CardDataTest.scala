package io.github.binaryfoo.pci.dojo.faker

import org.scalatest.{FlatSpec, Matchers}

class CardDataTest extends FlatSpec with Matchers {

  "Card data" should "have a PAN before an equals sign" in {
    val track2 = CardData.track2()
    track2 should startWith regex """[3-6]\d{13,18}=""".r
  }

  it should "have an expiry date after the equals sign" in {
    CardData.track2() should include regex "=[1-9][0-9][0-1][0-9]".r
  }

  "Pan" should "look vaguely like a Primary Account Number" in {
    CardData.pan() should startWith regex "[3-6]".r
    CardData.pan().size should (be >= 14 and be <= 19)
  }

  "Expiry Date" should "be 2 digit year followed by 2 digit month" in {
    CardData.expiryYYMM() should have size 4
    CardData.expiryYYMM() should fullyMatch regex "[1-9][0-9][0-1][0-9]".r
  }
}
