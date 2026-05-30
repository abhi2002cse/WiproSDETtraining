package sessionAssignment;

interface Payment{
	
	void pay(double amount);     //abstract method
	
	default void paymentStatus() {     //default method
		System.out.println("Payment completed Successfully");
	}
}


//upi class
class upi implements Payment{
	public void pay(double amount) {
		System.out.println("Paid Rs " + amount + " using UPI ." );
	}
}


//credit card class
class creditCard implements Payment{
	public void pay(double amount) {
		System.out.println("Paid Rs " + amount + " using Credit Card .");
	}
}

//Netbanking clas

class netBanking implements Payment{
	public void pay(double amount) {
		System.out.println("Paid Rs " + amount + " using Net Banking .");
	}
}

public class paymentSystem {

	public static  void  main(String[] args) {
		
		Payment pay1 = new upi();   //run time polymosphism
		pay1.pay(2400);
		pay1.paymentStatus();
		
		
		Payment pay2 = new creditCard();
		pay2.pay(5900);
		pay2.paymentStatus();
		
		Payment pay3 = new netBanking();
		pay3.pay(10000);
		pay3.paymentStatus();
	}
}
