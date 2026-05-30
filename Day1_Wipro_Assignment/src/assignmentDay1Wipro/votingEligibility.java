package assignmentDay1Wipro;
import java.util.Scanner;

public class votingEligibility {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int age = sc.nextInt();

	        if (age >= 18) {
	            System.out.println("Eligible to vote");
	        } else {
	            System.out.println("Not eligible");
	        }
	        sc.close();
	    }

}
