package EjemplosColecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploListCopia {

    public static void main(String[] args) {

       // ejemplo3Copia();
        ejemplo4Copia();
     //   ejemplo5CopiaCLone();


    }

    private static void ejemplo3Copia() {
        System.out.println("-----EJEMPLO COPIA-----");

        ArrayList<String> colores = new ArrayList <String>();
        // añadimos elementos al ArrayList
        colores.add("amarillo");
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");

        System.out.println("1 Contenido del ArrayList COLORES:");
        muestraColores(colores);
        //copiamos
        ArrayList<String> coloresCopia = colores;
        System.out.println("2 Contenido de LA COPIA ArrayList :");
        muestraColores(coloresCopia);

        //eliminamos de la copia el color rojo
        coloresCopia.remove("rojo");
        //se borra del original?
        System.out.println("3 Contenido del ArrayList COLORES tras eliminación de rojo de la copia:");
        muestraColores(colores);
    }

    private static void ejemplo4Copia() {
        System.out.println("-----EJEMPLO COPIA 2 -----");

        ArrayList<String> colores = new ArrayList <>();
        // añadimos elementos al ArrayList
        colores.add("amarillo");
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        System.out.println("-- 4 Contenido del ArrayList COLORES:");
        muestraColores(colores);
        //copiamos
        //1.- elemento a elemento
        ArrayList<String> coloresCopia1 = new ArrayList <>();
        for (String color : colores) {
            coloresCopia1.add(color);
        }
        // 2.- Con la siguiente declaración del ArrayList:
        ArrayList<String> coloresCopia2 = new ArrayList <>(colores);
        // 3.- Utilizando el método addAll tras crear un array vacío:
        ArrayList<String> coloresCopia3 = new ArrayList <>();
        coloresCopia3.addAll(colores);

        System.out.println("-- 5 Contenido de LA COPIA ArrayList :");
        muestraColores(coloresCopia1);
        //eliminamos de la copia el color rojo
        coloresCopia1.remove("rojo");
        //se borra del original?
        System.out.println("-- 6 Contenido del ArrayList COLORES tras eliminación de rojo de la copia:");
        muestraColores(colores);
        System.out.println("-- 7 Contenido del ArrayList COLORESCOPIA tras eliminación de rojo de la copia:");
        muestraColores(coloresCopia1);


    }



    private static void muestraColores (ArrayList array) {

        System.out.print("Contenido del ArrayList:");
        if (array.isEmpty()) {
            System.out.println("el ArrayList está vacío");
        } else {
            Iterator items = array.iterator();

            while (items.hasNext()) {
                System.out.print(items.next() + ", ");
            }
            System.out.println("\n");
        }
    }

    private static void ejemplo5CopiaCLone() {

        System.out.println("-----EJEMPLO COPIA CLONE-----");

        ArrayList<String> colores = new ArrayList <>();
        // añadimos elementos al ArrayList
        colores.add("amarillo");
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");

        System.out.println("1 Contenido del ArrayList COLORES:");
        muestraColores(colores);
        //copiamos
        ArrayList<String> coloresCopia = (ArrayList)colores.clone();
        System.out.println("2 Contenido de ArrayList la COPIA  :");
        muestraColores(coloresCopia);
        //eliminamos de la copia el color rojo
        coloresCopia.remove("rojo");
        //se borra del original?
        System.out.println("3 Contenido del ArrayList COLORES tras eliminación de rojo de la copia:");
        muestraColores(colores);
        System.out.println("4 Contenido del ArrayList COPIA tras eliminación de rojo de la copia:");
        muestraColores(coloresCopia);
    }
}
