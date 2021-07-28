package herencias_interface.Ejercicio5Herencias;

public class cuenteAhorro extends CuentaBancaria{

    private final int saldoMinimo = 100;

    //constructor

    public cuenteAhorro(int iban, double saldo) {
        super(iban, saldo);

    }


    //metodos

    @Override
    public String toString() {
        return "Cuenta Ahorro: " + "IBAN: " + getIban() + " Saldo: " + getSaldo();
    }
    @Override
    public void calcularInteres() {
        if (getSaldo() < saldoMinimo){
            setSaldo(getSaldo() * getInteresAnualBasico() / 2);
        }else{
            setSaldo(getSaldo() * getInteresAnualBasico() * 2);
        }
    }

    @Override
    public void mostrarcuenta() {
        System.out.println("Cuenta Ahorro: " + "IBAN: " + getIban() + " Saldo: " + getSaldo());
    }
}
