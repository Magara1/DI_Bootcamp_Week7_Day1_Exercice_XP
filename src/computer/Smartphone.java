package computer;

public class Smartphone extends Computer {

    
    private String operatingSystem;

    
    public Smartphone(String brand, int stockage,String modele) {
        super(brand, modele, stockage);
        this.operatingSystem = operatingSystem;
    }

    
    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Operating System: " + operatingSystem);
    }

    public void makeCall(String phoneNumber) {
        String brand = null;
        System.out.println("Calling " + phoneNumber + " using " + brand + " smartphone");
    }
}
