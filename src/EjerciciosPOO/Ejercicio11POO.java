package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio11POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = "";

        System.out.println("Dime una frase");
        frase = sc.nextLine();

        StringBuilder frase2 = new StringBuilder(frase);

        if(frase2.reverse().equals(frase2)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }

    }
}
