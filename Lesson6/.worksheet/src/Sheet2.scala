object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(27); val res$0 = 
  1.to(10).reduceLeft(_*_);System.out.println("""res0: Int = """ + $show(res$0));$skip(64); 
  
  def factorial(input: Int) =
  	1.to(input).reduceLeft(_*_);System.out.println("""factorial: (input: Int)Int""");$skip(75); 
  
  def customPow(input: Int) =  1.to(input).map( _ => 2).reduceLeft(_*_);System.out.println("""customPow: (input: Int)Int""");$skip(18); val res$1 = 
  
  factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  customPow(3);System.out.println("""res2: Int = """ + $show(res$2))}
}
