package ColeccionesYmaps;

import java.util.*;

public class Ejercicio2Colecciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        int numero = 0;

        do{
            System.out.println("Introduce numeros: ");
            numero = sc.nextInt();
            numeros.add(numero);
            if (numero == 0){
                System.out.println("Gracias por usar el programa.");
            }else{
                if (numeros.isEmpty()){
                    System.out.println("No tiene elementos");
                }else{
                    System.out.println("La cantidad de elementos es de " + numeros.size());
                }

            }

        }while(numero != 0);

        // Misma linea
        Ejercicio2ColeccionesService.numeroElementos(numeros);
        // Salto de linea
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        // suma de los numeros
        System.out.println("La suma de todos los numeros es " + Ejercicio2ColeccionesService.Sumanumeros(numeros));

        // media

        System.out.println("La media de todos los numeros es " + Ejercicio2ColeccionesService.media(numeros));


        // ordenados de menor a mayor

        Collections.sort(numeros);
        Ejercicio2ColeccionesService.numeroElementos(numeros);

        //Encuentra el numero 10.

        for (int i = 0; i < numeros.size();i++){
            if (numeros.get(i) == 10){
                System.out.println("El 10 se encuentra en la posicion " + i);
            }
        }

        // Ordenados de mayor a menor;

        Comparator <Integer> comparator = Collections.reverseOrder();
        Collections.sort(numeros,comparator);
        Ejercicio2ColeccionesService.numeroElementos(numeros);

        // min y max

        System.out.println("El maximo es "+Collections.max(numeros));

        System.out.println("El minimo es "+Collections.min(numeros));


    }


}
