package Clases.EjerciciosClases.Clases;

public class CuentaBancaria {
    private final String IBAN;
    private final String Nombre;
    private int Saldo;
    private int Movimientos;

    //constructores

    public CuentaBancaria(String IBAN, String Nombre){
        this.IBAN = IBAN;
        this.Nombre = Nombre;
        this.Saldo = 0;
        this.Movimientos = 0;
    }

    //getter


    public String getIBAN() {
        return IBAN;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getSaldo() {
        return Saldo;
    }

    public int getMovimientos() {
        return Movimientos;
    }

    //setter


    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public void setMovimientos(int movimientos) {
        Movimientos = movimientos;
    }

    //to String


    @Override
    public String toString() {
        return "IBAN: " + IBAN + " - " + " Titular: " + Nombre + " - " + " Saldo: " + Saldo;
    }
}
