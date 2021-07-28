package ColeccionesYmaps;

import java.util.Scanner;

public class Ejercicio9ColeccionesCantantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CantanteServicios sccantante = new CantanteServicios();
        int opcion = 0;

        do {
            System.out.println("1- Introducir nuevo cantante o grupo");
            System.out.println("2- Borrar cantante o grupo");
            System.out.println("3- Mostrar disco más vendido de cada cantatne o grupo");
            System.out.println("4- Mostrar los discos de un cantante");
            System.out.println("0- Salir");
            opcion = sc.nextInt();
            if (opcion == 1){
                sccantante.AñadirCantante();
            }else if (opcion == 2){
                sccantante.EliminarCantante();
            }else if (opcion == 3){
                sccantante.DiscoMasVendido();
            }else if (opcion == 4){
                sccantante.MostrarDiscosYcantantes();
            }else if (opcion == 0){
                System.out.println("gracias por usar el programa");
            }else{
                System.out.println("La opcion elegida no es correcta");
            }
        }while (opcion != 0);
    }
}
