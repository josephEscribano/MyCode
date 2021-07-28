package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio8fAlumnos;
import Clases.EjerciciosClases.Service.Ejercicio8fAlumnosService;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8fMainAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int cantidad = 0;
        int eleccion = 0;
        Ejercicio8fAlumnosService service = new Ejercicio8fAlumnosService();
        System.out.println("Dime cuantos alumnos vas a introducir");
        cantidad = sc.nextInt();
        Ejercicio8fAlumnos alumnos[] = new Ejercicio8fAlumnos[cantidad];

        // notas

        for (int i = 0; i < alumnos.length; i++){
            alumnos[i] = new Ejercicio8fAlumnos();
            System.out.println("Dime el NIA del alumnos");
            alumnos[i].setNIA(sc.nextInt());
            sc.nextLine();
            System.out.println("Dime el nombre del alumno");
            alumnos[i].setNombre(sc.nextLine());
            System.out.println("Dime los apellidos del alumno");
            alumnos[i].setApellidos(sc.nextLine());
            System.out.println("Dime el numero de asignaturas en el que esta matriculado");
            alumnos[i].setAsignaturas(sc.nextInt());
        }

        for(int i = 0; i < alumnos.length; i++){
            for (int j = 0; j < alumnos[i].getCalificaciones().length; j++){
                alumnos[i].getCalificaciones()[j] = rand.nextInt(10)+1;
            }
        }
        System.out.println("Dime el alumno del que quieres saber las notas y sus datos de 0 a " + cantidad);
        eleccion = sc.nextInt();
        for (int i = 0; i < alumnos[eleccion].getCalificaciones().length; i++){
            System.out.println("Asignatura " + i + " - " + "nota: " + alumnos[eleccion].getCalificaciones()[i] );
        }

        System.out.println(alumnos[eleccion].toString());
        System.out.println("Nota media: " + Ejercicio8fAlumnosService.NotaMedia(alumnos[eleccion]));



    }
}
