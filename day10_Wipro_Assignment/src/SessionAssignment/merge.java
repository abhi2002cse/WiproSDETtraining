package SessionAssignment;
import java.util.*;
public class merge {

	 public static void main(String[] args) {
		 
		 List<String> list1 = Arrays.asList("abhi", "ravi", "ram");
	        List<String> list2 = Arrays.asList("ram", "rohan", "sujal");

	        List<String> list3 = new ArrayList<>();

	        // Add from list1
	        for (String s : list1) {
	            if (!list3.contains(s)) {  
	                list3.add(s);
	            }
	        }

	        // Add from list2
	        for (String s : list2) {
	            if (!list3.contains(s)) {  
	                list3.add(s);
	            }
	        }

	        // Sorting
	        Collections.sort(list3);

	        // Output
	        System.out.println("Merged Sorted List wihtout Duplicates : " + list3);
	 }
}
