package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioE4Articulo;

import java.util.Scanner;

public class MainEjercicioE4Articulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EjercicioE4Articulo Camiseta = new EjercicioE4Articulo("camiseta", 9.99, 300,10);
        EjercicioE4Articulo Pantalon = new EjercicioE4Articulo("pantalon", 19.99, 400, 4);

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
