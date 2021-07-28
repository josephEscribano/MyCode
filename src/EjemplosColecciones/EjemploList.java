package EjemplosColecciones;

import java.time.LocalDate;
import java.util.*;

public class EjemploList {
    public static void main(String[] args) {
       //ejemplo0ArrayList();
        ejemploArrayList();
        ejemplo2ArrayList();
    }

    private static void ejemplo0ArrayList() {
        List<PersonaEjemplo0> listaPersonas = new ArrayList<>();
        PersonaEjemplo0 pers1 = new PersonaEjemplo0("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2));
        listaPersonas.add(pers1);
        listaPersonas.add(new PersonaEjemplo0("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new PersonaEjemplo0("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new PersonaEjemplo0("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

        //Acceso posicional (3ª posición)
        PersonaEjemplo0 p = listaPersonas.get(2);
        System.out.println(p);
        System.out.println("\n\n");

        //Recorrer la lista completa
        for(PersonaEjemplo0 per : listaPersonas)
            System.out.println(per);


        //Añadir un nuevo elemento al final de la lista
        listaPersonas.add(new PersonaEjemplo0("56789012E", "Julio", "Azcárate", LocalDate.of(1994, 5, 6)));

        //Añadir/modificar un elemento en medio de la lista
       // listaPersonas.set(2, new PersonaEjemplo0("67890123F", "Alfonso", "García", LocalDate.of(1995, 6, 7)));
        listaPersonas.add(2, new PersonaEjemplo0("67890123F", "Alfonso", "García", LocalDate.of(1995, 6, 7)));

        //Recorrer la lista completa
        System.out.println("\n\n\n");
        for(PersonaEjemplo0 per : listaPersonas)
            System.out.println(per);

    }

    private static void ejemploArrayList() {
        System.out.println("- Ejemplo de ArrayList");
        ArrayList<String> al = new ArrayList<>(); //creamos un array list
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add(null);
        System.out.println(al); //mostramos su contenido
        al.remove(2); //eliminamos el elemento de la posición 2
        System.out.println(al); //mostramos su contenido
        al.add(2, "j");
        al.add("win");
        System.out.println(al); //mostramos su contenido

        Iterator iter = al.iterator();  // Creamos el Iterator a partir de la lista
        while(iter.hasNext()) {  // Mientras haya siguiente en la lista
            System.out.println(iter.next()); // Lo imprimimos por pantalla
        }

    }
    private static void ejemplo2ArrayList() {
        //En el siguiente ejemplo insertamos datos int, double, char y String:
        ArrayList lista = new ArrayList();
        lista.add(-25);
        lista.add(3.14);
        lista.add('A');
        lista.add("Luis");
        //recorrido con for
        for(int i = 0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }


       // En el siguiente ejemplo insertamos objetos de la clase Persona:
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("28751533Q", "María", "Gómez García", 37));
        listaPersonas.add(new Persona("65971552A", "Luis", "González Pérez", 17));
        listaPersonas.add(new Persona("16834954R", "Raquel", "Jiménez Pérez", 62));
        // También se podría haber hecho lo siguiente:
        Persona p = new Persona("28751533Q", "Amanda", "García Caro", 39);
        listaPersonas.add(p);

        //recorrido con foreach
        for(Persona per: listaPersonas){
            System.out.println(per.toString());
        }


    }


    }




