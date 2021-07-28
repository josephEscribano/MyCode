package herencias_interface.Ejercicio5Herencias;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class CuentaBancaria {


    private int iban;
    private double saldo;
    private final double interesAnualBasico = 2.5;

    //constructor

    public CuentaBancaria(int iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    // getter and setter

    public double getInteresAnualBasico() {
        return interesAnualBasico;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos



    public abstract void calcularInteres();
    public abstract void mostrarcuenta();
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "iban=" + iban +
                ", saldo=" + saldo +
                '}';
    }


}
