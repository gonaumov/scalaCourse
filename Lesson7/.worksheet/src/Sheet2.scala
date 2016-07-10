object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item;$skip(236); 
  
  val book = Article("Scala for the Impatient", 39.95);System.out.println("""book  : Sheet2.Article = """ + $show(book ));$skip(79); 
  val gift = Bundle("The gift for whore", 10, book, Article("Whiskey", 79.95));System.out.println("""gift  : Sheet2.Bundle = """ + $show(gift ));$skip(160); 
  def price(it: Item): Double = {
    it match {
    	case Article(_,p) => p
    	case Bundle(_,discount, its @ _*) =>  its.map(price).sum - discount
    }
  };System.out.println("""price: (it: Sheet2.Item)Double""");$skip(17); val res$0 = 
  
  price(book);System.out.println("""res0: Double = """ + $show(res$0));$skip(14); val res$1 = 
  price(gift);System.out.println("""res1: Double = """ + $show(res$1))}
}
