package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioD3Rectangulo;

public class MainEjercicioD3Rectangulo {
    public static void main(String[] args){

        EjercicioD3Rectangulo rectangulo = new EjercicioD3Rectangulo(12,24,3,9);
        EjercicioD3Rectangulo rectangulo2 = new EjercicioD3Rectangulo(10,20,30,40);

        rectangulo.Imprimeir();
        rectangulo2.Imprimeir();

        System.out.println("valores cambiados");

        rectangulo.setX1(3);
        rectangulo.Imprimeir();
        rectangulo.setAll(3,2,3,4);
        rectangulo2.setX1Y1(50,400);

        rectangulo.Imprimeir();
        rectangulo2.Imprimeir();

        System.out.println("El area del rectangulo 1 es de " + rectangulo.getarea() + " y el perimetro es " + rectangulo.getperimetro());
        System.out.println("El area del rectangulo 2 es de " + rectangulo2.getarea() + " y el perimetro es de " + rectangulo2.getperimetro());


    }
}
