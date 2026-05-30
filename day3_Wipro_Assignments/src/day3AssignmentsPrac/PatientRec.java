package day3AssignmentsPrac;

class Patient{
	private String name;
	private String disease;
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public String getDisease() {
		return "Access is Restricted";
	}
	
	//now if doctors wants to access patient details
	public String getDetailsOfPatient() {
		return name + " " + disease;
	}
}

public class PatientRec {

	public static void main(String[] args) {
		
		Patient p = new Patient();
		
		p.setName("abhi");
		p.setDisease("typhoid");
		
		System.out.println("Patient Name is : " + p.getName());
		System.out.println("Patient disease is : " + p.getDisease());
		
		//doctor access
		System.out.println("Deatails of Patient is : " + p.getDetailsOfPatient());

		
	}
}
