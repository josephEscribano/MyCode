package Clases.EjerciciosClases.mains;


import Clases.EjerciciosClases.Clases.Ejercicio7fAparatoElectrico;
import Clases.EjerciciosClases.Service.Ejercicios7fAparatosElectricosServices;

import java.util.Scanner;

public class Ejercicio7fMainAparatosElectricos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios7fAparatosElectricosServices services = new Ejercicios7fAparatosElectricosServices();

        Ejercicio7fAparatoElectrico aparato1 = new Ejercicio7fAparatoElectrico(3000, false,"Batidora");
        Ejercicio7fAparatoElectrico aparato2 = new Ejercicio7fAparatoElectrico(300, true,"microondas");
        Ejercicio7fAparatoElectrico aparato3 = new Ejercicio7fAparatoElectrico(1000,false,"Aire Acondicionado");

        int opcion = 0;
        int sumaPotencias = 0;
        int aparato = 0;

        do{
            if (aparato1.isEstado() == true){
                sumaPotencias = aparato1.getPotencia();
            }if (aparato2.isEstado() == true){
                sumaPotencias += aparato2.getPotencia();
            }if (aparato3.isEstado() == true){
                sumaPotencias += aparato3.getPotencia();
            }
            System.out.println("Dime que quieres hacer: ");
            System.out.println("1- Saber la potencia total");
            System.out.println("2- Encender un aparato");
            System.out.println("3- Apagar un aparato");
            System.out.println("0- Salir de la aplicación");
            opcion = sc.nextInt();

            if (opcion == 1){
                Ejercicio7fAparatoElectrico.setPotenciaTotal(sumaPotencias);
                System.out.println("La potencia total del sistema es de " + Ejercicio7fAparatoElectrico.getPotenciaTotal());
            }else if(opcion == 2){
                System.out.println("Dime que aparato quieres encender");
                aparato = sc.nextInt();
                if (aparato == 1){
                    services.EncenderAparato(aparato1);
                }else if (aparato == 2){
                    services.EncenderAparato(aparato2);
                }else if (aparato == 3){
                    services.EncenderAparato(aparato3);
                }
            }else if (opcion == 3){
                System.out.println("Dime que aparato quieres apagar");
                aparato = sc.nextInt();
                if (aparato == 1){
                    services.ApagarAparato(aparato1);
                }else if (aparato == 2){
                    services.ApagarAparato(aparato2);
                }else if (aparato == 3){
                    services.ApagarAparato(aparato3);
                }
            }else if (opcion == 0){
                System.out.println("Gracias por usar mi aplicación");
            }

            sumaPotencias = 0;
        }while (opcion != 0);
    }

}
