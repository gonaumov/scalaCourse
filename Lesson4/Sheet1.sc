object Sheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
  }
  
  

  var hui = Time(4,1)                             //> hui  : Sheet1.Time = 4:1
  if(hui < (new Time(6))) {
  	println("uppper")
  }
  hui.toString()                                  //> res0: String = 4:1
  hui.minutes                                     //> res1: Int = 1
  hui.minutes = 2
  hui.toString                                    //> res2: String = 4:2
  hui - new Time(1)                               //> res3: Int = 182
}