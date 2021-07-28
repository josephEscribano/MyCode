package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioD2Persona;

public class MainD2Persona {
    public static void main(String[] args){

        EjercicioD2Persona persona1 = new EjercicioD2Persona("02284342h","Joseph", "Escribano Barid",25 );
        EjercicioD2Persona persona2 = new EjercicioD2Persona("50691122y","Jose", "Escribano",25 );


        persona1.setDni("00000h");
        persona2.setNombre("pablo");
        persona2.setDni("01010101g");
        persona2.setEdad(68);

        persona1.Imprime();
        persona2.Imprime();

        if(persona1.esMenor()){
            System.out.println(persona1 + " es menor de edad");
        }else{
            System.out.println(persona1 + " es mayor de edad");
        }

        if(persona2.esJubilado()){
            System.out.println(persona2 + " es jubilado");
        }else{
            System.out.println(persona1 + " no es jubilado");
        }


        System.out.println("La diferencia de edad entre " + persona1 + " y " + persona2 + " es de " + persona1.DiferenciaEdad(persona2));


    }
}
