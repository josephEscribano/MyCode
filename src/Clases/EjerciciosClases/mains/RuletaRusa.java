package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Juego;
import Clases.EjerciciosClases.Clases.Jugador;

public class RuletaRusa {
    public static void main(String[] args) {
        Jugador Jugadores[] = new Jugador[6];
        int contador = 1;
        boolean opcion = false;
        for(int i = 0; i < Jugadores.length; i++){
            Jugadores[i] = new Jugador(contador);
            contador++;
        }

        do{

            Juego.Ronda(Jugadores);
            for (int i = 0; i < Jugadores.length; i++){
                if (Juego.FinDelJuego(Jugadores[i])){
                    opcion = true;
                }
            }
        }while (opcion == false);




    }
}
