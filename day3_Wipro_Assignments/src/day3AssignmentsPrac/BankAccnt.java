package day3AssignmentsPrac;

class BankBal{
	
	private double balance;
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Invalid Withdrawl");
		}
	}
	
	public double getBal() {
		return balance;
	}
	
}



public class BankAccnt {

	public static void main(String[] args) {
		BankBal acc1 = new BankBal();
		acc1.deposit(2500);
		acc1.withdraw(500);
		
		System.out.println("Balance left is : " + acc1.getBal());
	}
}
