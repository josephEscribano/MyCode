package ColeccionesYmaps.MODELO;

import ColeccionesYmaps.UTILS.Ejercicio13Marcas;

import java.util.Comparator;
import java.util.Objects;

public class Ejercicio13Coche implements Comparable<Ejercicio13Coche> {

    private String Color;
    private Ejercicio13Marcas Marca;
    private String Modelo;
    private String Matrícula;
    private int NumPuertas;


    //constructores


    public Ejercicio13Coche() {
    }

    public Ejercicio13Coche(String color, Ejercicio13Marcas marca, String modelo, String matrícula, int numPuertas) {
        Color = color;
        Marca = marca;
        Modelo = modelo;
        Matrícula = matrícula;
        NumPuertas = numPuertas;
    }

    //getter and setter

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMatrícula() {
        return Matrícula;
    }

    public void setMatrícula(String matrícula) {
        Matrícula = matrícula;
    }

    public int getNumPuertas() {
        return NumPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        NumPuertas = numPuertas;
    }

    public Ejercicio13Marcas getMarca() {
        return Marca;
    }

    public void setMarca(Ejercicio13Marcas marca) {
        Marca = marca;
    }
//ToString and Equals


    @Override
    public String toString() {
        return "Coche:" +
                "\n- Marca: " + Marca +
                "\n- Modelo " + Modelo +
                "\n- Color: " + Color +
                "\n- Matrícula: " + Matrícula+
                "\n- Número de puertas: " + NumPuertas;
    }

    @Override
    public int compareTo(Ejercicio13Coche o) {
        return this.getMatrícula().compareTo(o.getMatrícula());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio13Coche that = (Ejercicio13Coche) o;
        return Objects.equals(Matrícula, that.Matrícula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Matrícula);
    }


}
