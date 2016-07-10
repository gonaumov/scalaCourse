import scala.collection.mutable.ArrayBuffer

object Sheet6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  println("Welcome to the Scala worksheet");$skip(45); 
  var input = ArrayBuffer(1, -1, -2, -3, -4);System.out.println("""input  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(input ));$skip(15); val res$0 = 
  input.sorted;System.out.println("""res0: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$0));$skip(8); val res$1 = 
  input;System.out.println("""res1: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$1));$skip(40); 
  var findFirstElement: Boolean = false;System.out.println("""findFirstElement  : Boolean = """ + $show(findFirstElement ));$skip(205); 
  
  for (element <- input) {
    if(element < 0 && findFirstElement == false) {
    	findFirstElement = true
    }
    
    if(element < 0 && findFirstElement == true) {
    	input -= (element)
    }
  };$skip(11); val res$2 = 
  
  input;System.out.println("""res2: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$2))}
}
