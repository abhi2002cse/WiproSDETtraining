package day3AssignmentsPrac;

class Voter{
	private String name;
    private int age;
    private boolean hasVoted;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void vote() {
        if (age >= 18 && !hasVoted) {
            hasVoted = true;
            System.out.println("Vote cast successfully");
        } else if (hasVoted) {
            System.out.println("Already voted");
        } else {
            System.out.println("Not eligible");
        }
    }
}





public class VotingApp {

	 public static void main(String[] args) {

	        Voter v = new Voter();   // object creation

	        v.setDetails("Abhi", 20);

	        v.vote();  // first attempt
	        v.vote();  // second attempt (to check restriction)
	    }
}
