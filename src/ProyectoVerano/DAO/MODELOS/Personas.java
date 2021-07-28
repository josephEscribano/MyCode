package ProyectoVerano.DAO.MODELOS;

import java.util.Objects;

public class Personas {
    private String DNI;
    private String nombre;
    private double sueldo;


    //constructores

    public Personas(String DNI, String nombre, double sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }


    //getter and setter


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString


    @Override
    public String toString() {
        return "Personas " +
                "DNI = " + DNI + '\n'  +
                ", nombre= " + nombre + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return Objects.equals(DNI, personas.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }
}
