object Sheet10 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val words = Array("Mary", "had", "a", "little", "lamb",
  "its", "fleece", "was", "white", "as", "snow", "and",
  "everywhere", "that", "Mary", "went", "the", "lamb",
  "was", "sure", "to", "go")                      //> words  : Array[String] = Array(Mary, had, a, little, lamb, its, fleece, was,
                                                  //|  white, as, snow, and, everywhere, that, Mary, went, the, lamb, was, sure, t
                                                  //| o, go)
 	words.groupBy(_.substring(0, 1))          //> res0: scala.collection.immutable.Map[String,Array[String]] = Map(e -> Array(
                                                  //| everywhere), s -> Array(snow, sure), t -> Array(that, the, to), f -> Array(f
                                                  //| leece), a -> Array(a, as, and), M -> Array(Mary, Mary), i -> Array(its), g -
                                                  //| > Array(go), l -> Array(little, lamb, lamb), h -> Array(had), w -> Array(was
                                                  //| , white, went, was))
	words.groupBy( _.length)                  //> res1: scala.collection.immutable.Map[Int,Array[String]] = Map(5 -> Array(whi
                                                  //| te), 10 -> Array(everywhere), 1 -> Array(a), 6 -> Array(little, fleece), 2 -
                                                  //| > Array(as, to, go), 3 -> Array(had, its, was, and, the, was), 4 -> Array(Ma
                                                  //| ry, lamb, snow, that, Mary, went, lamb, sure))
}