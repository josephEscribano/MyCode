package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Objects;

public class Cantante {
    private String Nombre;
    private ArrayList<Disco> discografia = new ArrayList<>();

    //constructores
    public Cantante(String nombre,String titulo,int numeroVentas) {
        Nombre = nombre;
        this.discografia.add(new Disco(titulo,numeroVentas));
    }


    // getter and setter

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(ArrayList<Disco> discografia) {
        this.discografia = discografia;
    }

    //toString and equals

    @Override
    public String toString() {
        return "Cantante: " + Nombre + " discografia " + this.discografia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cantante cantante = (Cantante) o;
        return Objects.equals(Nombre, cantante.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre);
    }
}
