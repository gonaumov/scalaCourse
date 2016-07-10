object Sheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import scala.collection.mutable.ArrayBuffer
  val b = ArrayBuffer("Mary", "had", "a", "little", "lamb")
                                                  //> b  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, a
                                                  //| , little, lamb)
  
  b += "its"                                      //> res0: Sheet2.b.type = ArrayBuffer(Mary, had, a, little, lamb, its)
  b += ("fleece", "was", "white")                 //> res1: Sheet2.b.type = ArrayBuffer(Mary, had, a, little, lamb, its, fleece, w
                                                  //| as, white)
  b ++= Array("as", "snow")                       //> res2: Sheet2.b.type = ArrayBuffer(Mary, had, a, little, lamb, its, fleece, w
                                                  //| as, white, as, snow)
  
  b.remove(3)                                     //> res3: String = little
  b                                               //> res4: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, 
                                                  //| a, lamb, its, fleece, was, white, as, snow)
  
  b.insert(3, "medium-sized")
  b                                               //> res5: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, 
                                                  //| a, medium-sized, lamb, its, fleece, was, white, as, snow)
  b.trimEnd(5)
  b                                               //> res6: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, 
                                                  //| a, medium-sized, lamb, its)
}