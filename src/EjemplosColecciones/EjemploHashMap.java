package EjemplosColecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        ejemplo3HashMap();
    }

    private static void ejemplo3HashMap() {
        //creo mi HashMap: clave será Integer y valor será un String
        HashMap<Integer, String> jugadoras = new HashMap<>();

        //añadimos elementos al haspMap
        jugadoras.put(13, "Helen");
        jugadoras.put(2, "Murchi");
        jugadoras.put(4, "Ana Cris");
        jugadoras.put(5, "Senis");
        jugadoras.put(6, "Sandra");
        jugadoras.put(7, "Marina");
        jugadoras.put(8, "Coral");
        jugadoras.put(9, "Jaio");
        jugadoras.put(10, "Stone");
        jugadoras.put(14, "Gabs");
        jugadoras.put(15, "Chili");
        jugadoras.put(17, "Marlasca");
        jugadoras.put(0, "Eva");
        jugadoras.put(20, "Bodero");

        //Recorremos el HM para ver lo contenido
        //hay varias formas
        //1 Forma: Iterator //map no tiene el iterador pero al hacer keySet
        // obtenemos un set que sí podemos iterar
        System.out.println("1 ----- Mostrando las jugadoras. Forma 1:");
        Iterator<Integer> it = jugadoras.keySet().iterator();
        while(it.hasNext()) {
            Integer clave = it.next();
            System.out.println("Jugadora: "+clave +" - " + jugadoras.get(clave));
        }

        //2 Forma: creando un mapa y recorriéndolo con un foreach
        System.out.println("2 ----- Mostrando las jugadoras. Forma 2:");
        for (Map.Entry<Integer, String> entrada : jugadoras.entrySet()) {
            Integer key = entrada.getKey();
            String value = entrada.getValue();
            System.out.println("Jugadora: "+key +" - " + value);

        }
        //3 Forma: Mediante un foreach guardando
        System.out.println("3 ----- Mostrando las jugadoras. Forma 3:");
        for (Integer clave: jugadoras.keySet()) { //obtengo el conjunto de las claves
            System.out.println("Jugadora: "+clave +" - " + jugadoras.get(clave));
        }
        //Ahora vamos a probar los métodos que tiene hashMap


    }
}
