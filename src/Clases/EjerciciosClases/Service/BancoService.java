package Clases.EjerciciosClases.Service;

import Clases.EjerciciosClases.Clases.CuentaBancaria;
import Clases.EjerciciosClases.Utils.UtilsBanco;
import Clases.EjerciciosClases.mains.BancoQuevedo;
import jdk.jshell.execution.Util;

import java.util.Scanner;

public class BancoService {

    public static void Menu(){
        System.out.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.");
        System.out.println("2. IBAN. Mostrará el IBAN.");
        System.out.println("3. Titular. Mostrará el titular.");
        System.out.println("4. Saldo. Mostrará el saldo disponible.");
        System.out.println("5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.");
        System.out.println("6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.");
        System.out.println("7. Movimientos. Mostrará una lista con el historial de movimientos.");
        System.out.println("8. Salir. Termina el programa.");
    }

    public static void Ingresar(CuentaBancaria cuenta, int Cantidad){
        if (Cantidad >= 0){
            cuenta.setSaldo(cuenta.getSaldo() + Cantidad);
            System.out.println(UtilsBanco.Confirmacion_Ingreso);
            cuenta.setMovimientos(cuenta.getMovimientos() + 1);
            if (Cantidad >= 3000){
                System.err.println(UtilsBanco.Movimiento_Alto);
            }
        }else{
            System.out.println(UtilsBanco.Error_Ingreso);
        }



    }

    public static void Retirar(CuentaBancaria cuenta, int Cantidad){
        if (cuenta.getSaldo() - Cantidad < -50){
            System.err.println(UtilsBanco.Retirada_Alta);
        }else{
            cuenta.setSaldo(cuenta.getSaldo() - Cantidad);
            System.out.println(UtilsBanco.Confirmacion_Retirada);
            cuenta.setMovimientos(cuenta.getMovimientos() + 1);
            if (cuenta.getSaldo() < 0){
                System.err.println(UtilsBanco.Saldo_Negativo);
            }
        }




    }




}
