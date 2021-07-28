package ProyectoVerano.DAO.MODELOS;

import java.util.Objects;

public class RevisionesRealizadas {
    private Revisiones revision;
    private double Precio;

    public RevisionesRealizadas(Revisiones revision) {
        this.revision = revision;
        this.Precio = 0;
    }

    public Revisiones getRevision() {
        return revision;
    }

    public void setRevision(Revisiones revision) {
        this.revision = revision;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "RevisionesRealizadas{" + '\n' + revision + '\n' + Precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RevisionesRealizadas that = (RevisionesRealizadas) o;
        return Objects.equals(revision, that.revision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revision);
    }
}
