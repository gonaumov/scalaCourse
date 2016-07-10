object Sheet3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(155); 
  
  def concat(strings: Seq[String], separator: String): String = {
    strings.reduceLeft((f: String, s: String) => {
    	 f + separator + s
    })
  };System.out.println("""concat: (strings: Seq[String], separator: String)String""");$skip(42); val res$0 = 
  
   concat(Seq("1", "2", "3","4"), "x");System.out.println("""res0: String = """ + $show(res$0))}
}
