package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio9POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase que contenga la palabra tardes");
        String frase = sc.nextLine();

        StringBuilder palabra = new StringBuilder(frase);
        palabra.replace(palabra.indexOf("tardes"),palabra.indexOf("tardes")+6,"noches");

        System.out.println(palabra);

    }
}
