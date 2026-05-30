package PracticeAssignment;

public class menuDriven {
	
	public static void main(String[] args) {
		
		int choice = 3;
		
		switch(choice){
		
		case 1 : 
			System.out.println("coffee ");
			break;
			
		case 2 : 
			System.out.println("tea ");
			break;
			
		case 3 : 
			System.out.println("pizza ");
			break;
			
		case 4 : 
			System.out.println("ice-cream ");
			break;
			
		default:
			System.out.println("Invalid choice ");
		}
	}

}
