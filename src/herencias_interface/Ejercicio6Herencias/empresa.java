package herencias_interface.Ejercicio6Herencias;

import java.util.ArrayList;
import java.util.HashMap;

public class empresa {
    private final String nombre;
    private final String CIF;
    private int telefono;
    private String direccion;
    private static HashMap<String,empleados> empleados = new HashMap<>();

    //constructor

    public empresa(){
        this.nombre = "prueba";
        this.CIF = "12345f";
    }
    public empresa(String nombre, String CIF, int telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
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

    public HashMap<String, herencias_interface.Ejercicio6Herencias.empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<String, herencias_interface.Ejercicio6Herencias.empleados> empleados) {
        this.empleados = empleados;
    }

    //metodos

    public void añadirEmpleados(empleados empleado){
        empleados.put(empleado.getNombre(),empleado);
    }

    public void eliminarEmpleados (String nombre){
        empleados.remove(nombre);
    }

    public boolean estaEmpleado(String nombre){
        boolean aceptado = false;
        if (empleados.containsKey(nombre)){
            aceptado =  true;
        }else{
            aceptado = false;
        }
        return aceptado;
    }

    public void mostrarTodos(int opcion){
        for (String clave: empleados.keySet()){
            System.out.print("Empleado ---> " );
            empleados.get(clave).mostrarEmpleado(opcion);
        }
    }

    public double sumaSueldosBrutos(){
        double sueldosBrutosTotales = 0;
        for (String clave: empleados.keySet()){
            sueldosBrutosTotales = sueldosBrutosTotales + empleados.get(clave).getSueldo();
        }
        return sueldosBrutosTotales;
    }

    public double sumaSueldosNetos(){
        double sueldosNetosTotales = 0;
        for (String clave: empleados.keySet()){
            sueldosNetosTotales = sueldosNetosTotales + empleados.get(clave).CalcularSueldo();
        }
        return sueldosNetosTotales;
    }
    @Override
    public String toString() {
        return "empresa{" +
                "nombre='" + nombre + '\'' +
                ", CIF='" + CIF + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
