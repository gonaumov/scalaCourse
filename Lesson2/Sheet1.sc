object Sheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = -1                                      //> x  : Int = -1
  
  val result = if(x > 0) "something"              //> result  : Any = ()
  
  val result2 = ()                                //> result2  : Unit = ()
  
  val n = 10                                      //> n  : Int = 10
  for(i <- 1 to n) println(i)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  for(i <- "Hello") println(i)                    //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
  for(i <- 1 to 3; j <-1 to 3) println((i + j) + " ")
                                                  //> 2 
                                                  //| 3 
                                                  //| 4 
                                                  //| 3 
                                                  //| 4 
                                                  //| 5 
                                                  //| 4 
                                                  //| 5 
                                                  //| 6 
}