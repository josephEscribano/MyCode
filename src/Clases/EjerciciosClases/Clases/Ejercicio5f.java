package Clases.EjerciciosClases.Clases;

import java.util.Scanner;

public class Ejercicio5f {
    private static String IDcuenta = "CB";
    private int numeroCuenta;
    private int dinero;

    //constructores

    public Ejercicio5f(){
    }

    public Ejercicio5f(int numeroCuenta,int dinero) {
        this.numeroCuenta = numeroCuenta;
        this.dinero = dinero;
    }

    //get

    public static String getIDcuenta() {
        return IDcuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDinero() {
        return dinero;
    }

    //set


    public static void setIDcuenta(String IDcuenta) {
        Ejercicio5f.IDcuenta = IDcuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    //metodos

    public void Imprimir(){
        System.out.println("El saldo de la cuenta " + IDcuenta + this.numeroCuenta + " es de " + this.dinero);
    }
    public void DineroRestante(){
        System.out.println("El dinero restante en la cuenta es " + this.getDinero());
    }

    public void Ingresar(){
        Scanner sc = new Scanner(System.in);
        int ingresar;
        System.out.println("¿Cuánto dinero quieres ingresar en la cuenta " + this.numeroCuenta + "?" );
        ingresar = sc.nextInt();

        this.dinero = this.dinero + ingresar;

        System.out.println("Tienes " + this.getDinero() + " en la cuenta " + IDcuenta + this.numeroCuenta);

    }

    public void RetirarDinero(){
        Scanner sc = new Scanner(System.in);
        int Retirar;
        System.out.println("¿Cuánto dinero quieres sacar de la cuenta " + this.numeroCuenta +"?");
        Retirar = sc.nextInt();

        if (Retirar > this.getDinero()){
            System.err.println("No tienes suficiente saldo para sacar esa cantidad");
        }else{
            this.dinero = this.dinero - Retirar;
        }
        System.out.println("Tienes " + this.getDinero() + " en la cuenta " + IDcuenta + this.numeroCuenta);
    }
}
