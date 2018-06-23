
package agenciaturistica;
import agenciaturistica.Agencia;


public class Aereo extends Transport {
    private String aerolinea;
    private String [] typeTicket;

    // Constructs
    public Aereo(String aerolinea, String[] typeTicket, String code, String name, String packages, String date, float price) {
        super(code, name, packages, date, price);
        this.aerolinea = aerolinea;
        this.typeTicket = typeTicket;
    }

    public Aereo(String aerolinea, String[] typeTicket, String packages, String date, float price) {
        super(packages, date, price);
        this.aerolinea = aerolinea;
        this.typeTicket = typeTicket;
    }

    public Aereo(String aerolinea, String[] typeTicket) {
        this.aerolinea = aerolinea;
        this.typeTicket = typeTicket;
    }
    
    // Methods SET

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setTypeTicket(String[] typeTicket) {
        this.typeTicket = typeTicket;
    }
    
    // Methods GET

    public String getAerolinea() {
        return aerolinea;
    }

    public String[] getTypeTicket() {
        return typeTicket;
    }
    // Method Print
    public void Imprimir(){
        System.out.printf("%5d\t%5d",getAerolinea(),getTypeTicket());
    }
    
    public void SOY(){
        System.out.println("SOY UN OPERADOR TURISTICO LLAMADO "+this.getName());
    }
    
    
    
    
    
}
