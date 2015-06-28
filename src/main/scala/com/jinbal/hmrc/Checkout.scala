package com.jinbal.hmrc

class Checkout {
  def calculate(inputProducts: Seq[ShopItem]): CheckoutSummary = ???

}

case class CheckoutSummary(products: Seq[ShopItem], subTotal: Double)