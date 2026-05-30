package healthCareSector;

 class Patient {

	 private int id;
	 private String name;
	 private int age;
	 private String illness;
	 
	 public Patient(int id, String name, int age, String illness) {
		 this.id= id;
		 this.name = name;
		 this.age = age;
		 this.illness = illness;
		 }
	 
	 public int getId() {
		 return id;
	 }
	 
	 public String getname() {
		 return name;
	 }
	 
	 public int getage() {
		 return age;
	 }
	 
	 public String getillness() {
		 return illness;
	 }
}
