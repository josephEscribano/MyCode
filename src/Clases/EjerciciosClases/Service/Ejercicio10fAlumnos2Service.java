package Clases.EjerciciosClases.Service;

import Clases.EjerciciosClases.Clases.Ejercicio10fAlumnos2;

public class Ejercicio10fAlumnos2Service {

    public static double NotaMedia(Ejercicio10fAlumnos2 Alumno){
        double suma = 0;
        double media = 0;

        for (int i = 0; i < Alumno.getCalificaciones().length; i++){
            suma = suma + Alumno.getCalificaciones()[i];

        }
        media = suma / Alumno.getAsignaturas();

        return media;
    }

    public static void PasaDeCurso(Ejercicio10fAlumnos2 Alumno){
        int HorasTotal = 0;
        for (int i  = 0; i < Alumno.getHoras().length;i ++){
            HorasTotal = HorasTotal + Alumno.getHoras()[i];
        }

        double Horas30 = HorasTotal * 0.30;
        int SumaHoras = 0;
        int contadorAsignaturas = 0;
        for (int i = 0; i < Alumno.getCalificaciones().length; i++){
            if (Alumno.getCalificaciones()[i] <= 5){
                contadorAsignaturas++;
                SumaHoras = SumaHoras + Alumno.getHoras()[i];
            }
        }

        if (contadorAsignaturas >= 1){
            if (SumaHoras >= Horas30){
                System.out.println("No pasa de curso ya que las horas suspensas son de  " + SumaHoras);
            }
        }else{
            System.out.println("Tiene todas las asignaturas aprobadas asi que pasa de curso");
        }
    }

}
