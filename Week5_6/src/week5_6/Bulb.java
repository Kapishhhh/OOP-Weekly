package week5_6;

public class Bulb {
    private boolean isOn;
    
    // Constructor 
    public Bulb() {
        isOn = false;
    }
    
    // Method to turn the bulb ON
    public void turnOn() {
        isOn = true;
    }
    
    // Method to turn the bulb OFF
    public void turnOff() {
        isOn = false;
    }
    
    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }
}