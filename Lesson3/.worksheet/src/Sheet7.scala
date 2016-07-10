import scala.collection.mutable.ArrayBuffer

object Sheet7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  println("Welcome to the Scala worksheet");$skip(57); 
  var input = ArrayBuffer(4, 3, 2, 1, 0, -1, -2, -3, -4);System.out.println("""input  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(input ));$skip(295); 

  def removeAllButFirstNegative(input: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var negatives = for (i <- 0 until input.length if (input(i) < 0)) yield i
    val neededNegatives: Seq[Int] = negatives.drop(1)
    for (i <- neededNegatives.reverse) {
      input.remove(i)
    }
    input
  };System.out.println("""removeAllButFirstNegative: (input: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(35); val res$0 = 
  removeAllButFirstNegative(input);System.out.println("""res0: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$0))}
}
