package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Objects;

public class Peliculas {

    private final int id;
    private String Nombre;
    private int Anio;
    private String Directores;


    private static int num = 1;

    //Constructores


    public Peliculas() {
        this.id = num;
        num++;
    }

    public Peliculas(String nombre, int anio, String directores) {
        this.id = num;
        num++;
        Nombre = nombre;
        Anio = anio;
        Directores = directores;
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getAño() {
        return Anio;
    }

    public void setAño(int año) {
        Anio = año;
    }

    public String getDirectores() {
        return Directores;
    }

    public void setDirectores(String directores) {
        Directores = directores;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Peliculas.num = num;
    }
    //toString and equals


    @Override
    public String toString() {
        return "id:" + id +"Nombre: " + Nombre + " Año: " + Anio + "Director: " + Directores;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return id == peliculas.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
