package empleado;

import java.sql.*;


public class Conexion {
    private static Connection conexion;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String nombreBd = "ESCUELA";
    private static String usuario = "root";
    private static String password = "19082011";
    private static String url = "jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=true&use"
            + "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
            + "serverTimezone=UTC"
            + "&useSSL=false";
    
   
    
    public Conexion() throws SQLException {
      conexion = null;
        try {
        Class.forName(driver);
        conexion = DriverManager.getConnection(url,usuario,password);
        conexion.beginRequest();
        conexion.setAutoCommit(false);
         if(conexion!=null)
                System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurrio un error"+e.getMessage());
        }
        }
  public Connection getConnection(){
        
  return conexion;
        
  }
}


