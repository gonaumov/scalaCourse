object Sheet6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def isVomel(ch: Char): Boolean = {
  	"aeiou".contains(ch)
  }                                               //> isVomel: (ch: Char)Boolean
  
  def vomels(s: String): String = {
      for(c <- s if isVomel(c)) yield c
  }                                               //> vomels: (s: String)String
  
  def vomels2(s: String): String = {
      var result: String = ""
      if(s.length > 0) {
        val element = s.slice(0, 1)
      	if(isVomel(element.toCharArray()(0)))
      	 result += element
      }
      
      result = vomels(s)
      
    	result
  }                                               //> vomels2: (s: String)String
 
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
  }                                               //> vomels3: (s: String)String
 
  vomels3("alabalanica")                          //> res0: String = aaaaia
}