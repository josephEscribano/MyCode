package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioA1;

public class MainEjercicioA1 {
    public static void main(String[] args){

        EjercicioA1 punto1 = new EjercicioA1(5,0);
        EjercicioA1 punto2 = new EjercicioA1(10,10);
        EjercicioA1 punto3 = new EjercicioA1(-3,7);

        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);

        punto1.setX(8);
        punto1.setY(2);

        System.out.println("Los nuevos valores de punto1 son x= " + punto1.getX() + " y= " + punto1.getY());

    }
}
