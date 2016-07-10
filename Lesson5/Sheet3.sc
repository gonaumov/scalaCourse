object Sheet3 {
  trait Logged {
  	def log(msg: String) {
  	}
  }

  trait ConsoleLogger extends Logged {
  	override def log(msg: String) {
  			println(msg)
  	}
  }
  
  trait TimestampLogger extends Logged {
  	override def log(msg: String) {
  			super.log(new java.util.Date() + " " + msg)
  	}
  }
  
  trait ShortLogger extends Logged {
  	val maxLength = 15
  	override def log(msg: String) {
  		super.log(
  			(if(msg.length <= maxLength) msg
  			else msg.substring(0, maxLength -3) + "..."))
  	}
  }
  
  class SavingAccount extends Logged {
  	private var balance: Double = 0
  	def withdraw(amount: Double) {
  	  if(amount > balance) log("Insufficient funds")
  	  else balance -= amount
  	}
  }
  
  val acct1: SavingAccount = new SavingAccount with ConsoleLogger with TimestampLogger with ShortLogger {
  	override val maxLength = 10
  }                                               //> acct1  : Sheet3.SavingAccount = Sheet3$$anonfun$main$1$$anon$1@61e4705b
  acct1.withdraw(1000)                            //> Mon Jun 20 17:36:00 EEST 2016 Insuffi...
  val acct2 = new SavingAccount with TimestampLogger  with ConsoleLogger  with ShortLogger {
  	override val maxLength = 10
  }                                               //> acct2  : Sheet3.SavingAccount with Sheet3.TimestampLogger with Sheet3.Conso
                                                  //| leLogger with Sheet3.ShortLogger = Sheet3$$anonfun$main$1$$anon$2@880ec60
  acct2.withdraw(10000)                           //> Insuffi...
  val acct3 = new SavingAccount with ShortLogger with TimestampLogger with ConsoleLogger
                                                  //> acct3  : Sheet3.SavingAccount with Sheet3.ShortLogger with Sheet3.Timestamp
                                                  //| Logger with Sheet3.ConsoleLogger = Sheet3$$anonfun$main$1$$anon$3@3f3afe78
  acct3.withdraw(10000)                           //> Insufficient funds
}