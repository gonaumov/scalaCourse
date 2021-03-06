object Sheet7 {
  def isVomel(ch: Char): Boolean = {
  	"aeiou".contains(ch)
  }                                               //> isVomel: (ch: Char)Boolean
  
  def vomels(s: String, vomelChars: String = "aeiou", ignoreChars: Boolean = true): String = {
  	if(ignoreChars == true)
  	  for(c <- s if vomelChars.contains(c.toLower)) yield c
    else
      for(c <- s if vomelChars.contains(c)) yield c
      
  }                                               //> vomels: (s: String, vomelChars: String, ignoreChars: Boolean)String
  
  vomels("ALABALANICA", ignoreChars = false)      //> res0: String = ""
}