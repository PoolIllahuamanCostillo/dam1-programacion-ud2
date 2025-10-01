 /* **************************************************************************
   Objetivo: Que el programa pida 3 datos al usuario y muestre su información
 *****************************************************************************
 */

import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DataUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedirá tu nombre de usuario:
        System.out.print("Introduce tu usuario: " );
        String nombreUsuario = sc.nextLine();

        // Pedirá tu edad de usuario:
        System.out.print("Introduce tu edad: ");
        int edadUsuario = sc.nextInt();

        sc.nextLine(); // Esto sirve para evitar el conflicto entre nextInt y nextLine

        // Pedirá tu correo de usuario:
        System.out.print("Introduce tu correo de usuario: ");
        String correoUsuario = sc.nextLine();

        // Uso del método estático para comprobar si el correo es válido:
          boolean emailValido = ProcesadorTexto.esEmailValido(correoUsuario);
          

        // Uso de la condición if-else
          if (emailValido){

            Usuario usuario = new Usuario(nombreUsuario, edadUsuario, correoUsuario);
            usuario.mostrarInformacion(); // Este hace que dé el resultado total de los datos recogidos del Scanner
  
          } else{
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
          }

            sc.close();
            
          }

          

      
          
  
  
}
