package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10JugadoresService {
    HashMap<Integer,String> jugadores = new HashMap<>();

    public void AñadirJugadores(){
        Scanner sc = new Scanner(System.in);
        int Numero = 0;
        String Nombre = "";
        boolean opcion = false;
        do {
            System.out.println("Dime el nombre del jugador");
            Nombre = sc.nextLine();
            System.out.println("Dime el numero del jugador");
            Numero = sc.nextInt();
            sc.nextLine();
            JugadoresEjercicio10 jugador1 = new JugadoresEjercicio10(Nombre,Numero);
            jugadores.put(jugador1.getNumero(),jugador1.getNombre());
            System.out.println("¿Quieres añadir otro jugador?");
            if (sc.nextLine().equals("si")){
                opcion = true;
            }else{
                opcion = false;
            }


        }while (opcion != false);

    }

}
