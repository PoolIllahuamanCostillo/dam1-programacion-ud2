import utilidades.Pago;

public class Pagador {
    public static void main(String[] args) {
        // Elige si trabajas con Pago o con Mensajero
        // Aquí un ejemplo con Pago:
        

        Pago pago = new Pago(2000);

        // ================================
        // EJERCICIO 1: Pagar en efectivo
        // ================================
        // 1. Llama al método pagar(double) pasando una cantidad.
        // 2. Observa qué se imprime.
        // Tu código aquí ↓

        pago.pagar(2000);


        // ================================
        // EJERCICIO 2: Pagar con tarjeta
        // ================================
        // 1. Llama al método pagar(double, String) pasando cantidad y un pin.
        // 2. Imprime el resultado.
        // Tu código aquí ↓

        pago.pagar(2000, "xd");
        
        // ================================
        // EJERCICIO 3: Pagar con Bizum
        // ================================
        // 1. Llama al método pagar(double, int) pasando cantidad y un número de teléfono.
        // 2. Imprime el resultado.
        // Tu código aquí ↓

        pago.pagar(2000, 5770507);
        


    }

}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Pregunta 1: ¿Qué información mínima (parámetros) se necesita para realizar un pago?
// Respuesta: Se necesita el parámetro de la cantidad a pagar del tipo de dato "double".

// Pregunta 2: ¿En qué se diferencia el pago con tarjeta respecto al pago en efectivo?
// Respuesta: El pago en efectivo se requiere solo la cantidad mientras que el pago con tarjeta se requiere la cantidad más el PIN.

// Pregunta 3: ¿Por qué es útil que todos se llamen "pagar"?
// Respuesta: Porque todos realizan la misma acción lógica y usar el mismo nombre hace que la API sea más coherente. 

// Pregunta 4: ¿Qué pasaría si en lugar de pagar() hubiera métodos llamados pagarEfectivo(), pagarTarjeta(), pagarBizum()?
// ¿Qué ventaja aporta la sobrecarga de métodos?
// Respuesta: El resultado sería el mismo, pero el código es más largo y menos legible al recordar diversos nombres distintos, 
//            a diferencia del uso del método con sobrecarga que lo hace más corto, claro y conciso.