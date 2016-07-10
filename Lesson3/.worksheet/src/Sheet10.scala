object Sheet10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(198); 
  val words = Array("Mary", "had", "a", "little", "lamb",
  "its", "fleece", "was", "white", "as", "snow", "and",
  "everywhere", "that", "Mary", "went", "the", "lamb",
  "was", "sure", "to", "go");System.out.println("""words  : Array[String] = """ + $show(words ));$skip(35); val res$0 = 
 	words.groupBy(_.substring(0, 1));System.out.println("""res0: scala.collection.immutable.Map[String,Array[String]] = """ + $show(res$0));$skip(26); val res$1 = 
	words.groupBy( _.length);System.out.println("""res1: scala.collection.immutable.Map[Int,Array[String]] = """ + $show(res$1))}
}
