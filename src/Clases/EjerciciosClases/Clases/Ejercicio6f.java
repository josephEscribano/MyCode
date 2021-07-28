package Clases.EjerciciosClases.Clases;

import java.util.Scanner;

public class Ejercicio6f {
    private static boolean interruptorGeneral;
    private boolean interruptorBombilla;

    // constructor

    public Ejercicio6f (){
        this.interruptorGeneral = false;
        interruptorBombilla = false;
    }


    //getter


    public static boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }

    public boolean isInterruptorBombilla() {
        return interruptorBombilla;
    }

    // setter

    public void  setInterruptorBombilla(boolean interruptorBombilla){
        this.interruptorBombilla = interruptorBombilla;
    }

    //metodos

    public static void ApagaroEncenderGeneral(int opcion){
        Scanner sc = new Scanner(System.in);

        if (opcion == 1){
            interruptorGeneral = true;
        }else if (opcion == 2){
            interruptorGeneral = false;
        }

    }

    public void ApagaroEncenderBombilla(int opcion){
        Scanner sc = new Scanner(System.in);

        if (opcion == 3 && interruptorGeneral == true){
            this.setInterruptorBombilla(true);
        }else{
            System.out.println("No se ha podido encender la bombilla porque el interruptor general esta apagado, enciendelo para poder encender la bombilla");
        }

        if (opcion == 4){
            this.setInterruptorBombilla(false);
            System.out.println("He apagado la bombilla");
        }

    }

    public boolean estaEncendida(){
        boolean estaEncendida = true;
        if (this.isInterruptorBombilla() == true && isInterruptorGeneral() == true){
            return estaEncendida = true;
        }else{
            return estaEncendida = false;
        }
    }


}
