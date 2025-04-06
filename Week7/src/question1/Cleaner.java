package question1;

//Cleaner

public class Cleaner extends Employee {
    public Cleaner(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void cleanHospital() {
        System.out.println("Cleaner Emp#" + id + " is sweeping.");
    }

}
