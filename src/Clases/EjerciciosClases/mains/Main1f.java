package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio1F;

public class Main1f {
    public static void main(String[] args) {
        Ejercicio1F raton1 = new Ejercicio1F("Logitech RX250","OPTICO","USB",9.00);
        Ejercicio1F raton2 = new Ejercicio1F("Logitech RX260", "OPTICO","INALÁMBRICO",16.99);
        Ejercicio1F raton3 = new Ejercicio1F("MS-TECH SM-57","PS/2",19.90);
        Ejercicio1F raton4 = new Ejercicio1F("MS-tech sm-57","usb", 3.90);
        Ejercicio1F raton5 = new Ejercicio1F("Razer diamondback 3g", "optico","usb",44.00);
        Ejercicio1F raton6 = new Ejercicio1F("Speedlink Notebook Laser Mouse ", "opctico","inalámbrico",49.00);

        raton1.imprimir();
        raton2.imprimir();
        raton3.imprimir();
        raton4.imprimir();
        raton5.imprimir();
        raton6.imprimir();

    }
}
