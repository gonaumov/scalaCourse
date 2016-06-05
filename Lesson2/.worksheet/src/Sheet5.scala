object Sheet5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(65); 
  def isVomel(ch: Char): Boolean = {
  	"aeiou".contains(ch)
  };System.out.println("""isVomel: (ch: Char)Boolean""");$skip(151); 
  
  def vomels(s: String): String = {
  		var result: String = "";
  		for(c <- s) if(isVomel(c)) result = result.concat(c.toString())
  		result
  };System.out.println("""vomels: (s: String)String""");$skip(27); val res$0 = 
  
  vomels("alabalanica");System.out.println("""res0: String = """ + $show(res$0))}
}
