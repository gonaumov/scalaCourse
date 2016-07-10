object Sheet3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
	
	import scala.collection.mutable.ArrayBuffer;$skip(80); 
	
	val a = Array(2, 3, 5, 7, 11);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(61); 
	val result = for(elem <- a if elem % 2 != 0) yield 2 * elem;System.out.println("""result  : Array[Int] = """ + $show(result ))}
}
