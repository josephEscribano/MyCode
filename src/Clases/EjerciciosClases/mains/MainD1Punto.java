package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioD1Punto;

public class MainD1Punto {
    public static void main(String[] args) {
        EjercicioD1Punto punto1 = new EjercicioD1Punto(7,10);
        EjercicioD1Punto punto2 = new EjercicioD1Punto(20, 30);

        System.out.println(punto1);
        System.out.println(punto2);

        System.out.println("Desplazamientos");

        punto1.desplaza(2,3);
        System.out.println(punto1);

        punto1.setXY(18,3);
        System.out.println("La distancia entre el punto 1 y el punto 2 es de: " + punto1.distancia(punto2));

    }
}
