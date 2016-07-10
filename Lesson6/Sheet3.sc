object Sheet3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def concat(strings: Seq[String], separator: String): String = {
    strings.reduceLeft((f: String, s: String) => {
    	 f + separator + s
    })
  }                                               //> concat: (strings: Seq[String], separator: String)String
  
   concat(Seq("1", "2", "3","4"), "x")            //> res0: String = 1x2x3x4
}