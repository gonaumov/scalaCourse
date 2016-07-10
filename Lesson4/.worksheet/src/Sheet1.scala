object Sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")

  class Time(val hour: Int, var minutes: Int) {
    require(hour >= 0 && hour <= 23 && minutes >= 0 && minutes <= 23)
    
    def this(hour: Int) {
    	this(hour, 0)
    }
    
    def < (other: Time): Boolean = {
        other.hour < hour || (other.hour <= hour && other.minutes < minutes)
    }
    
    def - (other: Time): Int = {
    	((hour*60) + minutes) - ((other.hour*60) + other.minutes)
    }
    
    override def toString(): String = {
        hour + ":" + minutes
    }
  }
  
  object Time {
  		def apply(h: Int, m: Int) = new Time(h,m)
  };$skip(589); 
  
  

  var hui = Time(4,1);System.out.println("""hui  : Sheet1.Time = """ + $show(hui ));$skip(53); 
  if(hui < (new Time(6))) {
  	println("uppper")
  };$skip(17); val res$0 = 
  hui.toString();System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
  hui.minutes;System.out.println("""res1: Int = """ + $show(res$1));$skip(18); 
  hui.minutes = 2;$skip(15); val res$2 = 
  hui.toString;System.out.println("""res2: String = """ + $show(res$2));$skip(20); val res$3 = 
  hui - new Time(1);System.out.println("""res3: Int = """ + $show(res$3))}
}
