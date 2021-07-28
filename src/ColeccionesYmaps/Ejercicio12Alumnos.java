package ColeccionesYmaps;

import java.util.Objects;

public class Ejercicio12Alumnos {
    private String DNI;
    private String Nombre;
    private int Edad;
    private boolean repite;

    //constructores


    public Ejercicio12Alumnos(String dni, String nombre, int edad, boolean repite) {
        DNI = dni;
        Nombre = nombre;
        Edad = edad;
        this.repite = repite;
    }

    public Ejercicio12Alumnos() {
    }

    //getter and setter

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public boolean isRepite() {
        return repite;
    }

    public void setRepite(boolean repite) {
        this.repite = repite;
    }

    //toString and Equals


    @Override
    public String toString() {
        return "Nombre: " + Nombre + " - " + "Edad: " + Edad + " - " + "Es repetidor: " + repite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio12Alumnos that = (Ejercicio12Alumnos) o;
        return Objects.equals(DNI, that.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }
}
