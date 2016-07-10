object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(29); 
  val a = new Array[Int](10);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(40); 
  for(i <- 0 until a.length) a(i) = i*i;$skip(4); val res$0 = 
  a;System.out.println("""res0: Array[Int] = """ + $show(res$0))}
}
