package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio5POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();

        fraseFuncionTamanio(frase);
    }

    static void fraseFuncionTamanio (String frase){
        String[] cadena = frase.split(" ");

        for( String aux: cadena){
            if(aux.length() <= 4){
                System.out.println(aux.toLowerCase());
            }else{
                System.out.println(aux.toUpperCase());
            }
        }
    }
}
