package Clases.EjerciciosClases.mains;


import Clases.EjerciciosClases.Clases.EjercicioA4Articulos;

public class MainEjercicioA4Aticulos {
    public static void main (String[] args){

        EjercicioA4Articulos vestido = new EjercicioA4Articulos("vestido", 12.50, 10);
        EjercicioA4Articulos pijama = new EjercicioA4Articulos("pijama", 5.90,20);

        System.out.println(vestido);
        System.out.println(pijama);

        System.out.println("En almacen quedan " + vestido.getCantidad() + " vestidos");

        System.out.println("Precio cambiado");
        vestido.setPrecio(10.50);
        pijama.setPrecio(5);

        System.out.println(vestido);
        System.out.println(pijama);


    }
}
