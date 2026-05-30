package day3AssignmentsPrac;

class employ{
	 private String name;
	    private double salary;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setSal(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        }
	    }

	    public double getSal() {
	        return salary;
	    }
}



public class employee {
	public static void main(String[] args) {
		employ emp = new employ();

        emp.setName("Abhi");
        emp.setSal(40000);

        System.out.println(emp.getName());
        System.out.println(emp.getSal());
    }

}
