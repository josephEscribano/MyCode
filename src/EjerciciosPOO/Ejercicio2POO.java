package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio2POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        char c;
        do{
            System.out.println("Introduce caracteres");
            opcion = sc.nextLine();
            c = opcion.charAt(0);
            if(!Character.isSpaceChar(c)){
                if(Character.isLowerCase(c)){
                    System.out.println("La opcion que has introducido es una letra minuscula");
                }else if(Character.isUpperCase(c)){
                    System.out.println("La opcion que has introducido es una letra mayúscula");
                }else if(Character.isDigit(c)){
                    System.out.println("La opcion que has introducido es un numero");
                }else{
                    System.out.println("La opcion introducida es otro caracter");
                }
            }
        }while(!Character.isSpaceChar(c));

    }
}
