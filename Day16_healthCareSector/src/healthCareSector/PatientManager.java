package healthCareSector;

 class PatientManager implements PatientService {
	 
	 Patient[] patients = new Patient[10];
	 int count = 0;
	 
	 public void registerPatient(Patient p) {
		 if(count < patients.length) {
			 patients[count] = p;
			 count++;
			 System.out.println("Patient registeration successed");
		 }else {
			 System.out.println("Storage is full");
		 }
	 }
	 
	 public void showPatients() {
		 for(int i = 0; i < count; i++) {
			 System.out.println("ID : " + patients[i].getId());
			 System.out.println("name : " + patients[i].getname());
			 System.out.println("Age : " + patients[i].getage());
			 System.out.println("Illness : " + patients[i].getillness());
		 }
	 }

}
