package herencias.ejemplos.Ejemplo1;



import javax.swing.*;
import java.util.ArrayList;

public class EjemploHerencia {
    public static void main(String[] args) {
        //Probamos la clase Persona
        //llamamos al constructor
        Persona persona = new Persona("Juan", "12345678P",
                "C/ Quevedo", 666666666);
        System.out.println("Mostramos una persona");
        persona.mostrarPersona();

        //probamos la clase Alumno
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(7);
        notas.add(9);
        notas.add(6);

        Alumno alumno = new Alumno("Amanda", "87654321W",
                "C/ Francisco", 666111666, 1, "DAM", 1, notas);
        System.out.println("--------------------");
        System.out.println("Mostramos una alumna");
        alumno.mostrarPersona();

        Persona pAlumno = new Alumno("Amanda", "87654321W",
                "C/ Francisco", 666111666, 1, "DAM", 1, notas);
        //probamos la clase Profesor
        ArrayList<String> modulos = new ArrayList<>();
        modulos.add("Programación");
        modulos.add("Aplicaciones Web");
        modulos.add("TICO II");
        modulos.add("FCT");

        Persona profesor = new Profesor("Marina", "11111111W",
                "C/ Java", 777777777, 3,
                "Informática", modulos, "Mañana");
        System.out.println("--------------------");
        System.out.println("Mostramos una profesora");
        profesor.mostrarPersona();


        //PROBANDO EL POLIMORFISMO
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(alumno);
        personas.add(persona);
        personas.add(profesor);



        for (Persona pers: personas) {

            if (pers instanceof Alumno) {
                System.out.println("Es un alumno");
                ((Alumno) pers).calculoNotas();
            } else if (pers instanceof Profesor) {
                System.out.println("Es un profesor");
            } else {
                System.out.println("Es una persona");
            }
        }

    }
}
