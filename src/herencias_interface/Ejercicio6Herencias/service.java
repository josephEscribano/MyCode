package herencias_interface.Ejercicio6Herencias;

public class service {

    public void menu(){
        System.out.println("Selecciona una de las opciones: " + '\n' +
                            "1- Añadir empleados" + '\n' +
                            "2- Eliminar empleados " + '\n' +
                            "3- Mostrar información de todos los empleados " + '\n' +
                            "4- Mostrar solo DNI,sueldo bruto y sueldo neto " + '\n' +
                            "5- Calcular la suma del sueldo bruto de todos los empleados" + '\n' +
                            "6- Calcular la suma de los sueldos netos de los empleados " + '\n' +
                            "0- Salir");
    }
    public void añadirEmpleado(empleados empleado){
        empresa empresa = new empresa();
        empresa.añadirEmpleados(empleado);
    }
    public void eliminarEmpleado (String nombre){
        empresa empresa = new empresa();
        empresa.eliminarEmpleados(nombre);
    }
    public boolean estaEmpleado(String nombre){
        empresa empresa = new empresa();
        return empresa.estaEmpleado(nombre);
    }
    public void mostrarEmpleados(int opcion){
        empresa empresa = new empresa();
        empresa.mostrarTodos(opcion);
    }
    public double sumaSueldoBrutos(){
        empresa empresa = new empresa();
        return empresa.sumaSueldosBrutos();
    }
    public double sumaSueldosNetos(){
        empresa empresa = new empresa();
        return empresa.sumaSueldosNetos();
    }
}
