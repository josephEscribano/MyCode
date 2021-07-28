package ProyectoVerano.DAO.DAOS;

import ProyectoVerano.DAO.MODELOS.Revisiones;

import java.util.ArrayList;

public class RevisionesDAO {

    private static ArrayList<Revisiones> revDAO = new ArrayList<>();


    public void AñadirRevisiones(Revisiones revision){
        revDAO.add(revision);
    }

    public  ArrayList<Revisiones> getRevDAO() {
        return revDAO;
    }

    public void setRevDAO(ArrayList<Revisiones> revDAO) {
        RevisionesDAO.revDAO = revDAO;
    }
}
