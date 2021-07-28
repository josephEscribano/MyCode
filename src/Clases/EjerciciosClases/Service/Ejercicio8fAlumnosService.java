package Clases.EjerciciosClases.Service;

import Clases.EjerciciosClases.Clases.Ejercicio8fAlumnos;

public class Ejercicio8fAlumnosService {

    public static double NotaMedia(Ejercicio8fAlumnos Alumno){
        double suma = 0;
        double media = 0;

        for (int i = 0; i < Alumno.getCalificaciones().length; i++){
            suma = suma + Alumno.getCalificaciones()[i];

        }
        media = suma / Alumno.getAsignaturas();

        return media;
    }
}
