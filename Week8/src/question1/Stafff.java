package question1;

//staff

public class Stafff {
    private StaffMember[] staffList;

    public Stafff() {
        staffList = new StaffMember[3];

        staffList[0] = new Employe("Alish", "Baglung", "9812234567", 50000);
        staffList[1] = new Employe("pratik", "Maitighar", "9876543222", 16000);
        staffList[2] = new Employe("Dibas", "Thapathali", "9876453421", 14550);
    }

    public void payday() {
        for (StaffMember staff : staffList) {
            System.out.println(staff);
            System.out.println("Monney Paid: Rs" + staff.pay());
            System.out.println(staff.vacation());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        }
     }
       }
