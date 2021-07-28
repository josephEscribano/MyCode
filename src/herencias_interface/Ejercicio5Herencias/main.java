package herencias_interface.Ejercicio5Herencias;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        service service = new service();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1-añadir cuentas");
            System.out.println("2-Ingresar dinero");
            System.out.println("3-Retirar dinero");
            System.out.println("4-Traspasar dinero");
            System.out.println("5-Mostrar datos de una cuenta");
            System.out.println("6-calcular interes");
            System.out.println("0-salir");
            opcion = sc.nextInt();
            if (opcion == 1){
                service.añadirCuentas();
                System.out.println("Las cuentas han sido añadidas");
            }else if (opcion == 2){
                service.ingresarDinero();
            }else if (opcion == 3){
                service.retirarDinero();
            }else if (opcion == 4){
                service.traspaso();
            }else if (opcion == 5){
                service.mostrardatos();
            }else if (opcion == 6){
                service.calcularInteres();
            }else if(opcion > 6){
                System.out.println("opcion incorrecta");
            }else{
                System.out.println("GRACIAS POR USAR MI BANCA");
            }

        }while (opcion != 0);


    }
}
