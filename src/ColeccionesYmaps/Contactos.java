package ColeccionesYmaps;

import java.util.Objects;

public class Contactos implements Comparable<Contactos>{

    private String Nombre;
    private String Apellidos;
    private int Telefono;

    // constructor


    public Contactos() {
    }

    public Contactos(String nombre, String apellidos) {
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public Contactos(String nombre, String apellidos, int telefono) {
        Nombre = nombre;
        Apellidos = apellidos;
        Telefono = telefono;
    }


    // getter and setter


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    //ToString

    @Override
    public String toString() {
        return Nombre + " " + Apellidos + ","+ "Telefono: " + Telefono;
    }

    public String toString2() {
        return Nombre + " " + Apellidos;
    }

    @Override
    public int compareTo(Contactos o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contactos contactos = (Contactos) o;
        return Objects.equals(Nombre, contactos.Nombre) &&
                Objects.equals(Apellidos, contactos.Apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Apellidos);
    }
}
