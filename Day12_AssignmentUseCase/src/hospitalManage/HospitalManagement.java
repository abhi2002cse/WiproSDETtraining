package hospitalManage;
import java.io.*;
import java.util.*;

public class HospitalManagement {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            //  Files
	            File patientFile = new File("patient.txt");
	            File reportFile = new File("report.txt");

	            if (!patientFile.exists()) patientFile.createNewFile();
	            if (!reportFile.exists()) reportFile.createNewFile();

	            int choice;

	            do {
	                System.out.println("\n HOSPITAL MENU ");
	                System.out.println("1. Add Patient");
	                System.out.println("2. View Patients");
	                System.out.println("3. Search Patient");
	                System.out.println("4. Add Medical Report");
	                System.out.println("5. View Reports");
	                System.out.println("6. Exit");
	                System.out.print("Enter choice: ");
	                choice = sc.nextInt();
	                sc.nextLine(); // clear buffer

	                switch (choice) {

	                    //  Add Patient
	                    case 1:
	                        System.out.print("Enter ID: ");
	                        int id = sc.nextInt();
	                        sc.nextLine();

	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();

	                        System.out.print("Enter Age: ");
	                        int age = sc.nextInt();
	                        sc.nextLine();

	                        System.out.print("Enter Disease: ");
	                        String disease = sc.nextLine();

	                        BufferedWriter bw = new BufferedWriter(
	                                new FileWriter(patientFile, true));

	                        bw.write(id + "," + name + "," + age + "," + disease);
	                        bw.newLine();
	                        bw.close();

	                        System.out.println("Patient added successfully!");
	                        break;

	                    //  View Patients
	                    case 2:
	                        BufferedReader br = new BufferedReader(
	                                new FileReader(patientFile));

	                        String line;
	                        System.out.println("\n--- Patient List ---");
	                        while ((line = br.readLine()) != null) {
	                            System.out.println(line);
	                        }
	                        br.close();
	                        break;

	                    // . Search Patient
	                    case 3:
	                        System.out.print("Enter ID to search: ");
	                        int searchId = sc.nextInt();

	                        BufferedReader br2 = new BufferedReader(
	                                new FileReader(patientFile));

	                        String line2;
	                        boolean found = false;

	                        while ((line2 = br2.readLine()) != null) {
	                            if (line2.startsWith(searchId + ",")) {
	                                System.out.println("Found: " + line2);
	                                found = true;
	                            }
	                        }
	                        br2.close();

	                        if (!found) {
	                            System.out.println("Patient not found!");
	                        }
	                        break;

	                    //  Add Medical Report
	                    case 4:
	                        System.out.print("Enter Patient ID: ");
	                        int pid = sc.nextInt();
	                        sc.nextLine();

	                        System.out.print("Enter Report: ");
	                        String report = sc.nextLine();

	                        System.out.print("Enter Doctor Name: ");
	                        String doctor = sc.nextLine();

	                        BufferedWriter bw2 = new BufferedWriter(
	                                new FileWriter(reportFile, true));

	                        bw2.write(pid + "," + report + "," + doctor);
	                        bw2.newLine();
	                        bw2.close();

	                        System.out.println(" Report added successfully!");
	                        break;

	                    //  . View Reports
	                    case 5:
	                        BufferedReader br3 = new BufferedReader(
	                                new FileReader(reportFile));

	                        String line3;
	                        System.out.println("\n--- Medical Reports ---");
	                        while ((line3 = br3.readLine()) != null) {
	                            System.out.println(line3);
	                        }
	                        br3.close();
	                        break;

	                    case 6:
	                        System.out.println("Exiting...");
	                        break;

	                    default:
	                        System.out.println(" Invalid choice!");
	                }

	            } while (choice != 6);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        sc.close();
	    }

}
