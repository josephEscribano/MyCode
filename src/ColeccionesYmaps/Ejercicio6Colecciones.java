package ColeccionesYmaps;

import java.util.Scanner;

public class Ejercicio6Colecciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda scagenda = new Agenda();
        String Nombre;
        String Apellido;
        int Telefono;
        int posicion;
        int opcion = 0;
        do {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1- Añadir un contacto a la agenda.");
            System.out.println("2- Añadir un contacto en la posicion que tu quieras");
            System.out.println("3- Ver el contenido de la agenda");
            System.out.println("4- Buscar un contacto");
            System.out.println("5- Buscar por el telefono");
            System.out.println("6- Eliminar un contacto");
            opcion = sc.nextInt();

            if (opcion == 1){
                Contactos contacto1 = new Contactos();
                Ejercicio6ColeccionesService.AñadirDatos(contacto1);
                scagenda.nuevoContacto(contacto1);
            }else if (opcion == 2){
                Contactos contacto2 = new Contactos();
                Ejercicio6ColeccionesService.AñadirDatos(contacto2);
                System.out.println("Dime la posicion de la agenda donde quieres añadir el contacto ");
                posicion = sc.nextInt();
                scagenda.nuevoContacto(contacto2,posicion);
            }else if (opcion == 3){
                scagenda.MostrarAgenda();
            }else if (opcion == 4){
                sc.nextLine();
                System.out.println("Dime el nombre: ");
                Nombre = sc.nextLine();

                System.out.println("Dime el apellido");
                Apellido = sc.nextLine();
                System.out.println("El telefono es " + scagenda.BuscarTelefono(Nombre,Apellido));
            }else if (opcion == 5){
                System.out.println("Dime el telefono ");
                Telefono = sc.nextInt();
                System.out.println(scagenda.BuscarNombreApellido(Telefono).toString2()); ;
            }else if (opcion == 6){
                sc.nextLine();
                System.out.println("Dime el nombre: ");
                Nombre = sc.nextLine();

                System.out.println("Dime el apellido");
                Apellido = sc.nextLine();
                scagenda.EliminarContacto(Nombre,Apellido);
            }else {
                System.out.println("La opcion no es correcta");
            }
        }while (opcion != 0);
    }
}
