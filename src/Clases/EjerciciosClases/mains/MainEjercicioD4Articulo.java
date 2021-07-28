package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioD4Articulo;

import java.util.Scanner;

public class MainEjercicioD4Articulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EjercicioD4Articulo Camiseta = new EjercicioD4Articulo("camiseta", 9.99, 300);
        EjercicioD4Articulo Pantalon = new EjercicioD4Articulo("pantalon", 19.99, 400);

        Camiseta.imprimir();
        Pantalon.imprimir();

        System.out.println();

        System.out.println("El precio con iva de la camiseta es de " + Camiseta.getPVP());
        System.out.println("El precio con iva del pantalon es de " + Pantalon.getPVP());

        System.out.println();
        System.out.println("¿Cuantas camisetas se han vendido?");
        int camisetasVendidas = sc.nextInt();

        if (Camiseta.vendido(camisetasVendidas)){
            System.out.println("Nos quedan en stock actualmente " + Camiseta.getCantidad() + " camisetas");

        }else{
            System.out.println("No es posible vender " + camisetasVendidas + " nos quedan " + Camiseta.getCantidad());
        }

        System.out.println("¿Cuantos pantalones quieres almacenar?");
        int cantidadAlmacenada = sc.nextInt();
        if (Pantalon.almacenar(cantidadAlmacenada)){
            System.out.println("En el almacen tenemos" + Pantalon.getAlmacen() + " pantalones");
        }else{
            System.out.println("No se pueden almacenar esa cantidad, tenemos " + Pantalon.getCantidad() + " pantalones");
        }
    }

}
