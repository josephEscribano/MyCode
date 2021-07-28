package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio6f;

import java.util.Scanner;

public class Main6f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int numeroBombilla;
        int contadorEncendidas = 0;
        Ejercicio6f bombillas[] = new Ejercicio6f[20];

        for (int i = 0; i < bombillas.length; i++){
            bombillas[i] = new Ejercicio6f();
        }
        do {
            System.out.println("Dime que quieres hacer: ");
            System.out.println("1- Activar el interruptor general ");
            System.out.println("2- Desactivar el interruptor general");
            System.out.println("3- Encender una bombilla");
            System.out.println("4- Apagar una bombilla");
            System.out.println("5- ¿Cuantas bombillas estan encendidas?");
            System.out.println("6- Estado de las bombillas");
            System.out.println("7- Estado del interruptor general");
            System.out.println("0- Si quieres salir");

            opcion = sc.nextInt();

            if (opcion == 1){
                Ejercicio6f.ApagaroEncenderGeneral(opcion);
                System.out.println("He encendido el interruptor general");
            }else if (opcion == 2){
                Ejercicio6f.ApagaroEncenderGeneral(opcion);
                System.out.println("He apagado el interruptor general");
            }else if (opcion == 3){
                System.out.println("Dime que bombilla quieres encender");
                numeroBombilla = sc.nextInt();
                bombillas[numeroBombilla].ApagaroEncenderBombilla(opcion);
            }else if(opcion == 4){
                System.out.println("Dime que bombilla quieres apagar");
                numeroBombilla = sc.nextInt();
                bombillas[numeroBombilla].ApagaroEncenderBombilla(opcion);
            }else if(opcion == 5){
                for (int i = 0; i < bombillas.length; i++){
                    if (bombillas[i].estaEncendida() == true){
                        contadorEncendidas++;
                    }
                }

                System.out.println("Hay " + contadorEncendidas + " bombillas encendidas");
                contadorEncendidas = 0;
            }else if(opcion == 6){
                for (int i = 0; i < bombillas.length; i++){
                    if (bombillas[i].estaEncendida() == true){
                        System.out.println("La bombilla " + i + " esta encendida");
                    }else{
                        System.out.println("La bombilla " + i + " esta apagada");
                    }
                }
            }else if (opcion == 7){
                if (Ejercicio6f.isInterruptorGeneral() == true){
                    System.out.println("El interruptor general esta encendido");
                }else{
                    System.out.println("El interruptor general esta apagado");
                }
            }

        }while(opcion != 0);
    }
}
