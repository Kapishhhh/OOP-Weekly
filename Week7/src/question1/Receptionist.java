package question1;

//Receptionist
 
public class Receptionist extends Employee {
    public Receptionist(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void answerCalls() {
        System.out.println("Receptionist Emp#" + id + " is answering calls at the front desk.");
    }

}