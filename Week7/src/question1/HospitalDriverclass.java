package question1;

//Driver class


public class HospitalDriverclass {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr.Kapish", 1, 10000, "Gyanecology");
        Nurse nurse = new Nurse("Pratik", 2, 60000);
        Receptionist recep = new Receptionist("Dibas", 3, 35000);
        Cleaner cleaner = new Cleaner("Sachet	", 4, 25000);

        doc.treatPatients();

        nurse.assistPatients();

        recep.answerCalls();

        cleaner.cleanHospital();
    }
}
