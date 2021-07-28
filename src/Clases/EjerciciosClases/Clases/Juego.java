package Clases.EjerciciosClases.Clases;

public class Juego {

    public static boolean FinDelJuego(Jugador jugador){
        boolean fin = false;
        if (jugador.isSalud()){
           fin = false;
           return fin;
        }else{
            fin = true;
            return fin;
        }
    }

    public static void Ronda(Jugador jugadores[]){
        Revolver revolver = new Revolver();
        for (int i = 0; i < 6; i++){
            jugadores[i].Ejecutar(revolver);
            revolver.SiguienteBala();
            if (FinDelJuego(jugadores[i])){
                i = jugadores.length;
                System.out.println("Gracias por jugar, vuelve cuando quieras...ahh no que estas muerto");
            }
        }



    }
}
