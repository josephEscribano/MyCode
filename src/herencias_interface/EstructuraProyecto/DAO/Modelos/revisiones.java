package herencias_interface.EstructuraProyecto.DAO.Modelos;

import java.util.Objects;

public class revisiones {

    private String NombreRevision;
    private String NombreTaller;
    private int MaxCoches;

    private int CochesHaciendoRevision;


    //constructor


    public revisiones() {
    }

    public revisiones(String nombreRevision, String nombreTaller, int maxCoches) {
        NombreRevision = nombreRevision;
        NombreTaller = nombreTaller;
        MaxCoches = maxCoches;
        this.CochesHaciendoRevision = 0;

    }

    //geter and setter


    public String getNombreRevision() {
        return NombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        NombreRevision = nombreRevision;
    }

    public String getNombreTaller() {
        return NombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        NombreTaller = nombreTaller;
    }

    public int getMaxCoches() {
        return MaxCoches;
    }

    public void setMaxCoches(int maxCoches) {
        MaxCoches = maxCoches;
    }

    public int getCochesHaciendoRevision() {
        return CochesHaciendoRevision;
    }

    public void setCochesHaciendoRevision(int cochesHaciendoRevision) {
        CochesHaciendoRevision = cochesHaciendoRevision;
    }

    //metodos


    @Override
    public String toString() {
        return "revisiones{" +
                "NombreRevision='" + NombreRevision + '\'' +
                ", NombreTaller='" + NombreTaller + '\'' +
                ", MaxCoches=" + MaxCoches +
                ", CochesHaciendoRevision=" + CochesHaciendoRevision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        revisiones that = (revisiones) o;
        return Objects.equals(NombreRevision, that.NombreRevision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NombreRevision);
    }

    public void mostrarRevisiones(){
        System.out.println( " Nombre de la revision: " + NombreRevision + " Taller: " + NombreTaller );
    }
}
