package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5Colecciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Persona> Listapersonas = new ArrayList<>();
        String nombre;
        int edad;
        for (int i = 0; i < 5;i++){
            System.out.println("Dime el nombre de la persona");
            nombre = sc.nextLine();
            System.out.println("Dime la edad de la persona");
            edad = sc.nextInt();

            sc.nextLine();

            Listapersonas.add(new Persona(nombre,edad));
        }

        Ejercicio2ColeccionesService.numeroElementos(Listapersonas);

        System.out.println();

        //Ordenar de mayor a menor

        Ejercicio5ComparatorPersona comparador = new Ejercicio5ComparatorPersona();
        Collections.sort(Listapersonas,comparador);

        Ejercicio2ColeccionesService.numeroElementos(Listapersonas);

        System.out.println();
        // Ordenanar de menor a mayor

        Collections.sort(Listapersonas);
        Collections.reverse(Listapersonas);
        Ejercicio2ColeccionesService.numeroElementos(Listapersonas);


    }
}
