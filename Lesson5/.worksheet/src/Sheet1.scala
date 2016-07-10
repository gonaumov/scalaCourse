object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
  
  import java.awt._;$skip(62); 
  val r = new Rectangle(4, 10, 20, 30);System.out.println("""r  : java.awt.Rectangle = """ + $show(r ));$skip(22); 
  r.translate(10, 20);$skip(4); val res$0 = 
  r;System.out.println("""res0: java.awt.Rectangle = """ + $show(res$0))}
}
