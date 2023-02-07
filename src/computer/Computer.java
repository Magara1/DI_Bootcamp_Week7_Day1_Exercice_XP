package computer;

public class Computer {

   
    private String marque;
    String modele;
    private int stockage;

   

    public Computer(String marque, String modele, int stockage) {
        this.marque = marque;
        this.modele = modele;
        this.stockage = stockage;
    }

   
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getStockage() {
        return stockage;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }

  
    public void afficher(String marque, String modele, int stockage) {
        System.out.println("Marque: " + marque);
        System.out.println("Modele: " + modele);
        System.out.println("Stockage: " + stockage);
    }

    void displaySpecs() {
        System.out.println("succes");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
