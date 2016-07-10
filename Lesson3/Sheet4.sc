import com.sun.org.apache.xalan.internal.xsltc.compiler.Import

object Sheet4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  import scala.collection.mutable.ArrayBuffer
  
  val b = ArrayBuffer(1, 7, 2, 9)                 //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
  b.sorted                                        //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 9)
  b                                               //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
  val sortedB = b.sorted                          //> sortedB  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 
                                                  //| 9)
  sortedB                                         //> res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 9)
  
  sortedB.reverse                                 //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(9, 7, 2, 1)
  
  Array(1,2,3).toString                           //> res4: String = [I@17550481
  Array(1,2,3).mkString(" | ")                    //> res5: String = 1 | 2 | 3
}