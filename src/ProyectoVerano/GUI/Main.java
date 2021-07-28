package ProyectoVerano.GUI;

import ProyectoVerano.DAO.MODELOS.Personas;
import ProyectoVerano.DAO.MODELOS.Revisiones;
import ProyectoVerano.DAO.MODELOS.RevisionesRealizadas;
import ProyectoVerano.DAO.MODELOS.coches;
import ProyectoVerano.SERVICE.ISERVICE;
import ProyectoVerano.SERVICE.Servicios;
import herencias_interface.EstructuraProyecto.Servicios.Iservice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ISERVICE servicios = new Servicios();

        Menu(sc,servicios);

    }

    public static void Menu(Scanner sc, ISERVICE servicios){
        int opcion = 0;

        do {

            System.out.println("Selecciona una opcion" + '\n'+
                    "1- Cargar datos" + '\n' +
                    "2- Ordenar Directivos" + '\n' +
                    "3- Mostrar Coches" + '\n' +
                    "4- Mostrar Revisiones" + '\n' +
                    "5- Añadir una revision a un coche" + '\n' +
                    "6- Pasar Revision y pagarla" + '\n' +
                    "0- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                case 1:
                    CargaInicial(servicios);
                    break;
                case 2:
                    OrdenarDirectivos(servicios);
                    break;
                case 3:
                    MostrarCoches(servicios);
                    break;
                case 4:
                    MostrarRevisiones(servicios);
                    break;
                case 5:
                    AñadirRevision(sc,servicios);
                    break;

            }
        }while (opcion != 0);
    }

    public static void CargaInicial (ISERVICE servicios){
        if (servicios.CargaInicial()){
            System.out.println("La carga inicial se ha realizado correctamente");
        }else{
            System.out.println("La carga no se ha podido realizar");
        }

    }

    public static void OrdenarDirectivos(ISERVICE servicios){
        ArrayList<Personas> personas = servicios.ordenarDirectivos();

        System.out.println(personas.toString());
    }

    public static void MostrarCoches(ISERVICE servicios){
        List<coches> coches = servicios.mostrarCoches();

        System.out.println(coches.toString());
    }

    public static void MostrarRevisiones(ISERVICE servicios){
        System.out.println(servicios.MostrarRevisiones().toString());
    }
    public static coches ObtenerCochePorMatricula(Scanner sc,ISERVICE servicios){
        System.out.println("Dime la matricula del coche al que quieres hacerle la revision: ");
        sc.nextLine();
        String matricula = sc.nextLine();

        coches coche = servicios.ObtenerCochePorMatricula(matricula);
        return coche;
    }

    public static void AñadirRevision (Scanner sc, ISERVICE servicios){

        coches coche  = ObtenerCochePorMatricula(sc,servicios);

        if (coche != null){
            System.out.println(servicios.MostrarRevisiones());
            System.out.println("Selecciona una revision para añadir a las revisiones del coche");
            int opcion = sc.nextInt();
            Revisiones revision = servicios.ObtenerRevision(opcion);
            if (servicios.AñadirRevision(coche,revision)){
                System.out.println("Se ha añadido la revision correctamente");
            }else{
                System.out.println("Ha ocurrido un error");
            }
        }else{
            System.out.println("El coche no es valido");
        }
    }


}
