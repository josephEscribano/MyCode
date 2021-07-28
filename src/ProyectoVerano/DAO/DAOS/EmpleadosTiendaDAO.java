package ProyectoVerano.DAO.DAOS;

import ProyectoVerano.DAO.MODELOS.EmpleadosTienda;

import java.util.ArrayList;

public class EmpleadosTiendaDAO {

    private  ArrayList<EmpleadosTienda> EmpleadosDAO = new ArrayList<>();

    public  ArrayList<EmpleadosTienda> getEmpleadosDAO() {
        return EmpleadosDAO;
    }

    public void setEmpleadosDAO(ArrayList<EmpleadosTienda> empleadosDAO) {
        EmpleadosDAO = empleadosDAO;
    }
}
