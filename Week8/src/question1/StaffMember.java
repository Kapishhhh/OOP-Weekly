package question1;

//staffmember

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }

    public abstract double pay();
    
    public String vacation() {
        return "Vacation: 0 days";
    }

  }
