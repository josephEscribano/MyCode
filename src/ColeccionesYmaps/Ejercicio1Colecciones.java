package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1Colecciones {
    public static void main(String[] args) {
        ArrayList <String> colores = new ArrayList<>();

        MuestraColores(colores);
        colores.add("Amarillo");
        colores.add("verde");
        colores.add("rojo");
        colores.add("Azul");

        MuestraColores(colores);

        System.out.println("Primer elemento: " + colores.get(0));
        System.out.println("Ultimo elemento: " + colores.get(colores.size() - 1 ));

        EliminarElemento("lila",colores);

        MuestraColores(colores);


    }

    private static void MuestraColores(ArrayList<String> lista){

        System.out.print("Contenido de la lista: ");
        if (lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            for (int i = 0; i < lista.size(); i++){
                System.out.print(lista.get(i) + " , ");

            }
            System.out.println("\n");
        }


        /*
        if (lista.isEmpty()){
            System.out.println("Contenido del Arraylist --> La lista esta vacia");
        }else{
            Iterator iter = lista.iterator();

            while (iter.hasNext()){
                System.out.print(iter.next() + ",");
            }
            System.out.println("\n");
        }
        */



    }

    private static void EliminarElemento(String color, ArrayList<String> lista){
        int contador = 0;

        for (int i = 0; i < lista.size(); i++){

            if (lista.get(i).equals(color)){
                System.out.println("Voy a eliminar el color " + color + " que se encuentra en la posicion + i");
                lista.remove(i);
                System.out.println("La posicion en la que se encuentra es la " + i);
                contador++;
            }

            if (contador == 0 && i == lista.size() - 1){
                System.out.println("Voy a eliminar el color " + color);
                System.out.println("Color no encontrado");
            }
        }
    }
}
