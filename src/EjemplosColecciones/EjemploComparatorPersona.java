package EjemplosColecciones;

import java.util.Comparator;

public class EjemploComparatorPersona implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
            Persona p1 = (Persona) o1;
            Persona p2 = (Persona) o2;
            Integer edad1 = p1.getEdad();
            Integer edad2 = p2.getEdad();
            return edad1.compareTo(edad2);

    }
}
