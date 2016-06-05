object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(13); 
  val x = -1;System.out.println("""x  : Int = """ + $show(x ));$skip(40); 
  
  val result = if(x > 0) "something";System.out.println("""result  : Any = """ + $show(result ));$skip(22); 
  
  val result2 = ();System.out.println("""result2  : Unit = """ + $show(result2 ));$skip(16); 
  
  val n = 10;System.out.println("""n  : Int = """ + $show(n ));$skip(30); 
  for(i <- 1 to n) println(i);$skip(31); 
  for(i <- "Hello") println(i);$skip(54); 
  for(i <- 1 to 3; j <-1 to 3) println((i + j) + " ")}
}
