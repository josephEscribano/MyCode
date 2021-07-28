package herencias_interface.EstructuraProyecto.DAO.Modelos;

public class revisionesRealizadas {

    private revisiones revision;
    private int precio;

    //constructor


    public revisionesRealizadas(revisiones revision) {
        this.revision = revision;
        this.precio = 0;
    }

    //getter and setter


    public revisiones getRevision() {
        return revision;
    }

    public void setRevision(revisiones revision) {
        this.revision = revision;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //metodos


    @Override
    public String toString() {
        return "revisionesRealizadas{" +
                "revision=" + revision +
                ", precio=" + precio +
                '}';
    }

    public void MostrarRevisionesRealizadas(){
        System.out.print("Revision: ");
        revision.mostrarRevisiones();
        System.out.println(" Precio: " + precio);
    }
}
