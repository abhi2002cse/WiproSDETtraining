package PracticeAssignment;

public class discountSystem {
	public static void main(String[] args) {
		
		int amount = 600;
		
		if(amount >= 1000) {
			System.out.println("You got 25% discount.  ");
		} else if(amount >= 500) {
			System.out.println("You got 10% discount.  ");
		} else if(amount >= 250){
			System.out.println("You got 5% discount.  ");
		} else {
			System.out.println("No discount available.  ");
		}
	}

}
