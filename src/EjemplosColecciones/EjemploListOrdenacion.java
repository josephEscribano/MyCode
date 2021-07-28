package EjemplosColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjemploListOrdenacion {
    public static void main(String[] args) {

      //  ordenacion1();

        ArrayList<Persona> lista2 = new ArrayList<Persona>();
        lista2.add(new Persona("28751533Q", "María", "Gómez García", 37));
        lista2.add(new Persona("65971552A", "Luis", "González Pérez", 17));
        lista2.add(new Persona("16834954R", "Raquel", "Jiménez Pérez", 62));
        Persona p2 = new Persona("28751533Q", "Amanda", "García Caro", 39);
        lista2.add(p2);
     //   ordenacion2Comparator(lista2);



        ArrayList<Persona> lista3 = new ArrayList<Persona>();
        lista3.add(new Persona("28751533Q", "María", "Gómez García", 37));
        lista3.add(new Persona("65971552A", "Luis", "González Pérez", 17));
        lista3.add(new Persona("16834954R", "Raquel", "Jiménez Pérez", 62));
        Persona p3 = new Persona("28751533Q", "Amanda", "García Caro", 39);
        lista3.add(p3);
    //    ordenacion3Comparator(lista3);




        ArrayList<Persona> lista4 = new ArrayList<Persona>();
        lista4.add(new Persona("28751533Q", "María", "Gómez García", 37));
        lista4.add(new Persona("65971552A", "Luis", "González Pérez", 17));
        lista4.add(new Persona("16834954R", "Raquel", "Jiménez Pérez", 62));
        Persona p4 = new Persona("28751533Q", "Amanda", "García Caro", 39);
        lista4.add(p4);
        ordenacion4Comparable(lista4);
    }



    private static void ordenacion1() {
        //Collections.sort(lista2);
        ArrayList<Integer> lista3=new ArrayList<Integer>();
        lista3.add(3);
        lista3.add(10);
        lista3.add(0);
        lista3.add(1);
        lista3.add(11);
        lista3.add(100);
        System.out.println("1) Lista original: "+lista3);
      /*  Collections.reverse(lista3);
        System.out.println("Lista reverse: "+lista3);
        Collections.sort(lista3);
        System.out.println("Lista sort: "+lista3);
        Collections.reverse(lista3);
        System.out.println("Lista reverse después de sort: "+lista3);
        */
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(lista3, comparador);
        System.out.println(" - Lista reverse con comparator: "+lista3);



    }

    private static void ordenacion2Comparator(ArrayList<Persona> lista) {
        System.out.println("2) Lista original: ");
        for(int i = 0;i<lista.size();i++){
            Persona p = lista.get(i);
            System.out.print(p.getNombre()+"("+p.getEdad()+"), ");
        }
        //lo ordenamos según la edad:
        Comparator miComparador = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                Integer edad1 = p1.getEdad();
                Integer edad2 = p2.getEdad();
                return edad1.compareTo(edad2); //ordena la edad de menor a mayor
                //edad2.compareTo(edad1);  la ordena de mayor a menor
            }
        };
        //ordenamos la lista según el criterio
        Collections.sort(lista, miComparador);
        System.out.println("\n - Lista ordenada por edad con comparator: ");
        for(int i = 0;i<lista.size();i++){
            Persona p = lista.get(i);
            System.out.print(p.getNombre()+"("+p.getEdad()+"), ");
        }
    }
    private static void ordenacion3Comparator(ArrayList<Persona> lista) {
        System.out.println("\n3) Lista original: ");
        for(int i = 0;i<lista.size();i++){
            Persona p = lista.get(i);
            System.out.print(p.getNombre()+"("+p.getEdad()+"), ");
        }
        //lo ordenamos según la edad:
        //me creo el objeto Comparator de la clase que nos hemos creado
        EjemploComparatorPersona comparador = new EjemploComparatorPersona();
        Collections.sort(lista, comparador); //ordenamos la lista según el criterio
        //las dos líneas anteriores se puede reducir en una:
       // Collections.sort(lista, new EjemploComparatorPersona());
        System.out.println("\n - Lista ordenada por edad con comparator en otra clase: ");
        for(int i = 0;i<lista.size();i++){
            Persona p = lista.get(i);
            System.out.print(p.getNombre()+"("+p.getEdad()+"), ");
        }
    }

    private static void ordenacion4Comparable(ArrayList<Persona> lista) {
        System.out.println("\n4) Lista original: ");
        for(int i = 0;i<lista.size();i++){
            Persona p = lista.get(i);
            System.out.print(p.getNombre()+"("+p.getEdad()+"), ");
        }
        //lo ordenamos según la edad:
        Collections.sort(lista); //ordenamos la lista según el criterio
        System.out.println("\n - Lista ordenada por edad con comparable: ");
        for(int i = 0;i<lista.size();i++){
            Persona p = lista.get(i);
            System.out.print(p.getNombre()+"("+p.getEdad()+"), ");
        }
    }

}
