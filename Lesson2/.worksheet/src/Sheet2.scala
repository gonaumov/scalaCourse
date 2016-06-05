object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(44); 
  def abs(x: Double) = if(x >= 0) x else -x;System.out.println("""abs: (x: Double)Double""");$skip(142); 
  
  def box(s: String) { // Look carefully: no =
  		val border = "-" * s.length + "--\n"
  		println(border + "|" + s + "|\n" + border)
  };System.out.println("""box: (s: String)Unit""");$skip(21); 
  
  
  box("Hello");$skip(76); 
  def fac(n: Int): Int = {
  	var r = 1
  	for(i <-1 to n) r = r*i
  	r
  };System.out.println("""fac: (n: Int)Int""");$skip(13); val res$0 = 
  
  fac(10);System.out.println("""res0: Int = """ + $show(res$0))}
}
