package com.jinbal.hmrc

import org.scalatest.{FlatSpec, Matchers}

class AppleBogofOfferTest extends FlatSpec with Matchers {


  "AppleBogofOffer" should "calcAdjustment" in {
    // Given
    val apples = Seq(Apple, Apple)

    // When
    val adjustment = AppleBogofOffer.calcAdjustment(apples)

    // Then
    adjustment should be (-0.6)
  }

}
