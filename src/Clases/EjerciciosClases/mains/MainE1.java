package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjercicioE1;

public class MainE1 {
    public static void main(String[] args){

        for (int i = 0; i < 19; i++){
            System.out.println("El punto " + i + " tiene las coordenadas" + " (" + EjercicioE1.creaPuntoAleatorio().getX() + ", " + EjercicioE1.creaPuntoAleatorio().getY() + ")" );
        }

    }
}
