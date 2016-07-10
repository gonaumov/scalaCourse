object Sheet3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	import scala.collection.mutable.ArrayBuffer
	
	val a = Array(2, 3, 5, 7, 11)             //> a  : Array[Int] = Array(2, 3, 5, 7, 11)
	val result = for(elem <- a if elem % 2 != 0) yield 2 * elem
                                                  //> result  : Array[Int] = Array(6, 10, 14, 22)
}