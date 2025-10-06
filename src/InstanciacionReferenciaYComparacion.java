import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Crear objetos con new
        // ================================
        // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
        // 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
        // por ejemplo: "Clocks", "Coldplay".
        // 3. Muestra por consola ambas canciones con System.out.println().
        // 4. Observa qué valores se imprimen en cada caso.
        // ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?

        // Tu código aquí 

            Cancion c1 = new Cancion();
            Cancion c2 = new Cancion("Clocks","Coldplay");

            System.out.println(c1 == c2);

        // ================================
        // EJERCICIO 2: Comparación con ==
        // ================================
        // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores
        // (ejemplo: "Clocks", "Coldplay").
        // 2. Imprime el resultado de (c3 == c4).
        // 3. Piensa: ¿por qué da false aunque los datos sean iguales?

        // Tu código aquí ↓

            //Cancion c3 = new Cancion("Tengo la camisa negra","Juanes");
            //Cancion c4 = new Cancion("Tengo la camisa negra","Juanes");

            //System.out.println(c3 == c4);
            //Respuesta: Sale false debido a que al usar "new" se crea dos objetos diferentes.

        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
        // imprime el resultado de (c3.equals(c4)).
        // 2. ¿Qué diferencia hay con el resultado de (c3 == c4)?
        // 3. Explica por qué ahora sí devuelve true (pista: en Cancion equals está
        // sobrescrito).

        // Tu código aquí ↓

            Cancion c3 = new Cancion("Tengo la camisa negra","Juanes");
            Cancion c4 = new Cancion("Tengo la camisa negra","Juanes");
            
            System.out.println(c3 == c4); // false porque no son el mismo objeto
            System.out.println(c3.equals(c4)); 
            // RESPUESTA: Aquí se estás sobreescribiendo el contenido de c3 en c4 lo 
            // que hace que dé true al tener el mismo contenido de los objetos
           

        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año
        // (ejemplo: "Inception", 2010).
        // 2. Imprime ambas películas por consola.
        // 3. Imprime (p1 == p2).
        // 4. Imprime (p1.equals(p2)).
        // 5. Pregunta: ¿por qué en Pelicula equals no funciona como en Cancion?

        // Tu código aquí ↓

            Pelicula p1 = new Pelicula("Transformers", 2007);
            Pelicula p2 = new Pelicula("Transformers", 2007);

            System.out.println(p1 == p2);
            System.out.println(p1.equals(p2));

        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
        // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que
        // c5.
        // 3. Imprime (c5 == c6).
        // 4. Imprime (c5.equals(c6)).
        // 5. Cambia el título de la canción desde c6.
        // 6. Imprime c5 de nuevo. ¿Qué ha ocurrido?
        // (Pista: c5 y c6 apuntan al mismo objeto en memoria).

        // Tu código aquí ↓

            Cancion c5 = new Cancion("Thriller","Michael Jackson's");
            Cancion c6 = new Cancion("Thriller", "Michael Jackson's");

            System.out.println(c5 == c6);
            System.out.println(c5.equals(c6));
            c6.setTitutlo("Tren al Sur");
            System.out.println(c5);
            //RESPUESTA: Al correr java el programa imprime el título de la canción c5
            



        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3, por ejemplo p3.get.
        // (Comenta esa línea después de probar, porque lanzará un error).
        // 4. ¿Qué error aparece en la consola?
        // 5. Explica: ¿qué significa realmente que una variable valga null?

        // Tu código aquí ↓

            Pelicula p3 = null;
            System.out.println(p3);
            p3.getTitulo();

        
        // ================================
        // RESPUESTAS DE REFLEXIÓN
        // ================================
        // Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
        // Respuesta: El constructor por defecto no lee ningún dato o parámetro dentro del objeto pero el parametrizado lee los datos específicos que se agregan en el objeto

        // Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
        // Respuesta: Porque estos comparan las referencias de los objetos, pero no el contenido interno.

        // Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
        // Respuesta:
        // No hay diferencia entre == y equals() ya que ambos comparan referencias por defecto.
        //Que por defecto el == y equals() compara referencias de objetos, es decir, si apuntan al mismo lugar en memoria. Pero si se sobreescribe el método equals(),este puede comparar los contenidos de los objetos.

        // Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
        // Respuesta: Porque en película el equals está por defecto que solo lee las referencias de los objetos, pero en canción fue sobreescrito el método equals de modo que puede
                    // leer el contenido también

        // Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
        // Respuesta: Que al modificar el contenido del objeto c6, este cambia el contenido original y se reemplaza por la nueva.

        // Ejercicio 6: 
        //¿Qué error aparece al acceder a un método de p3 siendo null?
        /* Exception in thread "main" java.lang.NullPointerException: Cannot invoke "utilidades.Pelicula.getTitulo()" because "p3" is null */
        /* at I nstanciacionReferenciaYComparacion.main(InstanciacionReferenciaYComparacion.java:119) */    

        // ¿Qué significa realmente que una variable valga null?
        // Respuesta: La variable null no apunta a ningún objeto.

    }
}




