package herencias_interface.EstructuraProyecto.DAO;

import herencias_interface.EstructuraProyecto.DAO.Modelos.directivos;
import herencias_interface.EstructuraProyecto.DAO.Modelos.personas;


import java.util.ArrayList;
import java.util.Collections;

public class PersonasDAO {
    private static ArrayList<personas> pers = new ArrayList<>();

    public void AñadirPersona(personas persona){
        pers.add(persona);
    }
    public ArrayList<personas> MostrarDirectivosOrdenados(){
        ArrayList<personas> Apersonas = new ArrayList<>();

        for (int i = 0; i < pers.size(); i++){
            if (pers.get(i).getClass() == directivos.class){

                Apersonas.add(pers.get(i));
            }
        }

        Collections.sort(Apersonas);
        Collections.reverse(Apersonas);
        return Apersonas;
    }

    public double MediaSalarios(){
        double media = 0;
        for (int i = 0; i < pers.size();i++){
            media = media + pers.get(i).getSueldo() / pers.size();
        }

        return media;
    }




}
