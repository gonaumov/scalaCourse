object Sheet3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(93); 
  def decorate(str: String, left: String = "[", right: String = "]") =
  	left + str + right;System.out.println("""decorate: (str: String, left: String, right: String)String""");$skip(43); val res$0 = 
  	
  decorate("Innovate don't stagnate!");System.out.println("""res0: String = """ + $show(res$0));$skip(47); val res$1 = 
  decorate("Innovate don't stagnate!", ">>>|");System.out.println("""res1: String = """ + $show(res$1));$skip(55); val res$2 = 
  decorate("Innovate don't stagnate!", right = "|<<<");System.out.println("""res2: String = """ + $show(res$2))}
}
