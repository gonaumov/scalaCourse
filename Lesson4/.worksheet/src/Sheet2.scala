object Sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")

  class Time(h: Int, m: Int) {
    require(h >= 0 && h <= 23 && m >= 0 && m <= 23)
    private var minutesSinceMidnight = (h*60) + m
    
    def this(hour: Int) {
    	this(hour, 0)
    }
    
    def hours = h
    
    
    def minutes = m
     
    def minutes_=(newValue: Int): Unit = {
    		minutesSinceMidnight = minutesSinceMidnight - m
    		minutesSinceMidnight = minutesSinceMidnight + newValue
    }
    
    def <(other: Time): Boolean = {
        other.hours < hours || (other.hours <= h && other.minutes < m)
    }
    
    override def toString(): String = {
        h + ":" + m
    }
  };$skip(637); 
  
  

  var hui = new Time(4);System.out.println("""hui  : Sheet2.Time = """ + $show(hui ));$skip(20); val res$0 = 
  
  hui.toString();System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
  hui.minutes;System.out.println("""res1: Int = """ + $show(res$1));$skip(22); 
  
  hui.minutes = 10;$skip(14); val res$2 = 
  hui.minutes;System.out.println("""res2: Int = """ + $show(res$2))}
  
}
