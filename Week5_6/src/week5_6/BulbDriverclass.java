package week5_6;

public class BulbDriverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Creating Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Turning on Bulb1
        bulb1.turnOn();
        System.out.println("Bulb 1 is " + bulb1.getStatus());

        // Turning off and then on Bulb2
        bulb2.turnOff();
        System.out.println("Bulb 2 is " + bulb2.getStatus());
        bulb2.turnOn();
        System.out.println("Bulb 2 is now " + bulb2.getStatus());
    }

	}


