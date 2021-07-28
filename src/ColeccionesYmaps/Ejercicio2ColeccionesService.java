package ColeccionesYmaps;

import java.util.ArrayList;

public class Ejercicio2ColeccionesService {

    public static void numeroElementos(ArrayList numeros){
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i));
        }
    }

    public static int Sumanumeros(ArrayList<Integer> numeros){
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++){
            suma = suma + numeros.get(i);
        }

        return suma;
    }

    public static double media(ArrayList<Integer> numeros){
        double media = 0;

        for (int i = 0; i < numeros.size(); i++){
            media = Sumanumeros(numeros) / numeros.size();
        }

        return media;
    }




}
