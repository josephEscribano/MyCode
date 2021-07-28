package herencias_interface.EstructuraProyecto.gui;

import herencias_interface.EstructuraProyecto.DAO.Modelos.*;
import herencias_interface.EstructuraProyecto.DAO.cochesDAO;
import herencias_interface.EstructuraProyecto.Servicios.Iservice;
import herencias_interface.EstructuraProyecto.Servicios.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iservice servicios = new service();

        int opcion = 0;
        carggaInicial(servicios);
        do {
            servicios.Menu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    MostrarDirectivosOrdenados(servicios);
                    break;
                case 2:
                    MostrarCoches(servicios);
                    break;
                case 3:
                    MostrarRevisiones(servicios);
                    break;
                case 4:
                    AñadirRevisiones(sc,servicios);
                    break;
                case 5:
                    PasarRevision(sc,servicios);
                    break;
                case 6:
                    CalcularMediaSalarios(servicios);
                    break;
                case 7:
                    MostrarTaller(servicios,sc);
                    break;
                case 8:
                    despedida();
                    break;


            }

        }while(opcion != 8);
    }
    private static void carggaInicial(Iservice servicios){

        coches coche1 = new coches("1234jkl",2000);
        coches coche2 = new coches("1235jhg",0);

        servicios.AñadirCoche(coche1);
        servicios.AñadirCoche(coche2);

        personas persona1 = new directivos("02284341g","Joseph",4000,10);
        personas persona2 = new directivos("50672452h","Julie",4001,10);
        personas persona3 = new empleadosTienda("12345678l","John",2000,tareas.GestionCoches);

        servicios.AñadirPersonas(persona1);
        servicios.AñadirPersonas(persona2);
        servicios.AñadirPersonas(persona3);

        revisiones revision1 = new revisiones("revision1","norauto",2);
        revisiones revision2 = new revisiones("revision2","talleres pepe",1);

        servicios.AñadirRevisiones(revision1);
        servicios.AñadirRevisiones(revision2);


    }
    private static void MostrarDirectivosOrdenados(Iservice servicios){
        ArrayList<personas> Adirectivos = servicios.MostrarDirectivosOrdenados();

        for (int i = 0; i < Adirectivos.size(); i++){
            Adirectivos.get(i).MostrarPeronas();
        }

    }

    private static void MostrarCoches(Iservice servicios){

        ArrayList<coches> Acoches = servicios.MostrarCoches();

        for(int i = 0; i < Acoches.size();i++){
            Acoches.get(i).MostrarCoches();
        }
    }

    private static void MostrarRevisiones(Iservice servicios){
        ArrayList<revisiones> Arevisiones = servicios.MostrarRevisiones();

        for (int i = 0; i < Arevisiones.size(); i++){
            Arevisiones.get(i).mostrarRevisiones();
        }
    }

    private static void AñadirRevisiones(Scanner sc, Iservice servicios){
        System.out.println("Dime la matricula del coche al que le quieres hacer la revision");
        String matricula = sc.nextLine();
        coches coche1 = servicios.ObtenerCochePorMatricula(matricula);
        if ( coche1 != null){
            MostrarRevisiones(servicios);
            System.out.println("Dime el nombre de la revision que quieres");
            String nombre = sc.nextLine();

            revisiones revision = servicios.ObtenerRevisiones(nombre);

            if (revision.getCochesHaciendoRevision() <= revision.getMaxCoches()){
                if (coche1.getDineroReviciones() > 0){
                    if (coche1.getRevisionesrealizadas().contains(revision)){
                        System.out.println("Esta revision ya ha sido realizada");
                    }else{
                        revision.setCochesHaciendoRevision(revision.getCochesHaciendoRevision() + 1);
                        revisionesRealizadas revRealizadas = new revisionesRealizadas(revision);
                        coche1.getRevisionesrealizadas().add(revRealizadas);
                        System.out.println("La revision ha sido añadida al coche");

                    }
                }else{
                    System.out.println("No dispone de dinero para las revisiones");
                }
            }else{
                System.out.println("Actualmente esta el maximo de coches para esta revisión");
            }

        }else{
            System.out.println("El coche obtenido no es valido");
        }

    }

    private static void PasarRevision(Scanner sc, Iservice servicios){
        System.out.println("Dime la matricula del coche del que quieres saber las revisiones realizadas");
        String matricula = sc.nextLine();
        coches coche1 = servicios.ObtenerCochePorMatricula(matricula);

        ArrayList<revisionesRealizadas> revRealizadas = servicios.ObtenerRevRealizadas(coche1);

        for (int i = 0; i < revRealizadas.size(); i++){
            revRealizadas.get(i).MostrarRevisionesRealizadas();
        }

        System.out.println("Dime la revision a la que quieres poner el dinero");
        String nombre = sc.nextLine();

        revisiones revision = servicios.ObtenerRevisiones(nombre);

        for (int i = 0; i < revRealizadas.size(); i++){
            if (revRealizadas.get(i).getRevision().getNombreRevision().equals(revision.getNombreRevision())){
                revRealizadas.get(i).setPrecio(100);
                coche1.setDineroReviciones(coche1.getDineroReviciones() - revRealizadas.get(i).getPrecio());
                System.out.println("La revision ha sido pasada y cobrada, se ha descontado el precio de la revision");
                coche1.MostrarCoches();
            }
        }
    }

    private static void CalcularMediaSalarios(Iservice servicios){
        System.out.println(servicios.MediaSalarios());
    }

    private static void MostrarTaller(Iservice servicios, Scanner sc){
        System.out.println("Dime el nombre del taller");
        String nombre = sc.nextLine();

        revisiones revision = servicios.ObtenerRevTaller(nombre);

        ArrayList<coches> cochesTaller = servicios.ObtenerCoche(revision);

        for (int i = 0 ; i < cochesTaller.size(); i++){
            cochesTaller.get(i).MostrarCoches();
        }
    }

    private static void despedida(){
        System.out.println("Gracias por usar nuestra aplucacion");
    }
}
