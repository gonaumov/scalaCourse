object Sheet12 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val symbols = Array("<", "-", ">")              //> symbols  : Array[String] = Array(<, -, >)
  val count = Array(2,10,2)                       //> count  : Array[Int] = Array(2, 10, 2)
  val pairs = symbols.zip(count)                  //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
  pairs                                           //> res0: Array[(String, Int)] = Array((<,2), (-,10), (>,2))
  
  for((s,n) <- pairs)
    print(s*n)                                    //> <<---------->>
   println()                                      //> 
}