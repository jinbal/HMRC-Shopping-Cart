package com.jinbal.hmrc

trait Offer {
  def calcAdjustment(items: Seq[ShopItem]): Double
}

object AppleBogofOffer extends Offer {
  override def calcAdjustment(items: Seq[ShopItem]): Double = ???
}

object Oranges3For2Offer extends Offer {
  override def calcAdjustment(items: Seq[ShopItem]): Double = ???
}

