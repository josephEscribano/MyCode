package ColeccionesYmaps;

import java.util.Comparator;

public class Ejercicio5ComparatorPersona implements Comparator<Persona> {


    @Override
    public int compare(Persona o1, Persona o2) {
        Persona p1 = (Persona) o1;
        Persona p2 = (Persona) o2;
        Integer Edad1 = p1.getEdad();
        Integer Edad2 = p2.getEdad();
        return Edad1.compareTo(Edad2);
    }
}
