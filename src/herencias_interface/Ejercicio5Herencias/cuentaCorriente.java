package herencias_interface.Ejercicio5Herencias;

public class cuentaCorriente extends CuentaBancaria{


    // constructor

    public cuentaCorriente(int iban, double saldo) {
        super(iban, saldo);
    }


    //metodos


    @Override
    public String toString() {
        return "Cuenta Corriente: " + "IBAN: " + getIban() + " Saldo: " + getSaldo();
    }

    @Override
    public void calcularInteres() {
        setSaldo(getSaldo() * getInteresAnualBasico());
    }

    @Override
    public void mostrarcuenta() {
        System.out.println("Cuenta Corriente: " + "IBAN: " + getIban() + " Saldo: " + getSaldo());
    }
}
