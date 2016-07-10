object Sheet9 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val in = new java.util.Scanner(new java.net.URL(
    "http://horstmann.com/scala/livelessons/alice30.txt").openStream)
                                                  //> in  : java.util.Scanner = java.util.Scanner[delimiters=\p{javaWhitespace}+][
                                                  //| position=0][match valid=false][need input=false][source closed=false][skippe
                                                  //| d=false][group separator=\,][decimal separator=\.][positive prefix=][negativ
                                                  //| e prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Q�\E][infi
                                                  //| nity string=\Q∞\E]
  var count: Map[String, Int] = Map[String, Int]()//> count  : Map[String,Int] = Map()
  
  while (in.hasNext) {
    val word = in.next()
    val quantity: Int = count.getOrElse(word, 0) + 1
    count = count + (word -> quantity)
  }

  count("Alice")                                  //> res0: Int = 223
  count("Rabbit")                                 //> res1: Int = 29
  
}