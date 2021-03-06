object Sheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def abs(x: Double) = if(x >= 0) x else -x       //> abs: (x: Double)Double
  
  def box(s: String) { // Look carefully: no =
  		val border = "-" * s.length + "--\n"
  		println(border + "|" + s + "|\n" + border)
  }                                               //> box: (s: String)Unit
  
  
  box("Hello")                                    //> -------
                                                  //| |Hello|
                                                  //| -------
                                                  //| 
  def fac(n: Int): Int = {
  	var r = 1
  	for(i <-1 to n) r = r*i
  	r
  }                                               //> fac: (n: Int)Int
  
  fac(10)                                         //> res0: Int = 3628800
}