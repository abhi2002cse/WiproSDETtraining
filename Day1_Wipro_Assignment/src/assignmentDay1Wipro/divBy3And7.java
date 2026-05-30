package assignmentDay1Wipro;
import java.util.Scanner;

public class divBy3And7 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();

	        if (num % 3 == 0 || num % 7 == 0) {
	            System.out.println("Divisible");
	        } else {
	            System.out.println("Not divisible");
	        }
	        sc.close();
	    }

}
