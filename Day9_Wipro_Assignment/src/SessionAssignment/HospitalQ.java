package SessionAssignment;
import java.util.*;

public class HospitalQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> queue = new LinkedList<>();
		
		while(true) {
			System.out.println("1. Add Patient . ");
			System.out.println("2. Add Emegency Patient . ");
			System.out.println("3. Remove Patient . ");
			System.out.println("4. View All Patient . ");
			System.out.println("5. Show first and last Patient . ");
			System.out.println("6. Exit . ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter patient name : ");
				queue.addLast(sc.nextLine());
				break;
				
			case 2:
				System.out.println("Enter emergency patient name : ");
				queue.addLast(sc.nextLine());
				break;
				
			case 3:
				if(!queue.isEmpty()) { 
					System.out.println("Removed : " + queue.removeFirst());
				}else {
					System.out.println("Queue of patient is empty. ");
				}
				break;
				
			case 4 : 
				System.out.println(queue);
				break;
				
			case 5 :
				if(!queue.isEmpty()) {
					System.out.println("First Patient: " + queue.getFirst());
					System.out.println("Last Patient : " + queue.getLast());
				} else {
					System.out.println("Queue is empty.");
				}
				break;
				
			case 6 :
				return;
				
			default:
				System.out.println("Invalid Choice.");
				
			}
		}
	}
}
