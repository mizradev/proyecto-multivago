
package agenciaturistica;

public class Tour extends OperadorTuristico {
    private String lugaresAVisitar;
    private Transport tipoTransporte;
    private Restaurant comida;
    private String itinerario;
    
    // Construct

    public Tour(String lugaresAVisitar, Transport tipoTransporte, Restaurant comida, String itinerario, String code, String name, String packages, String date, float price) {
        super(code, name, packages, date, price);
        this.lugaresAVisitar = lugaresAVisitar;
        this.tipoTransporte = tipoTransporte;
        this.comida = comida;
        this.itinerario = itinerario;
    }

    public Tour(String lugaresAVisitar, Transport tipoTransporte, Restaurant comida, String itinerario, String packages, String date, float price) {
        super(packages, date, price);
        this.lugaresAVisitar = lugaresAVisitar;
        this.tipoTransporte = tipoTransporte;
        this.comida = comida;
        this.itinerario = itinerario;
    }

    public Tour(String lugaresAVisitar, Transport tipoTransporte, Restaurant comida, String itinerario) {
        this.lugaresAVisitar = lugaresAVisitar;
        this.tipoTransporte = tipoTransporte;
        this.comida = comida;
        this.itinerario = itinerario;
    }
    
    // Method SET

    public void setLugaresAVisitar(String lugaresAVisitar) {
        this.lugaresAVisitar = lugaresAVisitar;
    }

    public void setTipoTransporte(Transport tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public void setComida(Restaurant comida) {
        this.comida = comida;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }
    
    // Method GET

    public String getLugaresAVisitar() {
        return lugaresAVisitar;
    }

    public Transport getTipoTransporte() {
        return tipoTransporte;
    }

    public Restaurant getComida() {
        return comida;
    }

    public String getItinerario() {
        return itinerario;
    }
    
    // Method PRINT
    
    public void Imprimir(){
        System.out.printf("%5d\t%5d\t%5d\t%5d\t",getLugaresAVisitar(),getTipoTransporte(),getComida(),getItinerario());
    }
    
    //Method abstract
    
    public void SOY(){
    
    }
    
    
}
