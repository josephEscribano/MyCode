package herencias_interface.EstructuraProyecto.DAO;

import herencias_interface.EstructuraProyecto.DAO.Modelos.revisiones;

import java.util.ArrayList;
import java.util.Iterator;

public class RevisionesDAO {

    private static ArrayList<revisiones> Arevisiones = new ArrayList<>();

    public ArrayList<revisiones> getArevisiones() {
        return Arevisiones;
    }

    public void setArevisiones(ArrayList<revisiones> arevisiones) {
        Arevisiones = arevisiones;
    }

    public void AñadirRevisiones(revisiones revision){
        Arevisiones.add(revision);

    }
    public ArrayList<revisiones> MostrarRevisiones(){
        return Arevisiones;
    }

    public revisiones ObtenerRevisiones(String nombreRev){
        revisiones revision1 = new revisiones();
        for (int i = 0; i  < Arevisiones.size();i++){
            if (Arevisiones.get(i).getNombreRevision().equals(nombreRev)){
                revision1 = Arevisiones.get(i);
            }
        }

        return revision1;
    }

    public revisiones ObtenerRevTaller(String taller){
        revisiones revision = new revisiones();
        for (int i = 0; i < Arevisiones.size(); i++){
            if (Arevisiones.get(i).getNombreTaller().equals(taller)){
                revision = Arevisiones.get(i);
            }
        }

        return revision;
    }
}
