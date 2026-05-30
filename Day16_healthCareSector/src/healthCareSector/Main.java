package healthCareSector;

public class Main {
	
	public static void main(String[] args) {
		
		PatientService service = new PatientManager();
		
		Patient p1 = new Patient(1,"Raj", 30, "Fever");
		Patient p2 = new Patient(2,"Ankit", 45, "Heart Pain");
		
		service.registerPatient(p1);
		service.registerPatient(p2);
		
		System.out.println(" Patient Details ");
		service.showPatients();
		
		Doctor d1 = new GeneralPhysician("Sharma");
		Doctor d2 = new Cardiologist("Mehta");
		
		System.out.println(" Diagnosis  ");
		
		d1.diagnose(p1);
		d1.diagnose(p2);
		
		
		d2.diagnose(p1);
		d2.diagnose(p2);
	}

}
