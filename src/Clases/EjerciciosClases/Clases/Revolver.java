package Clases.EjerciciosClases.Clases;

import java.util.Random;

public class Revolver {
    Random rand = new Random();
    private int PosicionActual;
    private int PosicionBala;


    //Constructor

    public Revolver(){
        this.PosicionActual = rand.nextInt(7)+1;
        this.PosicionBala = rand.nextInt(7)+1;
    }

    //getter

    public int getPosicionActual(){
        return PosicionActual;
    }

    public int getPosicionBala(){
        return PosicionBala;
    }

    // setter

    public void setPosicionActual(int PosicionActual){
        PosicionActual = PosicionActual;
    }

    public void setPosicionBala(int posicionBala) {
        PosicionBala = posicionBala;
    }

    //Metodos
    public void SiguienteBala(){
        this.PosicionActual = rand.nextInt(7)+1;

    }

    public boolean Disparar(){

        boolean exito = false;
        if (this.PosicionActual == this.PosicionBala){
            exito = true;
            return exito;
        }else{
            exito = false;
            return exito;
        }


    }



    // Imprimir


    @Override
    public String toString() {
        return "Revolver{" +
                "PosicionActual=" + PosicionActual +
                ", PosicionBala=" + PosicionBala +
                '}';
    }
}
