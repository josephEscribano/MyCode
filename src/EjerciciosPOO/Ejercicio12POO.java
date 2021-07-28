package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio12POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre y tus apellidos");
        String NA = sc.nextLine();

        String firstletter = "";
        String entero = "";
        String[] nombrecompleto = NA.split(" ");
        int contador = 0;
        for (String aux: nombrecompleto){
            firstletter = aux.substring(0,1);
            firstletter = firstletter.toUpperCase();
            entero = aux.substring(1,aux.length());
            aux = firstletter + entero;
            nombrecompleto[contador] = aux;
            contador++;
            if(nombrecompleto.length > 3 && contador > 3){
                System.out.println("El nombre completo es: " + nombrecompleto[0] + " " + nombrecompleto[1] + " " + nombrecompleto[2] + " " + nombrecompleto[3]);
            }else if(nombrecompleto.length < 3 && contador > 2){
                System.out.println("El nombre completo es: " + nombrecompleto[0] + " " + nombrecompleto[1] + " " + nombrecompleto[2]);
            }
        }


        }





    }

