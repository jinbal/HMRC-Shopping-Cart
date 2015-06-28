package com.jinbal.hmrc

class Checkout {
  def calculate(inputProducts: Seq[ShopItem]): CheckoutSummary = {
    var total = 0.0
    for (product <- inputProducts) {
      total += product.price
    }
    CheckoutSummary(inputProducts, total)
  }

}

case class CheckoutSummary(products: Seq[ShopItem], subTotal: Double)