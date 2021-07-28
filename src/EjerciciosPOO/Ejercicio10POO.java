package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio10POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letra = "";
        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();
        int contador = 0;
        System.out.println("Introduce el caracter a buscar: ");
        letra = sc.nextLine();
        char letra2 = letra.charAt(0);
        for(int i = 0;i < frase.length();i++){
            if(frase.charAt(i) == letra2){
                contador++;
            }
        }

        System.out.println("La letra " + letra + " aparece " + contador + " veces.");
    }
}
