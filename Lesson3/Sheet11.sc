import scala.collection.mutable.ArrayBuffer

object Sheet11 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  "New York".partition { _.isUpper }              //> res0: (String, String) = (NY,ew ork)
  
  val input = ArrayBuffer(-1,-2,-3, 5,6)          //> input  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1, -2, -3,
                                                  //|  5, 6)
  def cleanFirstNegative(input: ArrayBuffer[Int]): ArrayBuffer[Int] = {
  var (positive,negative) = input.partition { _ < 0 }
  positive ++ (negative.drop(1))
  }                                               //> cleanFirstNegative: (input: scala.collection.mutable.ArrayBuffer[Int])scala.
                                                  //| collection.mutable.ArrayBuffer[Int]
  cleanFirstNegative(input)                       //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1, -2, -3, 6)
                                                  //| 
}