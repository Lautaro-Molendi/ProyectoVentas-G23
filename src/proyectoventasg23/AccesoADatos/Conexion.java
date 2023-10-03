package proyectoventasg23.AccesoADatos;

import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "sistemadeventas";
    private static final String USUARIO = "root";
    private static final String  PASSWORD = "";
    private static Connection connection;
    
    private Conexion (){}
    public static Connection getConexion (){
        if (connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                JOptionPane optionPane = new JOptionPane("Conectado");
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "Mensaje");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);

                
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"error al cargar los driver");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"error al conectarse a la BD");
            }
            
        } 
        return connection;
    }
}
