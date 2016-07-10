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
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(860); 
  
  val acct1: SavingAccount = new SavingAccount with ConsoleLogger with TimestampLogger with ShortLogger {
  	override val maxLength = 10
  };System.out.println("""acct1  : Sheet3.SavingAccount = """ + $show(acct1 ));$skip(23); 
  acct1.withdraw(1000);$skip(128); 
  val acct2 = new SavingAccount with TimestampLogger  with ConsoleLogger  with ShortLogger {
  	override val maxLength = 10
  };System.out.println("""acct2  : Sheet3.SavingAccount with Sheet3.TimestampLogger with Sheet3.ConsoleLogger with Sheet3.ShortLogger = """ + $show(acct2 ));$skip(24); 
  acct2.withdraw(10000);$skip(89); 
  val acct3 = new SavingAccount with ShortLogger with TimestampLogger with ConsoleLogger;System.out.println("""acct3  : Sheet3.SavingAccount with Sheet3.ShortLogger with Sheet3.TimestampLogger with Sheet3.ConsoleLogger = """ + $show(acct3 ));$skip(24); 
  acct3.withdraw(10000)}
}
