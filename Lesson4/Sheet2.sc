object Sheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
  }
  
  

  var hui = new Time(4)                           //> hui  : Sheet2.Time = 4:0
  
  hui.toString()                                  //> res0: String = 4:0
  hui.minutes                                     //> res1: Int = 0
  
  hui.minutes = 10
  hui.minutes                                     //> res2: Int = 0
  
}