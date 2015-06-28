package com.jinbal.hmrc

import org.scalatest.{Matchers, FlatSpec}

class Oranges3For2OfferTest extends FlatSpec with Matchers {

  val offerUnderTest = Oranges3For2Offer

  "Oranges3For2Offer" should "calcAdjustment" in {
    // Given
    val oranges = Seq(Orange,Orange,Orange)

    // When
    val adjustment = Oranges3For2Offer.calcAdjustment(oranges)

    // Then
    adjustment should be(-0.25)
  }

}
