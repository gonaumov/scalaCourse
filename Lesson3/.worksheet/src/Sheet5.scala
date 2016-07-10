object Sheet5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(60); 
  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(61); 
  val mscores = scala.collection.mutable.Map("Allice" -> 10);System.out.println("""mscores  : scala.collection.mutable.Map[String,Int] = """ + $show(mscores ));$skip(10); val res$0 = 
  mscores;System.out.println("""res0: scala.collection.mutable.Map[String,Int] = """ + $show(res$0));$skip(19); val res$1 = 
  
  "Allice" -> 1;System.out.println("""res1: (String, Int) = """ + $show(res$1));$skip(35); 
  
  val bobsScore = scores("Bob");System.out.println("""bobsScore  : Int = """ + $show(bobsScore ));$skip(49); 
  
  val fredScore = scores.getOrElse("Fred", 0);System.out.println("""fredScore  : Int = """ + $show(fredScore ));$skip(24); 
  
  mscores("Bob") = 7;$skip(21); 
  mscores("Tom") = 3;$skip(13); val res$2 = 
  
  mscores;System.out.println("""res2: scala.collection.mutable.Map[String,Int] = """ + $show(res$2));$skip(41); val res$3 = 
  
  scores + ("Bob" -> 10, "Fred" -> 7);System.out.println("""res3: scala.collection.immutable.Map[String,Int] = """ + $show(res$3));$skip(9); val res$4 = 
  scores;System.out.println("""res4: scala.collection.immutable.Map[String,Int] = """ + $show(res$4))}
  
}
