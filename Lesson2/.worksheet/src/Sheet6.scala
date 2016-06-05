object Sheet6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(65); 
  def isVomel(ch: Char): Boolean = {
  	"aeiou".contains(ch)
  };System.out.println("""isVomel: (ch: Char)Boolean""");$skip(83); 
  
  def vomels(s: String): String = {
      for(c <- s if isVomel(c)) yield c
  };System.out.println("""vomels: (s: String)String""");$skip(265); 
  
  def vomels2(s: String): String = {
      var result: String = ""
      if(s.length > 0) {
        val element = s.slice(0, 1)
      	if(isVomel(element.toCharArray()(0)))
      	 result += element
      }
      
      result = vomels(s)
      
    	result
  };System.out.println("""vomels2: (s: String)String""");$skip(290); 
 
  def vomels3(s: String): String = {
     var result: String = ""
     var input = s
     
     while(input.length() > 0) {
     		var element = input.slice(0,1)
     		if(isVomel(element(0)))
     			result += element
     		
     		input = input.substring(1)
     }
    
    result
  };System.out.println("""vomels3: (s: String)String""");$skip(27); val res$0 = 
 
  vomels3("alabalanica");System.out.println("""res0: String = """ + $show(res$0))}
}
