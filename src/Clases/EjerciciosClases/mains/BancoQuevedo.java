package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.CuentaBancaria;
import Clases.EjerciciosClases.Service.BancoService;
import Clases.EjerciciosClases.Utils.UtilsBanco;

import javax.print.DocFlavor;
import java.util.Scanner;

public class BancoQuevedo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BancoService service = new BancoService();

        int opcion = 0;
        String IBAN = "";
        String Nombre = "";
        int Cantidad = 0;
        int contador = 0;

        System.out.println(UtilsBanco.Introducir_IBAN);
        IBAN = sc.nextLine();

        System.out.println(UtilsBanco.Introducir_Titular);
        Nombre = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(IBAN,Nombre);
        int [] efectivos = new int[3];
        do {
            service.Menu();
            System.out.println("Elije una opción: ");
            opcion = sc.nextInt();
            if (opcion == 1){
                System.out.println(cuenta.toString());
            }else if(opcion == 2){
                System.out.println("IBAN: " + cuenta.getIBAN());
            }else if(opcion == 3){
                System.out.println("Titular: " + cuenta.getNombre());
            }else if (opcion == 4){
                System.out.println("Saldo: " + cuenta.getSaldo());
            }else if (opcion == 5){
                System.out.println("Dime la cantidad a ingresar: ");
                Cantidad = sc.nextInt();
                service.Ingresar(cuenta,Cantidad);
                efectivos[contador] = Cantidad;
                contador++;
            }else if(opcion == 6){
                System.out.println("Dime la cantidad a retirar: ");
                Cantidad = sc.nextInt();
                service.Retirar(cuenta, Cantidad);
                efectivos[contador] = Cantidad;
                contador++;
            }else if (opcion == 7){
                System.out.println("Movimientos: " + cuenta.getMovimientos());
                for (int i = 0; i < efectivos.length; i++){
                    System.out.println("#" + i + ": " + efectivos[i]);
                }
            }else if(opcion == 8){
                System.out.println(UtilsBanco.Gracias);
            }else{
                System.out.println(UtilsBanco.Opcion_Incorrecta);
            }

        }while(opcion != 8);

    }
}
