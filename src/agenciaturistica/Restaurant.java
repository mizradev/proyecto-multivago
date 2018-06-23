
package agenciaturistica;


public class Restaurant extends OperadorTuristico {
    private String categoria;

    // Construct
    public Restaurant(String categoria, String code, String name, String packages, String date, float price) {
        super(code, name, packages, date, price);
        this.categoria = categoria;
    }

    public Restaurant(String name, String categoria, String packages, String date, float price) {
        super(packages, date, price);
        this.categoria = categoria;
    }

    public Restaurant(String categoria) {
        this.categoria = categoria;
    }
    
    // Method SET

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    //Method GET

    public String getCategoria() {
        return categoria;
    }
    
    // Method PRINT
    
    public void Imprimir(){
        System.out.printf("%5d",getCategoria());
    }
    
    
    // Method Abstract
    
    public void SOY(){
    
    }
    
    
    
    
    
    
}
