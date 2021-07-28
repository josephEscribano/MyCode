package ProyectoVerano.DAO.DAOS;

import ProyectoVerano.DAO.MODELOS.Directivos;

import java.util.ArrayList;

public class DirectivosDAO {

    private static ArrayList<Directivos> DirectDAO = new ArrayList<>();

    public ArrayList<Directivos> getDirectDAO() {
        return DirectDAO;
    }

    public void setDirectDAO(ArrayList<Directivos> directDAO) {
        DirectDAO = directDAO;
    }
}
