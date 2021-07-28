package herencias_interface.Ejercicio16Herencias;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public abstract class vehiculos implements Comparable<vehiculos> {
    Calendar calendario = Calendar.getInstance();
    private String matricula;
    private LocalDate Fecha;
    private int TiempoEntrada;
    // constructores

    public vehiculos(String matricula) {
        this.matricula = matricula;
        Fecha = LocalDate.now();

        TiempoEntrada = calendario.get(Calendar.SECOND);
    }

    //getter and setter


    public int getTiempoEntrada() {
        return TiempoEntrada;
    }

    public void setTiempoEntrada(int tiempoEntrada) {
        TiempoEntrada = tiempoEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }


    //metodos


    @Override
    public String toString() {
        return "vehiculos{" +
                "matricula='" + matricula + '\'' +
                ", Fecha=" + Fecha +
                ", TiempoEntrada=" + TiempoEntrada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vehiculos vehiculos = (vehiculos) o;
        return Objects.equals(matricula, vehiculos.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(vehiculos o) {
        return this.getMatricula().compareTo(o.getMatricula());
    }

    public abstract double CalcularImporte(int tiempoSalida);
    public abstract void ImprimirDatos();
}
