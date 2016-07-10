import com.sun.org.apache.xalan.internal.xsltc.compiler.Import

object Sheet4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(123); 
  println("Welcome to the Scala worksheet")
  
  import scala.collection.mutable.ArrayBuffer;$skip(86); 
  
  val b = ArrayBuffer(1, 7, 2, 9);System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(11); val res$0 = 
  b.sorted;System.out.println("""res0: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$0));$skip(4); val res$1 = 
  b;System.out.println("""res1: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$1));$skip(25); 
  val sortedB = b.sorted;System.out.println("""sortedB  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(sortedB ));$skip(10); val res$2 = 
  sortedB;System.out.println("""res2: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$2));$skip(21); val res$3 = 
  
  sortedB.reverse;System.out.println("""res3: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$3));$skip(27); val res$4 = 
  
  Array(1,2,3).toString;System.out.println("""res4: String = """ + $show(res$4));$skip(31); val res$5 = 
  Array(1,2,3).mkString(" | ");System.out.println("""res5: String = """ + $show(res$5))}
}
