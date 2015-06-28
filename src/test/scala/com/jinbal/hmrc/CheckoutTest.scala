package com.jinbal.hmrc

import org.scalatest.{FlatSpec, Matchers}

class CheckoutTest extends FlatSpec
with Matchers {

  val checkoutUnderTest = new Checkout

  "Checkout" should "correctly calculate the value of a shopping cart" in {
    // Given
    val inputProducts  = Seq(Apple,Apple,Orange,Apple)

    // When
    val checkoutSummary: CheckoutSummary = checkoutUnderTest.calculate(inputProducts)

    // The
    checkoutSummary.subTotal should be (2.05)
  }

}
