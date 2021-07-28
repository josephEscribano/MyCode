package ProyectoVerano.SERVICE;

import ColeccionesYmaps.Persona;
import ProyectoVerano.DAO.DAOS.PersonasDAO;
import ProyectoVerano.DAO.DAOS.RevisionesDAO;
import ProyectoVerano.DAO.DAOS.cochesDAO;

import ProyectoVerano.DAO.MODELOS.*;

import java.util.*;

public class Servicios implements ISERVICE{
    cochesDAO cochesDAO = new cochesDAO();
    PersonasDAO personasDAO = new PersonasDAO();
    RevisionesDAO revisionesDAO = new RevisionesDAO();
    @Override
    public boolean CargaInicial() {
        boolean confirmacion = true;
        ArrayList<coches> cochesnuevos = new ArrayList<>();
        coches coche1 = new coches("1234jkl",2000);
        coches coche2 = new coches("1235jhg",200);

        cochesnuevos.add(coche1);
        cochesnuevos.add(coche2);
        for (int i = 0; i < cochesnuevos.size(); i++){
            añadircoche(cochesnuevos.get(i));
        }


        Personas persona1 = new Directivos("02284341g","Joseph",4000,10);
        Personas persona2 = new Directivos("50672452h","Julie",4001,10);
        Personas persona3 = new EmpleadosTienda("12345678l","John",2000, Tareas.Ordenar);
        añadirpersonas(persona1);
        añadirpersonas(persona2);
        añadirpersonas(persona3);



        Revisiones revision1 = new Revisiones("revision1", "norauto", 2);
        Revisiones revision2 = new Revisiones("revision2","talleres pepe",3);

        añadirRevisiones(revision1);
        añadirRevisiones(revision2);

        return confirmacion;

    }

    public void añadircoche (coches coches){
        if (!cochesDAO.getMiscoches().containsKey(coches.getMatricula())){
            cochesDAO.AñadirCoche(coches);
        }
    }

    public void añadirpersonas(Personas persona){

        if (!personasDAO.getPersonasDAO().contains(persona)){
            personasDAO.AñadirPersonas(persona);
        }
    }

    public void añadirRevisiones(Revisiones revisiones){
        if (!revisionesDAO.getRevDAO().contains(revisiones)){
            revisionesDAO.AñadirRevisiones(revisiones);
        }
    }

    public ArrayList<Personas> ordenarDirectivos(){
        ArrayList<Personas> personas = personasDAO.getPersonasDAO();
        Iterator<Personas> it = personas.iterator();
        while (it.hasNext()){
            Personas p = it.next();
            if (p.getClass() != Directivos.class){
                it.remove();
            }
        }

        Comparator comparador = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Personas p1 = (Personas) o1;
                Personas p2 = (Personas) o2;
                return p2.getDNI().compareTo(p1.getDNI());
            }
        };

        Collections.sort(personas,comparador);

        return personas;
    }

    @Override
    public List<coches> mostrarCoches() {
        return cochesDAO.getListadoCoches();

    }

    @Override
    public ArrayList<Revisiones> MostrarRevisiones() {
        return revisionesDAO.getRevDAO();
    }

    @Override
    public Revisiones ObtenerRevision(int opcion) {
        return MostrarRevisiones().get(opcion);
    }

    @Override
    public boolean AñadirRevision(coches coche, Revisiones revision) {
        boolean correcto = true;
        RevisionesRealizadas realizadas = new RevisionesRealizadas(revision);
        if (coche.getDineroDisponibleRevisiones() > realizadas.getPrecio()){
            if (revision.getCochesHaciendoRevision() < revision.getMaxcoches()){
                if (!coche.getRevisionesRealizadas().contains(revision)){
                    coche.getRevisionesRealizadas().add(realizadas);
                }else{
                    correcto = false;
                }
            }else{
                correcto = false;
            }
        }else{
            correcto = false;
        }
        return correcto;
    }

    public coches ObtenerCochePorMatricula(String matricula){
        coches coche = cochesDAO.getCochePorMatricula(matricula);
        return coche;
    }

    @Override
    public void PasarRevision() {

    }
}
