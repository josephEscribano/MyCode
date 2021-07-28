package EjemplosColecciones;

import java.util.*;

public class EjemploHashMapOrdenacion {
    public static void main(String[] args) {

        HashMap<Integer, Persona> mapa = new HashMap<>();
        mapa.put(1, new Persona("28751533Q", "María", "Gómez García", 37));
        mapa.put(2, new Persona("65971552A", "Luis", "González Pérez", 17));
        mapa.put(3, new Persona("16834954R", "Raquel", "Jiménez Pérez", 62));
        Persona p2 = new Persona("28751533Q", "Amanda", "García Caro", 39);
        mapa.put(4,p2);
        ordenacion2Comparator(mapa);
    }


    private static void ordenacion2Comparator(HashMap<Integer, Persona> mapa) {
        System.out.println("1) HashMap original: ");
        for (Persona p : mapa.values()) {
            System.out.println(p.getNombre() + "\t" + p.getEdad());
        }

        List<Persona> peopleByAge = new ArrayList<>(mapa.values());
        Collections.sort(peopleByAge);

        for (Persona p : peopleByAge) {
            System.out.println(p.getNombre() + "\t" + p.getEdad());
        }
    }


}
