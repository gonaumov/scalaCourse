object Sheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1.to(10).reduceLeft(_*_)                        //> res0: Int = 3628800
  
  def factorial(input: Int) =
  	1.to(input).reduceLeft(_*_)               //> factorial: (input: Int)Int
  
  def customPow(input: Int) =  1.to(input).map( _ => 2).reduceLeft(_*_)
                                                  //> customPow: (input: Int)Int
  
  factorial(4)                                    //> res1: Int = 24
  customPow(3)                                    //> res2: Int = 8
}