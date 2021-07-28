package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio9f;
import Clases.EjerciciosClases.Service.Ejercicio9fService;
import Clases.EjerciciosClases.Utils.UtilsConstantes9f;

import java.util.Scanner;

public class EjercicioMain9f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio9fService services = new Ejercicio9fService();

        Ejercicio9f aparato1 = new Ejercicio9f(3000, false,"Batidora");
        Ejercicio9f aparato2 = new Ejercicio9f(2000, true,"microondas");
        Ejercicio9f aparato3 = new Ejercicio9f(1000,false,"Aire Acondicionado");

        System.out.println("La potencia total del sistema es de " + UtilsConstantes9f.Potencia_Maxima);

        services.EncenderAparato(aparato1);
        services.EncenderAparato(aparato2);
        services.EncenderAparato(aparato3);
    }

}
