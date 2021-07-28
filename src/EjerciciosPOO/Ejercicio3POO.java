package EjerciciosPOO;

import javax.print.DocFlavor;
import javax.swing.*;
import java.util.Scanner;
public class Ejercicio3POO {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu número de dni: ");
        int dni = sc.nextInt();

        System.out.println("La letra de tu dni es: " + obtenerLetraDni(dni));
        if(dni / 10000000 == 0){
            System.out.println("Tu dni completo es: " + "0" + obtenerNif(dni));
        }else{
            System.out.println("Tu dni completo es: " + obtenerNif(dni));
        }

    }
    static char obtenerLetraDni(int dni){
        int calculo = dni % 23;
        String opciones = "TRWAGMYFPDXBNJZSQVHLCKE";
        char NIF = opciones.charAt(calculo);

        return NIF;


    }

    static String obtenerNif(int dni){
        char NIF = obtenerLetraDni(dni);

        String dnicompleto = String.valueOf(dni).concat(Character.toString(NIF));

        return dnicompleto;

    }

}
