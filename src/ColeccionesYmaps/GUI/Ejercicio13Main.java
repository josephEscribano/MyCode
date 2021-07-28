package ColeccionesYmaps.GUI;

import ColeccionesYmaps.MODELO.Ejercicio13Coche;
import ColeccionesYmaps.SERVICE.Ejercicio13Service;
import ColeccionesYmaps.UTILS.Ejercicio13Constantes;
import ColeccionesYmaps.UTILS.Ejercicio13Marcas;

import java.util.Scanner;

public class Ejercicio13Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio13Service scService = new Ejercicio13Service();
        int opcion;
        Ejercicio13Coche coche1 = new Ejercicio13Coche("rojo", Ejercicio13Marcas.AUDI, "A4","1234btm",4);
        Ejercicio13Coche coche2 = new Ejercicio13Coche("Azul", Ejercicio13Marcas.BMW, "320I","1435THQ",4);
        Ejercicio13Coche coche3 = new Ejercicio13Coche("Verde", Ejercicio13Marcas.OPEL, "ZAFIRA","4678THR",4);
        Ejercicio13Coche coche4 = new Ejercicio13Coche("Amarillo", Ejercicio13Marcas.MERCEDES, "C44","9045YJG",4);
        Ejercicio13Coche coche5 = new Ejercicio13Coche("Negro", Ejercicio13Marcas.RENAULT, "KANGOO","2043BTK",4);


        do {
            System.out.println("BIENVENIDO A LA APLCACION DE ALMACEN DE COCHES");
            System.out.println("    1- Buscar coche por Matrícula");
            System.out.println("    2- Eliminar coche");
            System.out.println("    3- Motrar coche por marca");
            System.out.println("    4- Mostrar todos los coches (ordenados por marca)");
            System.out.println("    5- Mostrar tosos los coches (ordenados por su matrícula)");
            System.out.println("    0-Salir");
            opcion = sc.nextInt();

            if (opcion == 1){
                for (int i = 0; i < 5; i++){
                    if (i == 0){
                        if (scService.AñadirCoche(coche1)){
                            System.out.println(Ejercicio13Constantes.Mensaje_Añadido);
                        }else{
                            System.out.println(Ejercicio13Constantes.Mensaje_Repetido);
                        }
                    }else if (i == 1){
                        if (scService.AñadirCoche(coche2)){
                            System.out.println(Ejercicio13Constantes.Mensaje_Añadido);
                        }else{
                            System.out.println(Ejercicio13Constantes.Mensaje_Repetido);
                        }
                    }else if (i == 2){
                        if (scService.AñadirCoche(coche3)){
                            System.out.println(Ejercicio13Constantes.Mensaje_Añadido);
                        }else{
                            System.out.println(Ejercicio13Constantes.Mensaje_Repetido);
                        }
                    }else if (i == 3){
                        if (scService.AñadirCoche(coche4)){
                            System.out.println(Ejercicio13Constantes.Mensaje_Añadido);
                        }else{
                            System.out.println(Ejercicio13Constantes.Mensaje_Repetido);
                        }
                    }else{
                        if (scService.AñadirCoche(coche5)){
                            System.out.println(Ejercicio13Constantes.Mensaje_Añadido);
                        }else{
                            System.out.println(Ejercicio13Constantes.Mensaje_Repetido);
                        }
                    }
                }
            }else if (opcion == 2){
                if (scService.EliminarCoche(coche2.getMatrícula())){
                    System.out.println(Ejercicio13Constantes.Mensaje_Eliminado);
                }else{
                    System.out.println(Ejercicio13Constantes.Mensaje_No_Encontrado);
                }
            }else  if (opcion == 3){
                scService.mostrarCochesMarca(Ejercicio13Marcas.OPEL);
            }else if (opcion == 4){
                System.out.println(Ejercicio13Constantes.Mensaje_Carga);
                scService.OrdenarCoches(opcion);
            }else if (opcion == 5){
                System.out.println(Ejercicio13Constantes.Mensaje_Carga);
                scService.OrdenarCoches(opcion);
            }else if (opcion == 0){
                System.out.println(Ejercicio13Constantes.Mensaje_Adios);
            }
        }while (opcion != 0);
    }
}
