package Clases.EjerciciosClases.Service;


import Clases.EjerciciosClases.Clases.serie;
import Clases.EjerciciosClases.Clases.videojuego;

public class VideojuegoService {


    public static int compareTo(Object a){
        videojuego ref = (videojuego) a;
        serie ref2 = (serie) a;
        int max = 0;
        if (max < ref.getHoras()){
            max = ref.getHoras();
            max = 0;
        }

        if (max < ref2.getTemporadas()){
            max = ref2.getTemporadas();
            max = 0;
        }

        return max;
    }
}
