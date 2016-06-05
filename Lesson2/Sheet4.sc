object Sheet4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def sum(args: Int*): Int = {
  	var result = 0
  	for(arg <- args) result += arg
  	result
  }                                               //> sum: (args: Int*)Int
  
  sum(10,10,10,10)                                //> res0: Int = 40
}