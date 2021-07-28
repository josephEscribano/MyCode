package ProyectoVerano.DAO.DAOS;



import ProyectoVerano.DAO.MODELOS.coches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class cochesDAO {

    private static HashMap<String,coches> miscoches = new HashMap<>();

    public void AñadirCoche (coches coche){
        miscoches.put(coche.getMatricula(),coche);

    }
    public HashMap<String, coches> getMiscoches() {
        return miscoches;
    }

    public void setMiscoches(HashMap<String, coches> miscoches) {
        cochesDAO.miscoches = miscoches;
    }

    public coches getCochePorMatricula (String matricula){
        return miscoches.get(matricula);
    }

    public List<coches> getListadoCoches(){
        return new ArrayList<>(miscoches.values());
    }
}

