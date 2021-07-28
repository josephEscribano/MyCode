package cifrasyletras;

import java.util.Scanner;

public class Ejemplo3Concat {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        String saludo = "hola ";
        System.out.println(saludo.concat(nombre));

    }

}
