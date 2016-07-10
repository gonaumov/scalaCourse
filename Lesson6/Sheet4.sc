object Sheet4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def While(condition:  => Boolean)(func: => Unit): Unit = {
  		    if(condition == true) {
  						func
  						While(condition)(func)
  				}
  		
  }                                               //> While: (condition: => Boolean)(func: => Unit)Unit
  
  val n = 20                                      //> n  : Int = 20
  var i = 1                                       //> i  : Int = 1
  var f = 1                                       //> f  : Int = 1
  
  While(i < n){f*=i; i+=1}
  
  println(i)                                      //> 20
}