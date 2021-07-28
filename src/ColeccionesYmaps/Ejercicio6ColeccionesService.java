package ColeccionesYmaps;

import java.util.Scanner;

public class Ejercicio6ColeccionesService {

    public static void AñadirDatos(Contactos datosContacto){
        Scanner sc = new Scanner(System.in);
        String Nombre;
        String Apellido;
        int Telefono;
        System.out.println("Dime el nombre: ");
        Nombre = sc.nextLine();
        System.out.println("Dime el apellido");
        Apellido = sc.nextLine();
        System.out.println("Dime el numero de telefono: ");
        Telefono = sc.nextInt();
        datosContacto.setNombre(Nombre);
        datosContacto.setApellidos(Apellido);
        datosContacto.setTelefono(Telefono);
    }
}
