package week5_6;

public class MultiSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Sphere objects
        Sphere sphere1 = new Sphere(10);
        Sphere sphere2 = new Sphere(20);

        // Displaying details
        System.out.println("Initial Spheres:");
        System.out.println(sphere1);
        System.out.println(sphere2);

        // Updating diameter
        sphere1.setDiameter(20);
        
        // Display updated details
        System.out.println("\nAfter Updating Diameter of Sphere1:");
        System.out.println(sphere1);
    }

	}

