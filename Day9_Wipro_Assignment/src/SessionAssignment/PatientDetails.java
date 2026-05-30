package SessionAssignment;
import java.util.*;

class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


public class PatientDetails {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    patients.add(new Patient(name, age));
                    break;

                case 2:
                    for (Patient p : patients) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (Patient p : patients) {
                        if (p.name.equalsIgnoreCase(search)) {
                            System.out.println(p);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
