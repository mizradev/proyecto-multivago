
package agenciaturistica;

public abstract class Transport extends OperadorTuristico {

    public Transport(String code, String name, String packages, String date, float price) {
        super(code, name, packages, date, price);
    }
    
    public Transport(String packages, String date, float price) {
        super(packages, date, price);
    }

    public Transport() {
    }
    //Constructor
    
    // method abstract
    public abstract void  SOY();
    
}
