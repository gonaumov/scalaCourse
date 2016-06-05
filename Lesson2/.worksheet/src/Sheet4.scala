object Sheet4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(97); 
  def sum(args: Int*): Int = {
  	var result = 0
  	for(arg <- args) result += arg
  	result
  };System.out.println("""sum: (args: Int*)Int""");$skip(22); val res$0 = 
  
  sum(10,10,10,10);System.out.println("""res0: Int = """ + $show(res$0))}
}
