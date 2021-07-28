package cifrasyletras;

public class Ejemplo3SB {
    public static void main (String[] args) {


      //  ejemploStringBuilderAppendInsert();
        ejemploStringBuilder();

    }

    private static void ejemploStringBuilderAppendInsert() {
        StringBuilder nuevoSB = new StringBuilder("Hola Pepe");
        nuevoSB.append("!!!!!!!!!!!", 0, 3);
        System.out.println(nuevoSB);
        nuevoSB.insert(4, ", buenos días, ");
        System.out.println(nuevoSB);
        System.out.println(nuevoSB.reverse());
    }

    private static void ejemploStringBuilder() {
        StringBuilder nuevoSB = new StringBuilder("Hoal Muuundo");
        nuevoSB.delete(6,8);  //eliminamos las “uu” que sobran en la cadena,
        // indicamos la posicion de la primera y la siguiente a la última a borrar.
        nuevoSB.append ("!"); //añadimos al final el cierre de exclamación.
        nuevoSB.insert (0,"¡"); //añadimos en la posicion cero la apertura de exclamación.
        nuevoSB.replace(3, 5, "la"); //reemplazamos los caracteres situados en las posiciones 3 y 4 por “la”.
        System.out.println(nuevoSB);

        // ¿Cuál sería el resultado de la ejecución de las dos órdenes siguientes?
        nuevoSB.append(nuevoSB.charAt(0));
        nuevoSB.delete(0,1);
        System.out.println(nuevoSB);


    }

}
