package question1;
	
//Doctor 

	public class Doctor extends Employee {
	    private String specialization;

	    public Doctor(String name, int id, double salary, String specialization) {
	        super(name, id, salary);
	        this.specialization = specialization;
	    }

	    public void treatPatients() {
	        System.out.println("Doctor Emp#" + id + " specializes in " + specialization + ".");
	    }

	}
