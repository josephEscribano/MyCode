package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.serie;
import Clases.EjerciciosClases.Clases.videojuego;
import Clases.EjerciciosClases.Service.VideojuegoService;

public class Videoclub {
    public static void main(String[] args) {
        int contadorEntregados = 0;
        int max = 0;
        int aux = 0;
        videojuego videojuego[] = new videojuego[3];
        serie serie[] = new serie[3];

        videojuego[0] = new videojuego();
        videojuego[1] = new videojuego("DMC",20);
        videojuego[2] = new videojuego("The Witcher",40, "Open World", "CDProyect");

        serie[0] = new serie();
        serie[1] = new serie("Juego de tronos","PEPE");
        serie[2] = new serie("Sobrenatural", 15,"Terror","Erick Kripcle y Sara Gamble");

        for (int i = 0; i < 2; i++){
            videojuego[i].Entregar();
            contadorEntregados++;
            videojuego[i].Devolver();
            serie[i].Entregar();
            contadorEntregados++;
            serie[i].Devolver();
            if (i == 1){
                System.out.println("Se han entregado " + contadorEntregados + " articulos");
            }
        }


        for (int i = 0; i < 3; i++){
            if(max < videojuego[i].compareTo(videojuego[i])){
                max = videojuego[i].compareTo(videojuego[i]);
                aux = i;
            }
            if (i == 2){
                System.out.println(videojuego[aux].toString());
            }
        }

        for (int i = 0; i < 3; i++){
            if(max < serie[i].compareTo(serie[i])){
                max = serie[i].compareTo(serie[i]);
                aux = i;
            }
            if (i == 2){
                System.out.println(serie[aux].toString());
            }
        }

    }


}
