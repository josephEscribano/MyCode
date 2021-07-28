package herencias_interface.EstructuraProyecto.DAO;

import herencias_interface.EstructuraProyecto.DAO.Modelos.coches;
import herencias_interface.EstructuraProyecto.DAO.Modelos.revisiones;
import herencias_interface.EstructuraProyecto.DAO.Modelos.revisionesRealizadas;

import java.util.ArrayList;

public class cochesDAO {
    private static ArrayList<coches> coches = new ArrayList<>();


    public void AñadirCoche(coches coche){
        coches.add(coche);
    }
    public ArrayList<coches> MostrarCoches(){
        return  coches;

    }

    public coches ObtenerCochePorMatricula(String matricula){
        coches coche1 = new coches();
        for (int i = 0; i < coches.size();i++){
            if (coches.get(i).getMatricula().equals(matricula)){
                coche1 = coches.get(i);
            }
        }
        return coche1;
    }

    public ArrayList<revisionesRealizadas> ObtenerRevRealizadas (coches coche){
        ArrayList<revisionesRealizadas> revRealizadas = new ArrayList<>();

        revRealizadas = coche.getRevisionesrealizadas();

        return revRealizadas;

    }

    public ArrayList<coches> Obtenercoche(revisiones revision){
        ArrayList<coches> cochesTaller = new ArrayList<>();
        for (int i = 0; i < coches.size();i++){
            for (int j = 0; j < coches.get(i).getRevisionesrealizadas().size();j++){
                if (coches.get(i).getRevisionesrealizadas().get(j).getRevision().equals(revision)){
                    cochesTaller.add(coches.get(i));
                }
            }
        }

        return cochesTaller;
    }




}
