package ColeccionesYmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio12Service {
    HashMap<String, Ejercicio12Alumnos> Alumnos = new HashMap<>();


    Ejercicio12Alumnos alumno1 = new Ejercicio12Alumnos("02284341g", "Joseph", 25,Boolean.FALSE);
    Ejercicio12Alumnos alumno2 = new Ejercicio12Alumnos("50691132h", "Alberto", 26,Boolean.TRUE);
    Ejercicio12Alumnos alumno3 = new Ejercicio12Alumnos("02222222y", "Sebas", 25,Boolean.FALSE);
    Ejercicio12Alumnos alumno4 = new Ejercicio12Alumnos("33333333j", "Dani", 25,Boolean.TRUE);
    Ejercicio12Alumnos alumno5 = new Ejercicio12Alumnos("44444444k", "Javi", 25,Boolean.FALSE);

    public void AñadirAlumnos(){
        Alumnos.put(alumno1.getDNI(), alumno1);
        Alumnos.put(alumno2.getDNI(), alumno2);
        Alumnos.put(alumno3.getDNI(), alumno3);
        Alumnos.put(alumno4.getDNI(), alumno4);
        Alumnos.put(alumno5.getDNI(), alumno5);
    }
    public void BuscarAlumno(){
        Scanner sc = new Scanner(System.in);
        String dni;
        boolean encontrado = false;
        String aux = "";

        System.out.println("Dime el DNI de la persona que quieras buscar: ");
        dni = sc.nextLine();
        System.out.println("----Alumno-----");
        for(String clave: Alumnos.keySet()){
            if (dni.equals(clave)){
                encontrado = true;
                aux = clave;
                break;
            }
        }

        if (encontrado){
            System.out.println(Alumnos.get(aux).toString());
        }else{
            System.out.println("El alumno no existe");
        }
    }

    public void MostrarAlumnos(){

        System.out.println("----Todos los alumnos---");
        for (String clave: Alumnos.keySet()){
            System.out.println(Alumnos.get(clave).toString());
        }
    }

    public void MostrarNoRepetidores(){

        System.out.println("----Alumnos no repetidores---");
        for(String clave: Alumnos.keySet()){
            if (!Alumnos.get(clave).isRepite()){
                System.out.println(Alumnos.get(clave));
            }
        }
    }
}
