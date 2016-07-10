object Sheet9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(121); 
  val in = new java.util.Scanner(new java.net.URL(
    "http://horstmann.com/scala/livelessons/alice30.txt").openStream);System.out.println("""in  : java.util.Scanner = """ + $show(in ));$skip(51); 
  var count: Map[String, Int] = Map[String, Int]();System.out.println("""count  : Map[String,Int] = """ + $show(count ));$skip(147); 
  
  while (in.hasNext) {
    val word = in.next()
    val quantity: Int = count.getOrElse(word, 0) + 1
    count = count + (word -> quantity)
  };$skip(18); val res$0 = 

  count("Alice");System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
  count("Rabbit");System.out.println("""res1: Int = """ + $show(res$1))}
  
}
