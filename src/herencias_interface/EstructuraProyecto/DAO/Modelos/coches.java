package herencias_interface.EstructuraProyecto.DAO.Modelos;

import java.util.ArrayList;
import java.util.Objects;

public class coches {

    private String Matricula;
    private double dineroReviciones;
    private ArrayList<revisionesRealizadas> revisionesrealizadas;

    //constructor


    public coches() {
    }

    public coches(String matricula, double dineroReviciones) {
        this.revisionesrealizadas = new ArrayList<>();
        Matricula = matricula;
        this.dineroReviciones = dineroReviciones;
    }

    //getter and setter


    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public double getDineroReviciones() {
        return dineroReviciones;
    }

    public void setDineroReviciones(double dineroReviciones) {
        this.dineroReviciones = dineroReviciones;
    }

    public ArrayList<revisionesRealizadas> getRevisionesrealizadas() {
        return revisionesrealizadas;
    }

    public void setRevisionesrealizadas(ArrayList<revisionesRealizadas> revisionesrealizadas) {
        this.revisionesrealizadas = revisionesrealizadas;
    }

    //metodos


    @Override
    public String toString() {
        return "coches{" +
                "Matricula='" + Matricula + '\'' +
                ", dineroReviciones=" + dineroReviciones +
                ", revisionesrealizadas=" + revisionesrealizadas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        coches coches = (coches) o;
        return Objects.equals(Matricula, coches.Matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Matricula);
    }

    public void MostrarCoches(){
        System.out.println("Coche --> " + " Matricula: " + Matricula + " Dinero: " + dineroReviciones + " Revisiones realizadas: " + revisionesrealizadas );
    }
}
