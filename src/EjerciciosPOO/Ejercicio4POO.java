package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio4POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = "";

        System.out.println("Dime una frase: ");
        frase = sc.nextLine();

        fraseFuncion(frase);
    }
    static void fraseFuncion (String frase){
        String[] cadena = frase.split(" ");

        for (String aux: cadena){
            System.out.println(aux);
        }
    }
}
