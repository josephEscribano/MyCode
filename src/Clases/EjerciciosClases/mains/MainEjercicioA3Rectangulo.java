package Clases.EjerciciosClases.mains;


import Clases.EjerciciosClases.Clases.EjercicioA3Rectangulo;

public class MainEjercicioA3Rectangulo {
    public static void main(String[] args){

        EjercicioA3Rectangulo rectangulo1 = new EjercicioA3Rectangulo(0,0,5,5);
        EjercicioA3Rectangulo rectangulo2 = new EjercicioA3Rectangulo(7,9,2,3);

        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println("El perimetro del rectangulo 1 es " + rectangulo1.perimetro() + " y el area es " + rectangulo1.area());
        System.out.println("El perimetro del rectangulo 2 es " + rectangulo2.perimetro() + " y el area es " + rectangulo2.area());

        rectangulo1.setX1(2);
        rectangulo1.setY1(7);
        rectangulo1.setX2(10);
        rectangulo1.setY2(9);

        rectangulo2.setX1(3);
        rectangulo2.setY1(5);
        rectangulo2.setX2(30);
        rectangulo2.setY2(17);

        System.out.println("Después de modificar los datos ");
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println("El perimetro del rectangulo 1 es " + rectangulo1.perimetro() + " y el area es " + rectangulo1.area());
        System.out.println("El perimetro del rectangulo 2 es " + rectangulo2.perimetro() + " y el area es " + rectangulo2.area());

    }
}
