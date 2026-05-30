package healthCareSector;

 class GeneralPhysician extends Doctor {
	 
	 public GeneralPhysician(String name) {
		 super(name , "General");
	 }

	 void diagnose(Patient patient) {
		 System.out.println("Doctor " + name + " treated " + patient.getname() + " for " + patient.getillness());
	 }
}
