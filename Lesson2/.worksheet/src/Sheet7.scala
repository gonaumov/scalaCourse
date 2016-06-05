object Sheet7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  def isVomel(ch: Char): Boolean = {
  	"aeiou".contains(ch)
  };System.out.println("""isVomel: (ch: Char)Boolean""");$skip(256); 
  
  def vomels(s: String, vomelChars: String = "aeiou", ignoreChars: Boolean = true): String = {
  	if(ignoreChars == true)
  	  for(c <- s if vomelChars.contains(c.toLower)) yield c
    else
      for(c <- s if vomelChars.contains(c)) yield c
      
  };System.out.println("""vomels: (s: String, vomelChars: String, ignoreChars: Boolean)String""");$skip(48); val res$0 = 
  
  vomels("ALABALANICA", ignoreChars = false);System.out.println("""res0: String = """ + $show(res$0))}
}
