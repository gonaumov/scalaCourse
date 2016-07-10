object Sheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item
  
  val book = Article("Scala for the Impatient", 39.95)
                                                  //> book  : Sheet2.Article = Article(Scala for the Impatient,39.95)
  val gift = Bundle("The gift for whore", 10, book, Article("Whiskey", 79.95))
                                                  //> gift  : Sheet2.Bundle = Bundle(The gift for whore,10.0,WrappedArray(Article(
                                                  //| Scala for the Impatient,39.95), Article(Whiskey,79.95)))
  def price(it: Item): Double = {
    it match {
    	case Article(_,p) => p
    	case Bundle(_,discount, its @ _*) =>  its.map(price).sum - discount
    }
  }                                               //> price: (it: Sheet2.Item)Double
  
  price(book)                                     //> res0: Double = 39.95
  price(gift)                                     //> res1: Double = 109.9
}