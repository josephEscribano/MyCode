package ColeccionesYmaps;

import java.util.Objects;

public class Ejercicio11Jugador implements Comparable<Ejercicio11Jugador>{
    private String Nombre;
    private int Numero;
    private String Posicion;


    // Constructores

    public Ejercicio11Jugador(String nombre, int numero, String posicion ) {
        Nombre = nombre;
        Numero = numero;
        Posicion = posicion;
    }
    public Ejercicio11Jugador() {
    }



    // getter and setter


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    // toString and equals


    @Override
    public String toString() {
        return "jugador: " + Nombre + " numero: " + Numero + " posicion: " + Posicion;
    }

    @Override
    public int compareTo(Ejercicio11Jugador o) {
        Integer num1 = this.Numero;
        Integer num2 = o.Numero;
        return num1.compareTo(num2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio11Jugador that = (Ejercicio11Jugador) o;
        return Numero == that.Numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Numero);
    }
}
