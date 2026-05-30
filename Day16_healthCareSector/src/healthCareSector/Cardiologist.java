package healthCareSector;

 class Cardiologist  extends Doctor{
	 
	 public Cardiologist(String name) {
		 super(name , "Cardiology");
	 }
	 
	 void diagnose(Patient patient) {
		 
		 if(patient.getillness().toLowerCase().contains("heart")) {
			 System.out.println(" Dr. " + name + " treated " + patient.getname() + " for heart issue");
		 } else {
			 System.out.println("Dr. " + name + " referred" + patient.getname());
		 }
	 }
	  

}
