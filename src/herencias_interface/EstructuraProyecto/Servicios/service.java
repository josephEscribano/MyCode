package herencias_interface.EstructuraProyecto.Servicios;

import herencias_interface.EstructuraProyecto.DAO.PersonasDAO;
import herencias_interface.EstructuraProyecto.DAO.Modelos.*;
import herencias_interface.EstructuraProyecto.DAO.RevisionesDAO;
import herencias_interface.EstructuraProyecto.DAO.cochesDAO;

import java.util.ArrayList;


public class service implements Iservice{

    public void Menu(){
        System.out.println("MENÚ: \n" +
                "1. Mostrar datos directivos (ordenados de forma descendente por dni) \n" +
                "2. Mostrar datos coches \n" +
                "3. Mostrar revisiones disponibles \n" +
                "4. Indicar que un coche tiene que pasar la revisión(no poner dinero)\n" +
                "5. Pasar la revisión (añadir cuánto ha costado)\n" +
                "6. Calcular sueldo total entre directivos y empleados de tienda \n" +
                "7. Mostrar listado de los coches que han pasado por un taller \n" +
                "8. Salir");
    }

    @Override
    public void AñadirCoche(coches coche) {
        cochesDAO cochesdao = new cochesDAO();
        cochesdao.AñadirCoche(coche);
    }

    @Override
    public void AñadirPersonas(personas persona) {
        PersonasDAO personasdao = new PersonasDAO();
        personasdao.AñadirPersona(persona);
    }

    @Override
    public void AñadirRevisiones(revisiones revision) {
        RevisionesDAO revisionesdao = new RevisionesDAO();
        revisionesdao.AñadirRevisiones(revision);
    }

    @Override
    public ArrayList<personas> MostrarDirectivosOrdenados() {
        PersonasDAO persDAO = new PersonasDAO();

        return persDAO.MostrarDirectivosOrdenados() ;

    }

    @Override
    public ArrayList<coches> MostrarCoches() {
        cochesDAO CochesDAO = new cochesDAO();

        return CochesDAO.MostrarCoches();
    }

    @Override
    public ArrayList<revisiones> MostrarRevisiones() {
        RevisionesDAO revisionesDAO = new RevisionesDAO();

        return revisionesDAO.MostrarRevisiones();
    }

    @Override
    public coches ObtenerCochePorMatricula(String matricula) {
        cochesDAO cochesdao = new cochesDAO();

        return cochesdao.ObtenerCochePorMatricula(matricula);
    }

    @Override
    public revisiones ObtenerRevisiones(String nombreRev) {
        RevisionesDAO revDAO = new RevisionesDAO();
        return revDAO.ObtenerRevisiones(nombreRev);
    }

    @Override
    public ArrayList<revisionesRealizadas> ObtenerRevRealizadas(coches coche) {
        cochesDAO cochesdao = new cochesDAO();
        return cochesdao.ObtenerRevRealizadas(coche);
    }

    @Override
    public double MediaSalarios() {
        PersonasDAO persDAO = new PersonasDAO();

        return persDAO.MediaSalarios();
    }

    @Override
    public revisiones ObtenerRevTaller(String taller) {
        RevisionesDAO revDAO = new RevisionesDAO();
        return revDAO.ObtenerRevTaller(taller);
    }

    @Override
    public ArrayList<coches> ObtenerCoche(revisiones revision) {
        cochesDAO cochedao = new cochesDAO();
        return cochedao.Obtenercoche(revision);
    }
}
