
package agenciaturistica;

public class Hotel extends OperadorTuristico {
    private String hotelType, category;
    
    // Construct

    public Hotel(String tipoHotel, String categoria, String code, String name, String packages, String date, float price) {
        super(code, name, packages, date, price);
        this.hotelType = tipoHotel;
        this.category = categoria;
    }

    public Hotel(String tipoHotel, String categoria, String packages, String date, float price) {
        super(packages, date, price);
        this.hotelType = tipoHotel;
        this.category = categoria;
    }

    public Hotel(String tipoHotel, String categoria) {
        this.hotelType = tipoHotel;
        this.category = categoria;
    }
    
    
    // Methods SET

    public void setTipoHotel(String tipoHotel) {
        this.hotelType = tipoHotel;
    }

    public void setCategoria(String categoria) {
        this.category = categoria;
    }
    
    // Methods GET

    public String getTipoHotel() {
        return hotelType;
    }

    public String getCategoria() {
        return category;
    }
    
    // Method PRINT
    
    public void Imprimir(){
        System.out.printf("%5d\t%5d",getTipoHotel(),getCategoria());
    }
    
    public void SOY(){
        // TENEMOS DUDA
    }
    
    
}
