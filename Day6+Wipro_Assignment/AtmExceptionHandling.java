package sessionAssignment;

import java.util.Scanner;

class InvalidPinException extends Exception{
	public InvalidPinException(String message) {
		super(message);
	}
}

class Atm{
	
	private final int correctPin = 0000;
	
	public void validatePin(int enteredPin) throws InvalidPinException{
		
		if(enteredPin != correctPin) {
			throw new InvalidPinException("Incorrect PIN entered");
		} else {
			System.out.println("PIN verification is success ");
		}
	}
}

public class AtmExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		
		System.out.println("Insert ur card..");
		
		try {
			System.out.println("Enter ur pin : ");
			int pin = sc.nextInt();
			
			atm.validatePin(pin);
			
			System.out.println("Access granted. Proceed with transaction .");
		
		} catch(InvalidPinException e) { //exception handling
			System.out.println("Exception : " + e.getMessage());
		
		} catch(Exception e) {
			System.out.println("Something went wrong :" + e);
		
		} finally {
			System.out.println("transaction attempt logged ");
		}
		
		sc.close();
		
	}
}
