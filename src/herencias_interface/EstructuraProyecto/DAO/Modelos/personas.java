package herencias_interface.EstructuraProyecto.DAO.Modelos;

import java.util.Objects;

public abstract class personas implements Comparable<personas>{
    private String DNI;
    private String Nombre;
    private double Sueldo;

    //construcotor


    public personas(String DNI, String nombre, double sueldo) {
        this.DNI = DNI;
        Nombre = nombre;
        Sueldo = sueldo;
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

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }

    //metodos


    @Override
    public String toString() {
        return "personas{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Sueldo=" + Sueldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        personas personas = (personas) o;
        return Objects.equals(DNI, personas.DNI);
    }

    @Override
    public int compareTo(personas o) {
        return this.DNI.compareTo(o.getDNI());
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }

    public abstract void MostrarPeronas();
}
