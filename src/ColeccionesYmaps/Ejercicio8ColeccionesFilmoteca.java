package ColeccionesYmaps;

import java.util.Scanner;

public class Ejercicio8ColeccionesFilmoteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filmoteca scFilmoteca = new Filmoteca();
        int opcion = 0;

        do {
            System.out.println("Dime que opcion quieres elegir");
            System.out.println("1- Añadir una pelicula");
            System.out.println("2- Elminar peliculas por id");
            System.out.println("3- Eliminar peliculas");
            System.out.println("4- Consultar peliculas");
            System.out.println("5- Cantidad de peliculas");
            System.out.println("0- Salir");
            opcion = sc.nextInt();

            if (opcion == 1){
                scFilmoteca.AñadirPeliculas();
            }else if (opcion == 2){
                scFilmoteca.EliminarPeliculaid();
            }else if (opcion == 3){
                Peliculas pelicula1 = new Peliculas("Matrix",1999,"pepito");
                scFilmoteca.MostrarPeliculas();
                scFilmoteca.EliminarPelicula(pelicula1);
            }else if (opcion == 4){
                scFilmoteca.MostrarPeliculas();
            }else if (opcion == 5){
                scFilmoteca.CantidadPeliculas();
            }else if (opcion == 0){
                System.out.println("gracias por usar mi aplicacion");
            }else{
                System.out.println("La opcion elegida no es valida" );
            }
        }while (opcion != 0);

    }
}
