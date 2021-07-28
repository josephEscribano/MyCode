package ProyectoVerano.DAO.DAOS;

import ProyectoVerano.DAO.MODELOS.Personas;

import java.util.ArrayList;

public class PersonasDAO {
    private static ArrayList<Personas> personasDAO = new ArrayList<>();

    public void AñadirPersonas (Personas persona){
        personasDAO.add(persona);
    }
    public ArrayList<Personas> getPersonasDAO() {
        return personasDAO;
    }

    public void setPersonasDAO(ArrayList<Personas> personasDAO) {
        PersonasDAO.personasDAO = personasDAO;
    }
}
