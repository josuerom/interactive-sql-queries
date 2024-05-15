import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsultarBD {
   private String url = "jdbc:mysql://localhost:";
   private String puerto;
   private String nombre;
   private String usuario;
   private String contraseña;
   private String consulta;
   private Scanner sc = new Scanner(System.in);
   
   public ConsultarBD(String puerto, String nombre, String usuario, String contraseña) {
      this.puerto = puerto;
      this.nombre = nombre;
      this.usuario = usuario;
      this.contraseña = contraseña;
      // jdbc:mysql://localhost:{puerto}/{nombre_base_de_datos}
      this.url += puerto + "/" + nombre;
   }

   public void enviarConsulta() {
      try {
         // Registrar el controlador JDBC de MySQL
         Class.forName("com.mysql.cj.jdbc.Driver");
         // Establecer la conexión con la base de datos
         Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
         System.out.println("Conexión exitosa a la base de datos: " + nombre);
         do {
            System.out.print("-- CONSULTA SQL >> ");
            consulta = sc.nextLine();
            // Para poder realizar consultas
            Statement statement = conexion.createStatement();
            // Para enviar la consulta y obtener el resultado
            ResultSet resultSet = statement.executeQuery(consulta);
            String resultado = null;
            // Iterar sobre el resultado para imprimirlo en la salida
            while (resultSet.next()) {
               resultado += resultSet.getString(1) + "\n";
            }
            System.out.println(resultado);
         } while(!consulta.equalsIgnoreCase("exit"));
         conexion.close();
      } catch (ClassNotFoundException e) {
         // Si el controlador JDBC no se encuentra instalado
         System.out.println("Error: Controlador JDBC no encontrado");
         e.printStackTrace();
      } catch (SQLException e) {
         // Si ocurre un error durante la conexión a la base de datos
         System.out.println("Error: No pude conectar a la base de datos");
         e.printStackTrace();
      }
   }
}