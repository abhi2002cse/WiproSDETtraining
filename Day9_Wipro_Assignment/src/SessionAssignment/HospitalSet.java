package SessionAssignment;
import java.util.*;
import java.util.Scanner;

public class HospitalSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//to store unique ids
		Set<Integer> patientsIds = new HashSet<>();
		
		while(true) {
			
			System.out.println("1. Register Patient ");
			System.out.println("2. View Patients ");
			System.out.println("3. Exit ");
			System.out.println(" Enter ur Choice ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter Patient ID : ");
				int id = sc.nextInt();
				
				if(patientsIds.contains(id)) {
					System.out.println("Already registered ID.");
				} else {
					patientsIds.add(id);
					System.out.println(" Patient added Successfully ");
				}
				break;
				
			case 2:
				System.out.println("Unique Registered Patient IDs ");
				if(patientsIds.isEmpty()) {
					System.out.println(" No Registered Patients ");
				} else {
					for(int patId : patientsIds) {
						System.out.println(patId);
					}
				}
				break;
				
			case 3:
				System.out.println("Exit.. ");
				return;
				
			default:
				System.out.println("Invalid Choice. ");
			}
			
		}
	}
}
