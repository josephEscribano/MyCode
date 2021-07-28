package cifrasyletras;

import java.util.Scanner;
/*
EJEMPLOS NULL
 */
public class Ejemplo2Null {
    Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        String instanciaDeString = "Palabra o frase entre comillas dobles";
        String otroString = "palabra";
        String cad = new String("Otra cad"); //con el operador new y un constructor
        String noVacio = ""; //String vacío
        String vacio = null; //String null
        String nulo = null;
        String nulo2;

        //con el operador == comprueba si tienen la misma referencia
       if (vacio == nulo) {
            System.out.println("Son iguales"); //al ser dos null, no tienen referencia --> son iguales
        } else {
            System.out.println("Son distintos");
        }



        //cuidado con null aqui
        //invocamos un método, equals, sobre el objeto de nombre vacio, el cual
        //es null, que quiere decir, que no tiene ninguna referencia,
        // es decir, tiene referencia null
        //entonces como no existe referencia, no puede invocar un método
        //null es que no tiene ningún valor
        if (vacio.equals(cad)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }



        //si lo ponemos así no da error, por qué??
        //por que se invoca el método equals
        // desde el objeto cad, que sí tiene una referencia
        // //y lo compara con algo, en este caso con un objeto null.
        if (noVacio.equals(vacio)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        if (cad.equals("hola")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

    }

}
