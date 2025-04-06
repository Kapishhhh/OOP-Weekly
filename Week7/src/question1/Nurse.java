package question1;

//Nurse

	public class Nurse extends Employee {
	    public Nurse(String name, int id, double salary) {
	        super(name, id, salary);
	    }

	    public void assistPatients() {
	        System.out.println("Nurse Emp#" + id + " has patients.");
	    }

	}
