object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(107); 
  
  def swapTouple(input: (Int, Int)): (Int, Int) = {
  	input match {
  		case (x, y) => (y, x)
  	}
  };System.out.println("""swapTouple: (input: (Int, Int))(Int, Int)""");$skip(23); val res$0 = 
  
  swapTouple((2,1));System.out.println("""res0: (Int, Int) = """ + $show(res$0));$skip(169); 
  
  
  def swap(input: Array[Int]): Array[Int] = {
  	input match {
  		case Array(a,b, otherElements @ _*) => Array(b,a) ++ otherElements
  		case _ => input
  	}
  };System.out.println("""swap: (input: Array[Int])Array[Int]""");$skip(20); val res$1 = 
  
  swap(Array(1));System.out.println("""res1: Array[Int] = """ + $show(res$1))}
}
