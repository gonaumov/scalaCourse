object Sheet4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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
  }
  
  
  var reader = new FileInputStream("/home/georginaumov/Documents/test.txt") with Logger with Buffered
                                                  //> reader  : java.io.FileInputStream with Sheet4.Logger with Sheet4.Buffered = 
                                                  //| Sheet4$$anonfun$main$1$$anon$1@6a5fc7f7
  reader.read()                                   //> Call it
                                                  //| !Parent is also called!
                                                  //| res0: Int = 72
  reader.read()                                   //> Call it
                                                  //| !Parent is also called!
                                                  //| res1: Int = 101
  reader.read()                                   //> Call it
                                                  //| !Parent is also called!
                                                  //| res2: Int = 114
}