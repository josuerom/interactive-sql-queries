/**
   ░░█ █▀█ █▀ █░█ █▀▀ █▀█ █▀█ █▀▄▀█
   █▄█ █▄█ ▄█ █▄█ ██▄ █▀▄ █▄█ █░▀░█
   created: 15/05/24 16:08:01
**/
public class Main {
   public static void main(String[] args) {
      ConsultarBD con = new ConsultarBD("3306", "prueba", "", "");
      con.enviarConsulta();
   }
}
