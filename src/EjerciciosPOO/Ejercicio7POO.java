package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio7POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        System.out.println("Dime una palabra");
        palabra = sc.nextLine();
        int contadorletras = 0;
        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorNum = 0;
        int contadorDistintos = 0;

        for(int i = 0;i < palabra.length();i++){
            if(Character.isLetter(palabra.charAt(i))){
                contadorletras++;
            }if(Character.isUpperCase(palabra.charAt(i))){
                contadorMayus++;
            }if (Character.isLowerCase(palabra.charAt(i))){
                contadorMinus++;
            }if (Character.isDigit(palabra.charAt(i))){
                contadorNum++;
            }if(!Character.isLetterOrDigit(palabra.charAt(i))){
                contadorDistintos++;
            }

        }

        System.out.println("Tiene " + contadorletras + " letras");
        System.out.println("Tiene " + contadorMayus + " letras mayúsculas");
        System.out.println("Tiene " + contadorMinus + " letras minúsculas");
        System.out.println("Tiene " + contadorNum + " números");
        System.out.println("Tiene " + contadorDistintos + " alfanuméricos");
    }
}
