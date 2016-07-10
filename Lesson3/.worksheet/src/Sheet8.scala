object Sheet8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(121); 
  val in = new java.util.Scanner(new java.net.URL(
    "http://horstmann.com/scala/livelessons/alice30.txt").openStream);System.out.println("""in  : java.util.Scanner = """ + $show(in ));$skip(58); 
  val count = scala.collection.mutable.Map[String, Int]();System.out.println("""count  : scala.collection.mutable.Map[String,Int] = """ + $show(count ));$skip(195); 
  while (in.hasNext) {
    val word = in.next()
    val quantity: Int = count.getOrElse(word, 0)
    if (quantity == 0) {
      count += (word -> 1)
    } else {
      count(word) += 1
    }
  };$skip(18); val res$0 = 

  count("Alice");System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
  count("Rabbit");System.out.println("""res1: Int = """ + $show(res$1))}

}
