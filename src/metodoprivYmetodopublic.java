import utilidades.CuentaBancaria;

public class metodoprivYmetodopublic {
    public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓

            //System.out.println(cuenta.saldo);
        

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
            cuenta.depositar(100);
            cuenta.retirar(30);
            System.out.println(cuenta.getSaldo());


        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓

            //cuenta.registrarOperacion("Hackeo",9999); 
        

        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.

        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println(cuenta.getSaldo());

        //Private
            //System.out.println(saldo);
   
   
    }
}

}


// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: Es debido a que se usó un atributo privado en la clase de cuenta bancaria.

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: Porque los tres métodos están en públicos.

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: Es debido a que el método que se está llamando es privada.

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?

    //RESPUESTA: Es para evitar la exposición de datos sensibles dentro del programa.

// - ¿Qué pasaría si saldo fuera public?

    //RESPUESTA: Se podría llamar al método "cuenta.saldo" y se vería el saldo actual que se tiene registrado.

// - ¿Por qué registrarOperacion es private en lugar de public?

    //RESPUESTA: Porque es un método que solo se necesita usar dentro de la misma clase. 


