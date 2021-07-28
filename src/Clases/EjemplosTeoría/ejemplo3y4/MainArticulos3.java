package srcSegunda.src.Clases.EjemplosTeoría.ejemplo3y4;


import srcSegunda.src.Clases.EjemplosTeoría.ejemplo1.Articulo;

import java.util.Random;

public class MainArticulos3 {
    public static void main(String[] args) {
        Articulo[] misArticulos = new Articulo[10];
        for (int i = 0; i < misArticulos.length; i++) {
            //public Articulo(String codigoArticulo, String titulo, String formato, double precioAlquiler) {
            misArticulos[i] = new Articulo(""+i, "Articulo "+i, "DVD", Math.random()*10);
        }

        for (int i = 0; i < misArticulos.length; i++) {
            System.out.println("----- Código Artículo " + misArticulos[i].getCodigoArticulo());
            System.out.println("Alquiler 1 día " + misArticulos[i].calcularPrecio1());
            System.out.println("Alquiler 2 días  " + misArticulos[i].calcularPrecio2());
            System.out.println("Alquiler 1 semana  " + misArticulos[i].calcularPrecioSemana());
        }
    }
}
