package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio5f;

import java.util.Scanner;

public class Main5f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        Ejercicio5f cuenta1 = new Ejercicio5f();
        Ejercicio5f cuenta2 = new Ejercicio5f();
        Ejercicio5f cuenta3 = new Ejercicio5f();
        do {
            if (contador == 0) {
                cuenta1.setNumeroCuenta(1);
                System.out.println("Introduce el dinero con el que quieres abrir la primera cuenta");
                cuenta1.setDinero(sc.nextInt());

            } else if (contador == 1) {
                cuenta2.setNumeroCuenta(2);
                System.out.println("Introduce el dinero con el que quieres abrir la segunda cuenta");
                cuenta2.setDinero(sc.nextInt());

            } else if (contador == 2) {
                cuenta3.setNumeroCuenta(3);
                System.out.println("Introduce el dinero con el que quieres abrir la tercera cuenta");
                cuenta3.setDinero(sc.nextInt());
            }
            contador++;
        } while (contador <= 2);

        cuenta1.Ingresar();

        cuenta2.RetirarDinero();

        cuenta1.Imprimir();
        cuenta2.Imprimir();
        cuenta3.Imprimir();
    }
}
