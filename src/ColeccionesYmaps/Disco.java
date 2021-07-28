package ColeccionesYmaps;

import java.util.Objects;

public class Disco implements Comparable<Disco>{
    private String titulo;
    private int numeroVendidos;

    // constructores


    public Disco(String titulo, int numeroVendidos) {
        this.titulo = titulo;
        this.numeroVendidos = numeroVendidos;
    }

    // getter and setter


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroVendidos() {
        return numeroVendidos;
    }

    public void setNumeroVendidos(int numeroVendidos) {
        this.numeroVendidos = numeroVendidos;
    }

    //toString and equals

    @Override
    public String toString() {
        return " Disco: " + titulo + " ha vendido " + numeroVendidos + " copias";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return Objects.equals(titulo, disco.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public int compareTo(Disco o) {
        Integer o1 = this.getNumeroVendidos();
        Integer o2 = o.getNumeroVendidos();
        return o1.compareTo(o2);
    }
}
