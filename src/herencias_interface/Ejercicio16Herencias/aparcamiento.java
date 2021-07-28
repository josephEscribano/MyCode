package herencias_interface.Ejercicio16Herencias;

import java.util.Scanner;

public class aparcamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        service servicios = new service();
        int opcion = 0;
        servicios.cargaDatos();
        do {
            servicios.Menu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    servicios.mostrarVehículos();
                    break;
                case 2:
                    servicios.AparcamientoCompleto();
                    break;
                case 3:
                    servicios.SacarVehículo();
                    break;
                case 4:
                    servicios.IntroducirVehículo();
                    break;
                case 5:
                    servicios.SalirAplicacion();
                    break;

            }
        }while (opcion != 5);
    }
}
