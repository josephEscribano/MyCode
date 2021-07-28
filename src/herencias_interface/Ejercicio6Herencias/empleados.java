package herencias_interface.Ejercicio6Herencias;

import java.util.ArrayList;

public class empleados {
    private final String nombre;
    private final String DNI;
    private double sueldo;
    private int edad;
    private int telefono;
    private String direccion;


    //constructor


    public empleados() {
        this.nombre = "prueba";
        this.DNI = "012345";
    }

    public empleados(String nombre, String DNI, int sueldo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
    }

    public empleados(String nombre, String DNI, double sueldo, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //getter and setter


    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos


    @Override
    public String toString() {
        return "empleados{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void mostrarEmpleado(int opcion){
        if (opcion == 3){
            System.out.println("nombre --> " + nombre + '\n' +
                    "DNI --> " + DNI + '\n' +
                    "Sueldo --> " + sueldo + '\n' +
                    "Edad --> " + edad + '\n' +
                    "Telefono --> " + telefono + '\n' +
                    "Dirección --> " + direccion );
        }else if (opcion == 4){
            System.out.println("nombre --> " + nombre + '\n' +
                    "DNI --> " + DNI + '\n' +
                    "Sueldo --> " + sueldo +
                    "Edad --> " + '\n' +
                    "Telefono --> " + '\n' +
                    "Dirección --> " );
        }else{
            System.out.println("La opcion es incorrecta");
        }
    }

    public double CalcularSueldo(){
        double sueldoneto = 0;
        double sueldoAnual = sueldo * 12;
        if (sueldoAnual < 12000){
            sueldoneto = sueldo *  0.20;
        }else if (sueldoAnual > 12000){
            sueldoneto = sueldo * 0.30;
        }else if (sueldoAnual > 25000){
            sueldoneto = sueldo * 0.40;
        }

        return sueldoneto;

    }
}
