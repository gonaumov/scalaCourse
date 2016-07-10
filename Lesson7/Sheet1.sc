object Sheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def swapTouple(input: (Int, Int)): (Int, Int) = {
  	input match {
  		case (x, y) => (y, x)
  	}
  }                                               //> swapTouple: (input: (Int, Int))(Int, Int)
  
  swapTouple((2,1))                               //> res0: (Int, Int) = (1,2)
  
  
  def swap(input: Array[Int]): Array[Int] = {
  	input match {
  		case Array(a,b, otherElements @ _*) => Array(b,a) ++ otherElements
  		case _ => input
  	}
  }                                               //> swap: (input: Array[Int])Array[Int]
  
  swap(Array(1))                                  //> res1: Array[Int] = Array(1)
}