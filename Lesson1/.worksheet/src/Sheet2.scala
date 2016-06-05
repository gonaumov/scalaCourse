object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
	println("Welcome to the Scala worksheet")
	import scala.math._;$skip(31); val res$0 = 
	sqrt(10);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
	1.to(10);System.out.println("""res1: scala.collection.immutable.Range.Inclusive = """ + $show(res$1));$skip(24); val res$2 = 
  1.to(10).map(sqrt(_));System.out.println("""res2: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$2));$skip(22); val res$3 = 
  sqrt(10) * sqrt(10);System.out.println("""res3: Double = """ + $show(res$3));$skip(9); val res$4 = 
  6.*(7);System.out.println("""res4: Int(42) = """ + $show(res$4))}
}
