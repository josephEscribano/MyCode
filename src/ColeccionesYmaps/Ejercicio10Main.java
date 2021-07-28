package ColeccionesYmaps;

import java.util.Iterator;

public class Ejercicio10Main {
    public static void main(String[] args) {
        Ejercicio10JugadoresService scjugadores = new Ejercicio10JugadoresService();
        //Añadir jugadores
        scjugadores.AñadirJugadores();

        //Ejercicio a
        System.out.println("Numero de elementos que tiene: " + scjugadores.jugadores.size());


        //Ejercicio b
        System.out.println("¿Esta vacio?" + scjugadores.jugadores.isEmpty());

        //Ejercicio c
        if(scjugadores.jugadores.containsKey(6)){
            System.out.println("El jugador con el numero 6 es: " + scjugadores.jugadores.get(6));
        }else {
            System.out.println("El jugaador con ese numero no existe");
        }

        // Ejercicio d
        System.out.println(scjugadores.jugadores.get(1) + " ha sido eliminado del equipo");
        scjugadores.jugadores.remove(1);

        for (Integer clave: scjugadores.jugadores.keySet()){
            System.out.println("jugador numero : " + clave + " - " + scjugadores.jugadores.get(clave) );
        }
        //Ejercicio e

        System.out.println("El jugador numero 1 es " + scjugadores.jugadores.get(1));

        // Ejercicio f
        if(scjugadores.jugadores.containsKey(1)){
            System.out.println("El jugador con el numero 1 es: " + scjugadores.jugadores.get(1));
        }else {
            System.out.println("El jugaador con ese numero no existe");
        }

        // Ejercicio g
        if(scjugadores.jugadores.containsKey(7)){
            System.out.println("El jugador con el numero 7 es: " + scjugadores.jugadores.get(7));
        }else {
            System.out.println("El jugaador con ese numero no existe");
        }
        // Ejercicio h

        System.out.println("¿Existe el jugador Courtois?: " + scjugadores.jugadores.containsValue("Courtois"));

        // Ejercicio i

        System.out.println("¿Existe el jugador Ramos?: " + scjugadores.jugadores.containsValue("Ramos"));

        // Ejercicio j

        System.out.println("Elementos eliminados");


        Iterator<Integer> it = scjugadores.jugadores.keySet().iterator();
        while (it.hasNext()){

            Integer clave = it.next();
            it.remove();

        }



        // ejercicio k

        System.out.println("El tamaño es de " + scjugadores.jugadores.size());

        // ejercicio l

        System.out.println("¿Esta vacio?" + scjugadores.jugadores.isEmpty());

    }


}
