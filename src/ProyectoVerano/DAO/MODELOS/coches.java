package ProyectoVerano.DAO.MODELOS;

import java.util.ArrayList;
import java.util.Objects;

public class coches {
    private String matricula;
    private double dineroDisponibleRevisiones;
    private ArrayList<RevisionesRealizadas> revisionesRealizadas;

    public coches(String matricula, double dineroDisponibleRevisiones) {
        this.matricula = matricula;
        this.dineroDisponibleRevisiones = dineroDisponibleRevisiones;
        this.revisionesRealizadas = new ArrayList<>();
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getDineroDisponibleRevisiones() {
        return dineroDisponibleRevisiones;
    }

    public void setDineroDisponibleRevisiones(double dineroDisponibleRevisiones) {
        this.dineroDisponibleRevisiones = dineroDisponibleRevisiones;
    }

    public ArrayList<RevisionesRealizadas> getRevisionesRealizadas() {
        return revisionesRealizadas;
    }

    public void setRevisionesRealizadas(ArrayList<RevisionesRealizadas> revisionesRealizadas) {
        this.revisionesRealizadas = revisionesRealizadas;
    }


    @Override
    public String toString() {
        return "Coches: " + '\n' +
                "Matricula: "+matricula + '\n' +
                "DineroRevisiones: " + dineroDisponibleRevisiones + '\n' +
                "Revisiones Realizadas: " + revisionesRealizadas + '\n' +
                 "---------------------------" + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        coches coches = (coches) o;
        return Objects.equals(matricula, coches.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
