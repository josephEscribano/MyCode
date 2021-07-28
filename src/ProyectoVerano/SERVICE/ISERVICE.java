package ProyectoVerano.SERVICE;

import ProyectoVerano.DAO.DAOS.PersonasDAO;
import ProyectoVerano.DAO.MODELOS.Personas;
import ProyectoVerano.DAO.MODELOS.Revisiones;
import ProyectoVerano.DAO.MODELOS.coches;
import herencias_interface.EstructuraProyecto.Servicios.Iservice;

import java.util.ArrayList;
import java.util.List;

public interface ISERVICE {

    public boolean CargaInicial ();

    public void añadircoche(coches coche);
    public void añadirpersonas(Personas persona);
    public void añadirRevisiones (Revisiones revisiones);
    public ArrayList<Personas> ordenarDirectivos();
    public List<coches> mostrarCoches();
    public ArrayList<Revisiones> MostrarRevisiones();
    public boolean AñadirRevision(coches coche, Revisiones revision);
    public Revisiones ObtenerRevision(int opcion);
    public coches ObtenerCochePorMatricula(String matricula);
    public void PasarRevision();
}
