
package agenciaturistica;

public class Maritimo extends Transport {
    private String naviera, tipoCabina;
    
    // Construct

    public Maritimo(String naviera, String tipoCabina, String code, String name, String packages, String date, float price) {
        super(code, name, packages, date, price);
        this.naviera = naviera;
        this.tipoCabina = tipoCabina;
    }

    public Maritimo(String naviera, String tipoCabina, String packages, String date, float price) {
        super(packages, date, price);
        this.naviera = naviera;
        this.tipoCabina = tipoCabina;
    }

    public Maritimo(String naviera, String tipoCabina) {
        this.naviera = naviera;
        this.tipoCabina = tipoCabina;
    }
    
    // Methods SET

    public void setNaviera(String naviera) {
        this.naviera = naviera;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }
    
    // Methods GET

    public String getNaviera() {
        return naviera;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }
    
    // Method PRINT
    public void Imprimir(){
        System.out.printf("%5d\t%5d",getNaviera(),getTipoCabina());
    }
    
    // method abstract
    
    public void SOY(){
        //TENEMOS DUDA
    }
    
    
    
    
}
