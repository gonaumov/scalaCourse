import scala.collection.mutable.ArrayBuffer

object Sheet6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var input = ArrayBuffer(1, -1, -2, -3, -4)      //> input  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, -1, -2, 
                                                  //| -3, -4)
  input.sorted                                    //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-4, -3, -2, -1
                                                  //| , 1)
  input                                           //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, -1, -2, -3,
                                                  //|  -4)
  var findFirstElement: Boolean = false           //> findFirstElement  : Boolean = false
  
  for (element <- input) {
    if(element < 0 && findFirstElement == false) {
    	findFirstElement = true
    }
    
    if(element < 0 && findFirstElement == true) {
    	input -= (element)
    }
  }
  
  input                                           //> res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, -2, -4)
}