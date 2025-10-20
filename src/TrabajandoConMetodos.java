import utilidades.Cancion;
import utilidades.DemoMetodos;

public class TrabajandoConMetodos {
    public static void main(String[] args) {
        DemoMetodos method = new DemoMetodos();

        // ================================
        // EJERCICIO 1: Métodos void
        // ================================
        // 1. Llama al método saludar() de la clase DemoMetodos.
        // Tu código aquí ↓

            method.saludar();
        
        // ================================
        // EJERCICIO 2: Métodos con retorno
        // ================================
        // 1. Llama al método sumar(5, 3).
        // 2. Guarda el resultado en una variable e imprímelo.
        // 3. Llama al método presentar("Lucía") e imprime el resultado.
        // Tu código aquí ↓
    
            /* 1.- */ int resultado = method.sumar(5, 3);
            /* 2.- */ System.out.println("El resultado es: " + resultado);
            /* 3.- */ String saludo = method.presentar("Lucía");
            /* 4.- */ System.out.println(saludo);
    

        // ================================
        // EJERCICIO 3: Paso por valor (primitivos)
        // ================================
        // 1. Declara una variable int n = 10.
        // 2. Llama a method.incrementar(n).
        // 3. Imprime n después de llamar al método.
        // Tu código aquí ↓

            int n = 10;
            method.incrementar(n);
            System.out.println(n);



        // ================================
        // EJERCICIO 4: Paso por referencia (objetos)
        // ================================
        // 1. Crea un objeto Cancion con título "Original" - Usa el constructor parametrizado
        //  que recibe 2 argumentos: título y artista.
        // 2. Llama a method.cambiarTitulo(cancion).
        // 3. Imprime la canción después.
        // Tu código aquí ↓

            Cancion c = new Cancion("Original","Pepito");
            method.cambiarTitulo(c);
            System.out.println("La canción nueva es: " + c);

    }


}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué ocurre al llamar a un método void como saludar()?
// Respuesta: Al llamar el método void, este se ejecuta pero no devuelve ningún dato.

// Ejercicio 2: ¿Qué diferencia hay entre un método void y uno con retorno?
// Respuesta: Que el método void no devuelve ningún valor, mientras que uno con retorno
//            devuelve el valor del tipo de dato usado al declarar variables.

// Ejercicio 3: ¿Ha cambiado la variable n fuera del método incrementar()?
// ¿Por qué?
// Respuesta: No, la variable no cambia porque es un tipo primitivo y este solo recibe la copia del valor,
//            pero no se puede modificar la variable original. Es por eso que dentro del método incrementar() de la clase "DemoMetodos"
//            se incrementa e imprime 6, pero el valor original que está fuera del método de la clase "TrabajandoConMetodos"
//            sigue siendo 5.


// EXPLICACION PERSONAL:
//ya que el método incrementar() dentro de la clase DemoMetodo copia el valor y se modifica imprimiendo 6,
// pero no cambia el valor original que está fuera del método de la clase TrabajandoConMetodo (valor original es 5)                   

// Ejercicio 4: ¿Qué ha ocurrido con el título de la Cancion al usar cambiarTitulo()?
// ¿Por qué es diferente al caso del int?
// Respuesta: Que al usar el método "cambiarTitulo" en el objeto canción, este recibe
//            una referencia al objeto, lo que permite modificar directamente sus atributos.
//            Es por eso que cambia de título "Original" a "Canción modificada"

// Respuesta: Es diferente al caso del int ya que este son datos simples y al pasar a un método, 
//            este realiza una copia del valor y trabaja con ella, mas no con la variable original.