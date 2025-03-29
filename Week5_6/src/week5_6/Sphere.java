package week5_6;

public class Sphere {
    private double diameter;

    // Constructor 
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter method
    public double getDiameter() {
        return diameter;
    }

    // Setter method 
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    
    public double getVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        double radius = diameter / 2.0;
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere [Diameter: " + diameter + 
               ", Volume: " + getVolume() + 
               ", Surface Area: " + getSurfaceArea() + "]";
    }
}
