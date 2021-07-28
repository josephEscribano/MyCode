package ColeccionesYmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio12Main {
    public static void main(String[] args) {
        Ejercicio12Service scalumnos = new Ejercicio12Service();


        //Añadir Alumnos
        scalumnos.AñadirAlumnos();

        // Ejercicio A

        scalumnos.BuscarAlumno();

        //Ejercicio B

        scalumnos.MostrarAlumnos();

        //Ejercicio C

        scalumnos.MostrarNoRepetidores();






    }
}
