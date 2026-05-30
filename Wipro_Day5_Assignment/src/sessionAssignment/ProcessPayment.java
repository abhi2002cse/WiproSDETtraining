package sessionAssignment;

class PAyment{
	
	public final void processPay(double amount) {
		System.out.println( "processing payment  of Rs. " + amount );
		System.out.println( "Payment completed successfully." );
	}
}

//subclass

class CreditCardPayment extends PAyment{
	
	/*public void processPay(double amount) {
		System.out.println("Modified");
	}*/
	
	public void showPaymentType() {
		System.out.println("payment method : Credit Card");
	}
}

public class ProcessPayment {

	 public static void main(String[] args) {

	        CreditCardPayment obj = new CreditCardPayment();

	        obj.showPaymentType();
	        obj.processPay(5000);  // calling final method
	    }
	
}
