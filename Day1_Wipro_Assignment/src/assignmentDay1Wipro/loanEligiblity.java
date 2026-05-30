package assignmentDay1Wipro;
import java.util.Scanner;

public class loanEligiblity {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int age = sc.nextInt();
	        int salary = sc.nextInt();

	        if (age >= 21 && salary >= 25000) {
	            System.out.println("Eligible for loan");
	        } else {
	            System.out.println("Not eligible");
	        }
	        sc.close();
	    }
}
