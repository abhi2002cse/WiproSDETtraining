package assignmentDay1Wipro;
import java.util.Scanner;

public class divBy5and11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else {
            System.out.println("Not divisible");
        }
        sc.close();
    }
	

}
