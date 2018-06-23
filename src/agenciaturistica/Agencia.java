
package agenciaturistica;

public abstract class Agencia {
    private String code;
    private String name;
    
    //Constructor full
    public Agencia(String code, String name) {
        this.code = code;
        this.name = name;
    }
    // Constructor vacio
    public Agencia(){
        this.code = "";
        this.name = "";
    }
    
    // Metodos SET
    public void setCode(String newCode){
        this.code = newCode;
    }
    public void setName(String newName){
        this.name = newName;
    }
    
    // Metodos GET
    public String getCode(){
        return this.code;
    }
    
    public String getName(){
        return this.name;
    }
    
    //imprimir
    public void Imprimir(){
        System.out.printf("%5d\t%5d",this.getCode(),this.getName());
    }
    
    public abstract void SOY();
    
    
    
}
