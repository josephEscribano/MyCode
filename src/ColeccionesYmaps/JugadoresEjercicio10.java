package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Objects;

public class JugadoresEjercicio10 {
    private String Nombre;
    private Integer numero;

    // CONSTRUCTORES


    public JugadoresEjercicio10(String nombre, Integer numero) {
        Nombre = nombre;
        this.numero = numero;
    }

    // GETTER AND SETTER

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    // TOSTRING AND EQUALS

    @Override
    public String toString() {
        return numero + "-->" + Nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JugadoresEjercicio10 that = (JugadoresEjercicio10) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
