object Sheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import java.awt._
  trait RectangleLike {
  	def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
  	def getX: Double
  	def getY: Double
  	def getWidth: Double
  	def getHeight: Double
  	def translate(dx: Double, dy: Double) {
  	   setFrame(getX + dx, getY + dy, getWidth, getHeight)
  	}
  	override def toString = f"(${getX}, ${getY})"
  }
  
  val egg = new geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
                                                  //> egg  : java.awt.geom.Ellipse2D.Double with Sheet2.RectangleLike = (5.0, 10.0
                                                  //| )
  egg.translate(10, 20)
  egg                                             //> res0: java.awt.geom.Ellipse2D.Double with Sheet2.RectangleLike = (15.0, 30.0
                                                  //| )
}