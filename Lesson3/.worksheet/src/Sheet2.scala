object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
  import scala.collection.mutable.ArrayBuffer;$skip(106); 
  val b = ArrayBuffer("Mary", "had", "a", "little", "lamb");System.out.println("""b  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(b ));$skip(16); val res$0 = 
  
  b += "its";System.out.println("""res0: Sheet2.b.type = """ + $show(res$0));$skip(34); val res$1 = 
  b += ("fleece", "was", "white");System.out.println("""res1: Sheet2.b.type = """ + $show(res$1));$skip(28); val res$2 = 
  b ++= Array("as", "snow");System.out.println("""res2: Sheet2.b.type = """ + $show(res$2));$skip(17); val res$3 = 
  
  b.remove(3);System.out.println("""res3: String = """ + $show(res$3));$skip(4); val res$4 = 
  b;System.out.println("""res4: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$4));$skip(33); 
  
  b.insert(3, "medium-sized");$skip(4); val res$5 = 
  b;System.out.println("""res5: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$5));$skip(15); 
  b.trimEnd(5);$skip(4); val res$6 = 
  b;System.out.println("""res6: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$6))}
}
