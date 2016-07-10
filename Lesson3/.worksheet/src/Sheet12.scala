object Sheet12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(37); 
  val symbols = Array("<", "-", ">");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(28); 
  val count = Array(2,10,2);System.out.println("""count  : Array[Int] = """ + $show(count ));$skip(33); 
  val pairs = symbols.zip(count);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(8); val res$0 = 
  pairs;System.out.println("""res0: Array[(String, Int)] = """ + $show(res$0));$skip(40); 
  
  for((s,n) <- pairs)
    print(s*n);$skip(13); 
   println()}
}
