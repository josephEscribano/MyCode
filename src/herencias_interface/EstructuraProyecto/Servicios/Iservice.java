package herencias_interface.EstructuraProyecto.Servicios;

import herencias_interface.EstructuraProyecto.DAO.Modelos.*;

import java.util.ArrayList;

public interface Iservice {

    public void AñadirCoche (coches coche);

    public void AñadirPersonas (personas persona );

    public void AñadirRevisiones (revisiones revision);

    public void Menu();

    public ArrayList<personas> MostrarDirectivosOrdenados();

    public ArrayList<coches> MostrarCoches ();

    public ArrayList<revisiones> MostrarRevisiones();

    public coches ObtenerCochePorMatricula(String matricula);

    public revisiones ObtenerRevisiones(String revision);

    public ArrayList<revisionesRealizadas> ObtenerRevRealizadas(coches coche);

    public double MediaSalarios();

    public revisiones ObtenerRevTaller(String taller);

    public ArrayList<coches> ObtenerCoche (revisiones revision);


}
