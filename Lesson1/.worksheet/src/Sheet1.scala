object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(29); 
  val a = 6*7;System.out.println("""a  : Int = """ + $show(a ));$skip(4); val res$0 = 
  a;System.out.println("""res0: Int = """ + $show(res$0));$skip(24); 
  val b : BigInt  = 6*7;System.out.println("""b  : BigInt = """ + $show(b ));$skip(14); val res$1 = 
  b.pow(1000);System.out.println("""res1: scala.math.BigInt = """ + $show(res$1))}
}
