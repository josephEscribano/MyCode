package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio4f;

public class Main4f {
    public static void main(String[] args) {
        Ejercicio4f coche1 = new Ejercicio4f();
        Ejercicio4f coche2 = new Ejercicio4f("Audi", "azul",1111,4);

        coche1.setMarca("BMW");
        coche1.setColor("gris");
        coche1.setMatricula(2222);
        coche1.setNumeroPuertas(2);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());

        coche2.setColor("rojo");

        coche2.toString();
    }



}
