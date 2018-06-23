package agenciaturistica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection VCon;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            VCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/MultiVagos", "root", "");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa", ".: Éxito :.", 1);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            e.printStackTrace();
        }
    }

    public static void CerrarConexion() {
        try {
            VCon.close();
            JOptionPane.showMessageDialog(null, "Cierre Exitoso", ".:.Éxito.:.", 1);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Delete(String tabla, String Id) {
        try {
            String Query = "DELETE FROM " + tabla + " WHERE Identidad = \"" + Id + "\"";
            Statement st = VCon.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Borrado Exitoso", ".:.Éxito.:.", 1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado", ".:.Error.:.", 0);
        }
}

    public static void Select(String tabla) {
        try {
            String Query = "SELECT * FROM " + tabla;
            Statement st = VCon.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            if (tabla == "tv") {
                while (resultSet.next()) {
                    System.out.println("Codigo: " + resultSet.getString("codigo")
                            + "\nMarca: " + resultSet.getString("marca")
                            + "\nModelo: " + resultSet.getString("modelo")
                            + "\nScreen: " + resultSet.getString("screen")
                            + "\nRam: " + resultSet.getString("ram")
                            + "\nStorage: " + resultSet.getString("storage")
                            + "\nProcesador: " + resultSet.getString("procesador")
                            + "\nPrecio: " + resultSet.getString("precio")
                            + "\n\n");
                }
            } else {
                while (resultSet.next()) {
                    System.out.println("Codigo: " + resultSet.getString("codigo")
                            + "\nMarca: " + resultSet.getString("marca")
                            + "\nModelo: " + resultSet.getString("modelo")
                            + "\nScreen: " + resultSet.getString("screen")
                            + "\nRam: " + resultSet.getString("ram")
                            + "\nStorage: " + resultSet.getString("storage")
                            + "\nProcesador: " + resultSet.getString("procesador")
                            + "\nPrecio: " + resultSet.getString("precio")
                            + "\nSimcard: " + resultSet.getString("simcard")
                            + "\n\n");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la obtensión de datos", ".:.Error.:.", 0);
        }
    }

    public static void Insert(String tabla, int codigo, String marca, String modelo, String screen, String ram, String storage, String procesador, float precio, String simcard) {
        try {
            String Query = "INSERT INTO " + tabla + " VALUES("
                    + "\"" + codigo + "\", "
                    + "\"" + marca + "\", "
                    + "\"" + modelo + "\", "
                    + "\"" + screen + "\", "
                    + "\"" + ram + "\", "
                    + "\"" + storage + "\", "
                    + "\"" + procesador + "\", "
                    + "\"" + precio + "\", "
                    + "\"" + simcard + "\")";
            Statement st = VCon.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa", ".:.Éxito.:.", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos", ".:.Error.:.", 0);
        }
    }

    public static void InsertTV(int codigo, String marca, String modelo, String screen, String ram, String storage, String procesador, float precio) {
        try {
            String Query = "INSERT INTO tv VALUES("
                    + "\"" + codigo + "\", "
                    + "\"" + marca + "\", "
                    + "\"" + modelo + "\", "
                    + "\"" + screen + "\", "
                    + "\"" + ram + "\", "
                    + "\"" + storage + "\", "
                    + "\"" + procesador + "\", "
                    + "\"" + precio + "\")";
            Statement st = VCon.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa", ".:.Éxito.:.", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos", ".:.Error.:.", 0);
        }
    }

}
