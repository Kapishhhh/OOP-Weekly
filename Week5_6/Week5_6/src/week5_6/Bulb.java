package week5_6;

public class Bulb {
    private boolean isOn;

    // Constructor 
    public Bulb() {
        isOn = false;
    }

    // Bulb on
    public void turnOn() {
        isOn = true;
    }

    //Bulb off
    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public static void main(String[] args) {
        //Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

      
        bulb1.turnOn();
        System.out.println("Bulb 1 is " + bulb1.getStatus());

        bulb2.turnOff();
        System.out.println("Bulb 2 is " + bulb2.getStatus());
        bulb2.turnOn();
        System.out.println("Bulb 2 is now " + bulb2.getStatus());
    }
}
