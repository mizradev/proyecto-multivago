
package agenciaturistica;


public abstract class OperadorTuristico extends Agencia {
    private String packages, date;
    private float price;
    
    // Constructor

    public OperadorTuristico(String code, String name, String packages, String date, float price) {
        super(code, name);
        this.packages = packages;
        this.date = date;
        this.price = price;
    }

    public OperadorTuristico(String packages, String date, float price) {
        this.packages = packages;
        this.date = date;
        this.price = price;
    }
    
    public OperadorTuristico() {
        this.packages = "";
        this.date = "";
        this.price = 0;
    }
    
    // Methods SET

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    //Methods GET

    public String getPackages() {
        return packages;
    }

    public String getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }
    
    public void Imprimir(){
        System.out.printf("Packages | Date | Price");
        System.out.printf("%5d\t%5d\t%5d"+getPackages(),getDate(),getPrice());
    }
    
    
    
    
    
    
    
}
