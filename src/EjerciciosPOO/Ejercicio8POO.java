package EjerciciosPOO;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Ejercicio8POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        System.out.println("Dime una frase");
        cadena = sc.nextLine();

        StringBuilder frase = new StringBuilder(cadena);

        for (int i = 0; i < frase.length();i++){
            if(Character.isSpaceChar(frase.charAt(i))){
                frase.insert(i+1," ");
                i++;

            }

        }

        System.out.println(frase);
    }
}
