package ProyectoVerano.DAO.MODELOS;

import java.util.Objects;

public class Revisiones {
    private String Revision;
    private String Taller;
    private int maxcoches;

    private int cochesHaciendoRevision;


    public Revisiones(String revision, String taller, int maxcoches) {
        Revision = revision;
        Taller = taller;
        this.maxcoches = maxcoches;

        this.cochesHaciendoRevision = 0;
    }

    public String getRevision() {
        return Revision;
    }

    public void setRevision(String revision) {
        Revision = revision;
    }

    public String getTaller() {
        return Taller;
    }

    public void setTaller(String taller) {
        Taller = taller;
    }

    public int getMaxcoches() {
        return maxcoches;
    }

    public void setMaxcoches(int maxcoches) {
        this.maxcoches = maxcoches;
    }

    public int getCochesHaciendoRevision() {
        return cochesHaciendoRevision;
    }

    public void setCochesHaciendoRevision(int cochesHaciendoRevision) {
        this.cochesHaciendoRevision = cochesHaciendoRevision;
    }

    @Override
    public String toString() {
        return "Revisiones: " + '\n' + "Nombre: " + Revision + '\n'
                +"Cantidad maxima: " + maxcoches + '\n'
                +"Cochs en revision: " + cochesHaciendoRevision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revisiones that = (Revisiones) o;
        return Objects.equals(Revision, that.Revision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Revision);
    }
}
