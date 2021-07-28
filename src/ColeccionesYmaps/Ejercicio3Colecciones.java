package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3Colecciones {
    public static void main(String[] args) {

        ArrayList <String> alumnos = new ArrayList<>();

        //a
        int contador = 0;
        for(int i = 10; i > 0; i--){
            alumnos.add("alumnos" + contador);
            contador++;
        }
        for(int i= 0; i < alumnos.size(); i++){
            System.out.println(alumnos.get(i));
        }
        //b
        alumnos.add(2,"alumno3");

        // c
        Iterator iter = alumnos.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //d

        System.out.println("Hay " + alumnos.size() + "alumnos");

        //e

        alumnos.remove(0);

        for (int i = 0; i < alumnos.size();i++){
            System.out.print( alumnos.get(i) + " , ");
        }

        System.out.println();

        //f y g
        for (int i = 0; i < alumnos.size(); i++){
            if (alumnos.get(i).equals("alumno3")){
                alumnos.remove(i);
            }
        }

        for (int i = 0; i < alumnos.size();i++){
            System.out.print(alumnos.get(i) + " , ");
        }

        System.out.println();

        //h

        System.out.println("Hay " + alumnos.size() + " alumnos");

    }
}
