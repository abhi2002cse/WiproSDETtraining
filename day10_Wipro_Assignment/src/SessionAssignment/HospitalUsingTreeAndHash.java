package SessionAssignment;
import java.util.*;

class Patient{
	int id;
	String name;
	int age;
	
	Patient(int id, String name, int age){
		this.id =id;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return id + " " + name + " " + age;
 	}
}


public class HospitalUsingTreeAndHash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Patient> map = new HashMap<>();
		
		while(true) {
			System.out.println("1. Add  2.Update 3.Get"
					+ " 4.Remove 5.List 6.Exists"
					+ " 7.Count 8.Clear 9.Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			//Adding patients
			case 1: 
				System.out.println("Enter ID : ");
				int id = sc.nextInt();
				
				if(map.containsKey(id)) {
					System.out.println("Patient already exists! ");
					break;
				}
				
				System.out.println("Enter name : ");
				String name = sc.next();
				
				System.out.println("Enter Age : ");
				int age = sc.nextInt();
				
				map.put(id,  new Patient(id,name,age));
				 System.out.println("Patient Added!");
                 break;
              
			case 2 : //updating
				
				System.out.print("Enter ID: ");
                id = sc.nextInt();

                if (map.containsKey(id)) {
                    System.out.print("Enter New Name: ");
                    name = sc.next();

                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();

                    map.put(id, new Patient(id, name, age));
                    System.out.println("Updated!");
                } else {
                    System.out.println("Patient not found!");
                }
                break;
               
				
			 case 3:  //retrieving patient details
                 System.out.print("Enter ID: ");
                 id = sc.nextInt();

                 if (map.containsKey(id)) {
                     System.out.println(map.get(id));
                 } else {
                     System.out.println("Patient not found!");
                 }
                 break;
                 
			 case 4: // Remove patient
                 System.out.print("Enter ID: ");
                 id = sc.nextInt();

                 if (map.containsKey(id)) {
                     map.remove(id);
                     System.out.println("Removed!");
                 } else {
                     System.out.println("Patient not found!");
                 }
                 break;
                 
			 case 5: //lists all the patients
                 TreeMap<Integer, Patient> sorted = new TreeMap<>(map);
                 System.out.println("All Patients (Sorted):");
                 for (Patient p : sorted.values()) {
                     System.out.println(p);
                 }
                 break; 
                 
			  case 6: // Exists or not
                  System.out.print("Enter ID: ");
                  id = sc.nextInt();

                  if (map.containsKey(id)) {
                      System.out.println("Patient exists");
                  } else {
                      System.out.println("Patient not found");
                  }
                  break;
                  
			  case 7: // Count
                  System.out.println("Total Patients: " + map.size());
                  break;

              case 8: // Clear
                  map.clear();
                  System.out.println("All records cleared!");
                  break;

              case 9:
                  System.out.println("Exiting...");
                  return;

              default:
                  System.out.println("Invalid choice!");
			}
		}
	}
}
