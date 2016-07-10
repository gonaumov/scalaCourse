object Sheet5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob 
                                                  //| -> 3, Cindy -> 8)
  val mscores = scala.collection.mutable.Map("Allice" -> 10)
                                                  //> mscores  : scala.collection.mutable.Map[String,Int] = Map(Allice -> 10)
  mscores                                         //> res0: scala.collection.mutable.Map[String,Int] = Map(Allice -> 10)
  
  "Allice" -> 1                                   //> res1: (String, Int) = (Allice,1)
  
  val bobsScore = scores("Bob")                   //> bobsScore  : Int = 3
  
  val fredScore = scores.getOrElse("Fred", 0)     //> fredScore  : Int = 0
  
  mscores("Bob") = 7
  mscores("Tom") = 3
  
  mscores                                         //> res2: scala.collection.mutable.Map[String,Int] = Map(Bob -> 7, Tom -> 3, All
                                                  //| ice -> 10)
  
  scores + ("Bob" -> 10, "Fred" -> 7)             //> res3: scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -> 1
                                                  //| 0, Cindy -> 8, Fred -> 7)
  scores                                          //> res4: scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -> 3
                                                  //| , Cindy -> 8)
  
}