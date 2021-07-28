package herencias_interface.Ejercicio6Herencias;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        service service = new service();

        int opcion = 0;
        String nombre = "";
        empleados empleado1 = new empleados("Joseph", "02284314g", 4000,25,650190365,"Emilia Ballester");
        empleados empleado2 = new empleados("Julie","12345678h",3999);
        empresa empresa1 = new empresa("apple","123456789t", 912345678,"avenida meditarreneo");
        empresa empresa2 = new empresa("Microsoft", "1253648h",91456786,"plaza del sol");
        do {
            service.menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar nuestra aplicacion");
                    break;
                case 1:
                    service.añadirEmpleado(empleado1);
                    service.añadirEmpleado(empleado2);
                    System.out.println("Los empleados han sido añadidos");
                    break;
                case 2:
                    System.out.println("Dime el nombre del empleado que quieres eliminar: ");
                    nombre = sc.nextLine();
                    if (service.estaEmpleado(nombre)){
                        service.eliminarEmpleado(nombre);
                        System.out.println("El empleado ha sido eliminado");
                    }else{
                        System.out.println("El empleado no esta en la base de datos");
                    }
                    break;
                case 3:
                    service.mostrarEmpleados(opcion);
                    break;
                case 4:
                    service.mostrarEmpleados(opcion);
                    break;
                case 5:
                    System.out.println("El sueldo total bruto es: " + service.sumaSueldoBrutos());
                    break;
                case 6:
                    System.out.println("El sueldo total neto es: " + service.sumaSueldosNetos());
                    break;
                default:
                    break;
            }
        }while (opcion != 0);


    }
}
