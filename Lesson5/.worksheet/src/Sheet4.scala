object Sheet4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
  
  import java.io._
  
  trait Logger extends Buffered  {
  	override def read() = {
  			println("Call it")
  			super.read()
  	}
  }
  
  trait Buffered extends InputStream {
  	val SIZE = 1024
  	private var end = 0
  	private val buffer = new Array[Byte](SIZE)
 		private var pos = 0
 		
 		override def read() = {
 		  println("!Parent is also called!")
 			if (pos == end) {
 				end = super.read(buffer, 0, SIZE)
 				pos = 0
 			}
 			
 			if (pos == end) -1 else {
 				pos += 1
 				buffer(pos -1 )
 			}
 		}
  };$skip(635); 
  
  
  var reader = new FileInputStream("/home/georginaumov/Documents/test.txt") with Logger with Buffered;System.out.println("""reader  : java.io.FileInputStream with Sheet4.Logger with Sheet4.Buffered = """ + $show(reader ));$skip(16); val res$0 = 
  reader.read();System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  reader.read();System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
  reader.read();System.out.println("""res2: Int = """ + $show(res$2))}
}
