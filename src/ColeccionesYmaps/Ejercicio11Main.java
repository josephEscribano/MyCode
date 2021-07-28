package ColeccionesYmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Ejercicio11Jugador> jugadores = new HashMap<>();

        jugadores.put("Ramos",new Ejercicio11Jugador("Sergio Ramos",4,PoisionesEjercicio11.DEFENSA.name()));
        jugadores.put("El Muro",new Ejercicio11Jugador("Courtois",5,PoisionesEjercicio11.PORTERO.name()));
        jugadores.put("pepe2",new Ejercicio11Jugador("Lucas Vazquez",7,PoisionesEjercicio11.CENTROCAMPISTA.name()));
        jugadores.put("pep3",new Ejercicio11Jugador("Karim Benzema",6,PoisionesEjercicio11.DELANTERO.name()));
        jugadores.put("pepe4",new Ejercicio11Jugador("Isco",10,PoisionesEjercicio11.CENTROCAMPISTA.name()));
        jugadores.put("Director",new Ejercicio11Jugador("Modric",8,PoisionesEjercicio11.CENTROCAMPISTA.name()));

        int opcion = 0;

        do {
            System.out.println("Elije una opcion: ");
            System.out.println("1- Mostarar a los jugadores");
            System.out.println("2- Mostrar segun la posicion");
            System.out.println("3- Exite un elemento");
            opcion = sc.nextInt();
            if (opcion == 1){
                Ejercicio11service.MostrarMap(jugadores);
            }else if (opcion == 2){
                Ejercicio11service.SegunPosicion(jugadores,"PORTERO");
            }else if (opcion == 3){
                Ejercicio11Jugador nuevo = new Ejercicio11Jugador("Sergio Ramos",4,PoisionesEjercicio11.DEFENSA.name());
                System.out.println("nuevo: " + jugadores.containsValue(nuevo));
                Ejercicio11Jugador nuevo2 = new Ejercicio11Jugador("Sergio Ramos",4,PoisionesEjercicio11.DEFENSA.name());
                jugadores.put("Ramos",nuevo2);
                System.out.println("nuevo2: " + jugadores.containsValue(nuevo2));
                Ejercicio11service.MostrarMap(jugadores);
            }
        }while (opcion != 0);

    }
}
