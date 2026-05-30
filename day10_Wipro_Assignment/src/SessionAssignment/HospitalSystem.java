package SessionAssignment;
import java.util.*;

	public class HospitalSystem implements Comparable<HospitalSystem> {
	int id;
	String name;
	 
	public HospitalSystem(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(HospitalSystem p)
	{
		return this.id - p.id;
	}
	@Override
	public String toString()
	{
		return id + " - " + name;
	}
	 
	public static void main(String[] args)
		{
		
		TreeSet<HospitalSystem> patients = new TreeSet<>();
		
		patients.add(new HospitalSystem(101, "raj"));
		patients.add(new HospitalSystem(102, "rohan"));
		patients.add(new HospitalSystem(103, "ajay"));
		patients.add(new HospitalSystem(101, "Veena"));
		
		System.out.println("Unique Registered Patients");
		for(HospitalSystem p: patients)
		{
			System.out.println(p);
		}
	 
		}
	 
	}
	

