package agenciaturistica;

public class AgenciaTuristica {
    // Iniciar conexion mysql
    public static Conexion conn = new Conexion();

    public static void main(String[] args) {
        
        // inicializa el JFrame menu
        menu me = new menu();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
        
    }
    
}
