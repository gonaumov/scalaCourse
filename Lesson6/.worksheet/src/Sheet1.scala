object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(52); 
  
  val zones = java.util.TimeZone.getAvailableIDs;System.out.println("""zones  : Array[String] = """ + $show(zones ));$skip(104); val res$0 = 
    zones.map(s => s.split("/")).filter(_.length > 1).map(x => x(1)).grouped(10).toArray.map(x => x(0));System.out.println("""res0: Array[String] = """ + $show(res$0))}
}
