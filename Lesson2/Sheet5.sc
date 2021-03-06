object Sheet5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def isVomel(ch: Char): Boolean = {
  	"aeiou".contains(ch)
  }                                               //> isVomel: (ch: Char)Boolean
  
  def vomels(s: String): String = {
  		var result: String = "";
  		for(c <- s) if(isVomel(c)) result = result.concat(c.toString())
  		result
  }                                               //> vomels: (s: String)String
  
  vomels("alabalanica")                           //> res0: String = aaaaia
}