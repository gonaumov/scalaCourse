import scala.collection.mutable.ArrayBuffer

object Sheet11 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 
  println("Welcome to the Scala worksheet");$skip(37); val res$0 = 
  "New York".partition { _.isUpper };System.out.println("""res0: (String, String) = """ + $show(res$0));$skip(44); 
  
  val input = ArrayBuffer(-1,-2,-3, 5,6);System.out.println("""input  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(input ));$skip(163); 
  def cleanFirstNegative(input: ArrayBuffer[Int]): ArrayBuffer[Int] = {
  var (positive,negative) = input.partition { _ < 0 }
  positive ++ (negative.drop(1))
  };System.out.println("""cleanFirstNegative: (input: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(28); val res$1 = 
  cleanFirstNegative(input);System.out.println("""res1: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$1))}
}
