object Sheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a = new Array[Int](10)                      //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  for(i <- 0 until a.length) a(i) = i*i
  a                                               //> res0: Array[Int] = Array(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
}