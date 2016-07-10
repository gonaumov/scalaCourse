import scala.collection.mutable.ArrayBuffer

object Sheet7 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var input = ArrayBuffer(4, 3, 2, 1, 0, -1, -2, -3, -4)
                                                  //> input  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4, 3, 2, 1,
                                                  //|  0, -1, -2, -3, -4)

  def removeAllButFirstNegative(input: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var negatives = for (i <- 0 until input.length if (input(i) < 0)) yield i
    val neededNegatives: Seq[Int] = negatives.drop(1)
    for (i <- neededNegatives.reverse) {
      input.remove(i)
    }
    input
  }                                               //> removeAllButFirstNegative: (input: scala.collection.mutable.ArrayBuffer[Int]
                                                  //| )scala.collection.mutable.ArrayBuffer[Int]
  removeAllButFirstNegative(input)                //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4, 3, 2, 1, 0,
                                                  //|  -1)
}