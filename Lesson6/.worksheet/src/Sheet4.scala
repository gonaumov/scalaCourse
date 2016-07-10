object Sheet4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(157); 
  
  def While(condition:  => Boolean)(func: => Unit): Unit = {
  		    if(condition == true) {
  						func
  						While(condition)(func)
  				}
  		
  };System.out.println("""While: (condition: => Boolean)(func: => Unit)Unit""");$skip(16); 
  
  val n = 20;System.out.println("""n  : Int = """ + $show(n ));$skip(12); 
  var i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(12); 
  var f = 1;System.out.println("""f  : Int = """ + $show(f ));$skip(30); 
  
  While(i < n){f*=i; i+=1};$skip(16); 
  
  println(i)}
}
