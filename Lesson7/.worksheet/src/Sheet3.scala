object Sheet3 {
  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(549); 
  
  /**
   * The task:
   * Suppose you have a bundle made up of and article
   * and another bundle, like this:
   **/
   
  val special = Bundle("Father's day special", 20.0,
  Article("Scala for the Impatient", 39.95),
  Bundle("Anchor Distillerry Sailer", 10.0,
  Article("Old Potrero Straight Rye Whiskey", 79.95),
  Article("Junipero Gin", 32.95)));System.out.println("""special  : Sheet3.Bundle = """ + $show(special ));$skip(257); 
  /**
   * Write a one-line assigment that extracts the description
   * and price of the first article:
   **/
   
  // my solution
  val (description, price) = special match {
  	case Bundle(_,_,f, _*) => f match {
  		case Article(d,f) => (d,f)
  	}
  };System.out.println("""description  : String = """ + $show(description ));System.out.println("""price  : Double = """ + $show(price ));$skip(195); 
  
  // Horstman implementation. So cool - just erase
  // everithing that is not needed. Still wonder
  // How does this work ..
  val Bundle(_,_,Article(newDescription,newPrice), _*) = special;System.out.println("""newDescription  : String = """ + $show(newDescription ));System.out.println("""newPrice  : Double = """ + $show(newPrice ))}
}
