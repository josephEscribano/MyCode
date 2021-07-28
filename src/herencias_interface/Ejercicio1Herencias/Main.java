package herencias_interface.Ejercicio1Herencias;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Apple","12345678f");
        Empresa empresa2 = new Empresa("Microsoft","123459876p");

        Departamentos departammento1 = new Departamentos("Informatica","Madrid",empresa1);
        Departamentos departammento2 = new Departamentos("Analisis","Madrid",empresa2);

        Empleados empleado1 = new Empleados("02284341g","Joseph",25,1400,"Programador",departammento1);
        Empleados empleado2 = new Empleados("1234567j", "Julie",26,1400,"Analista",departammento2);

        System.out.println("Datos de los empleados");
        System.out.println(empleado1);
        System.out.println(empleado2);

        System.out.println("Salario Neto del Empleado 1: " + empleado1.sueldoNeto(21.00));
    }
}
