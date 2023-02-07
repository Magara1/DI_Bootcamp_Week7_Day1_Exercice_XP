package computer;

public class Laptop extends Computer {

    
    private int batteryLife;

    
    public Laptop(String brand, int stockage, int batteryLife, String modele) {
        super(brand, modele, stockage);
        this.batteryLife = batteryLife;
    }


   @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Battery life: " + batteryLife + " hours");
    }

    public void useTouchpad(String action) {
        System.out.println("Using touchpad to " + action);
    }
}