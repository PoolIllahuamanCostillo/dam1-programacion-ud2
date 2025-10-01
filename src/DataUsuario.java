 /* **************************************************************************
   Objetivo: Que el programa pida 3 datos al usuario y muestre su información
 **************************************************************************
 */

import java.util.Scanner;

public class DataUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedirá tu nombre de usuario:
        String nombreUsuario = sc.nextLine();
        System.out.println("Introduce tu usuario: " + nombreUsuario );

        // Pedirá tu edad de usuario:
        int edadUsuario = sc.nextInt();
        System.out.println("Introduce tu edad: " + edadUsuario);

        // Pedirá tu correo de usuario:
        String correoUsuario = sc.nextLine();
        System.out.println("Introduce tu correo de usuario: " + correoUsuario);

        sc.close();
    }
}
