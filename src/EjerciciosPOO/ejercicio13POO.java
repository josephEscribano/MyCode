package EjerciciosPOO;

import java.util.Scanner;

public class ejercicio13POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una base ");
        double base = sc.nextDouble();

        System.out.println("Dame un exponente");
        int exponente = sc.nextInt();

        double resultado = Math.pow(base, exponente);

        System.out.println(resultado);
    }
}
