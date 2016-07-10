object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
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
  };$skip(433); 
  
  val egg = new geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike;System.out.println("""egg  : java.awt.geom.Ellipse2D.Double with Sheet2.RectangleLike = """ + $show(egg ));$skip(24); 
  egg.translate(10, 20);$skip(6); val res$0 = 
  egg;System.out.println("""res0: java.awt.geom.Ellipse2D.Double with Sheet2.RectangleLike = """ + $show(res$0))}
}
