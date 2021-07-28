package EjemplosColecciones;

import java.lang.Comparable;
import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getDni(), persona.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
/*
    @Override
    public int compareTo(Persona p) {
        Integer edad = this.edad;
        return edad.compareTo(p.getEdad());
    }


 */
    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        Integer edad = this.edad;
        return edad.compareTo(o.getEdad());
    }
}
