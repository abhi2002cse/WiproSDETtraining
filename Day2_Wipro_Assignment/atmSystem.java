package PracticeAssignment;

public class atmSystem {

	public static void main(String[] args) {
		
		int balance =  2000;
		
		int withdrawl = 1000;
		
		if(withdrawl <= balance) {
			balance = balance - withdrawl;
			System.out.println("Successfully Withdrawl ");
			System.out.println("Remaining balance : " + balance );
		} else {
			System.out.println("Insufficient balance ");
		}
	}
}
