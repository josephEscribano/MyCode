package herencias_interface.Ejercicio5Herencias;

import java.util.ArrayList;
import java.util.Scanner;

public class service {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    cuentaCorriente corriente1 = new cuentaCorriente(123456789,1000.0);
    cuenteAhorro ahorro1 = new cuenteAhorro(12345686,50);
    cuenteAhorro ahorro2 = new cuenteAhorro(149803483,2000);
    cuentaCorriente corriente2 = new cuentaCorriente(437894272,80);

    public void añadirCuentas(){
        cuentas.add(corriente1);
        cuentas.add(corriente2);
        cuentas.add(ahorro1);
        cuentas.add(ahorro2);
    }

    public void mostrardatos(){
        Scanner sc = new Scanner(System.in);
        int cuenta;

        System.out.println("Dime el numero de la cuenta de la que quieres saber la informacion");
        cuenta = sc.nextInt();

        cuentas.get(cuenta).mostrarcuenta();
    }

    public void calcularInteres(){
        Scanner sc = new Scanner(System.in);
        int cuenta;

        System.out.println("Dime el numero de la cuenta de la que quieres calcular el interes");
        cuenta = sc.nextInt();

        cuentas.get(cuenta).calcularInteres();
    }
    public void ingresarDinero(){
        Scanner sc = new Scanner(System.in);
        int cantidad;
        int cuenta;

        System.out.println("Dime el numero de la cuenta a la que quieres ingresar el dinero");
        cuenta = sc.nextInt();
        System.out.println("Dime la cantidad a ingresar: ");
        cantidad = sc.nextInt();

        cuentas.get(cuenta).setSaldo(cuentas.get(cuenta).getSaldo() + cantidad);
    }

    public void retirarDinero(){
        Scanner sc = new Scanner(System.in);
        int cantidad;
        int cuenta;

        System.out.println("Dime el numero de la cuenta a la que quieres retirar el dinero");
        cuenta = sc.nextInt();
        System.out.println("Dime la cantidad a retirar: ");
        cantidad = sc.nextInt();

        cuentas.get(cuenta).setSaldo(cuentas.get(cuenta).getSaldo() - cantidad);
    }

    public void traspaso(){
        Scanner sc = new Scanner(System.in);
        int cuenta1;
        int cuenta2;
        int cantidad;
        System.out.println("Dime el numero de la cuenta desde la que quieres pasar dinero: ");
        cuenta1 = sc.nextInt();
        System.out.println("Dime a que cuenta quieres pasar el dinero: ");
        cuenta2 = sc.nextInt();
        System.out.println("Dime la cantidad que quieres pasar: ");
        cantidad = sc.nextInt();

        cuentas.get(cuenta1).setSaldo(cuentas.get(cuenta1).getSaldo() - cantidad );

        cuentas.get(cuenta2).setSaldo(cuentas.get(cuenta2).getSaldo() + cantidad);
    }
}
