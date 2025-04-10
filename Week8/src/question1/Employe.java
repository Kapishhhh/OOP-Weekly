package question1;

//Employee

public class Employe extends StaffMember {
    protected double payRate;

    public Employe(String eName, String eAddress, String ePhone,
                     double rate) {
        super(eName, eAddress, ePhone);
        payRate = rate;
    }

    public double pay() {
        return payRate;
    }

    @Override
    public String vacation() {
        return "Vacation: 20 days";
    }
   }
