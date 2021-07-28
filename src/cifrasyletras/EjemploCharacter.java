package cifrasyletras;

import java.util.Scanner;

public class EjemploCharacter {
    public static void main(String[] args) {
       // -	Declaraciones
        //char c; //tipo primitivo
        char caracterPrimitivo = 'c';
        // Character C; //Clase - objeto
        Character caracterObjeto = 'A';
        Character caracterObjeto2 = '3';

      //  -	Comprobaciones
      //  static boolean isLowerCase(char ch)
        boolean comprobacion = Character.isLowerCase(caracterPrimitivo);
        System.out.println("¿¿El carater primitivo es minúsculas?? "+comprobacion);
        boolean comprobacion2 = Character.isLowerCase(caracterObjeto);
        System.out.println("¿¿El carater objeto es minúsculas?? "+comprobacion2);

      //  static boolean isUpperCase(char ch)
        comprobacion = Character.isUpperCase(caracterPrimitivo);
        System.out.println("¿¿El carater primitivo es mayúsculas?? "+comprobacion);
        comprobacion2 = Character.isUpperCase(caracterObjeto);
        System.out.println("¿¿El carater objeto es mayúsculas?? "+comprobacion2);

      //  static boolean isDigit(char ch)
        comprobacion = Character.isDigit(caracterPrimitivo);
        System.out.println("¿¿El carater primitivo es un número?? "+comprobacion);
        comprobacion2 = Character.isDigit(caracterObjeto2);
        System.out.println("¿¿El carater objeto 2 es un número?? "+comprobacion2);

      //  static boolean isLetter(char ch)
        comprobacion = Character.isLetter(caracterPrimitivo);
        System.out.println("¿¿El carater primitivo es una letra?? "+comprobacion);
        comprobacion2 = Character.isLetter(caracterObjeto2);
        System.out.println("¿¿El carater objeto 2 es una letra?? "+comprobacion2);

      //  static boolean isSpaceChar(char ch)
        comprobacion = Character.isSpaceChar(caracterPrimitivo);
        System.out.println("¿¿El carater primitivo es un espacio?? "+comprobacion);
        comprobacion2 = Character.isSpaceChar(' ');
        System.out.println("¿¿El carater es un espacio?? "+comprobacion2);

      //  static Boolean isLetterOrDigit (char ch);
        comprobacion = Character.isLetterOrDigit(caracterPrimitivo);
        System.out.println("¿¿El carater primitivo es una letra o un número?? "+comprobacion);
        comprobacion2 = Character.isLetterOrDigit(caracterObjeto2);
        System.out.println("¿¿El carater objeto 2 es una letra o un número?? "+comprobacion2);
        comprobacion2 = Character.isLetterOrDigit('@');
        System.out.println("¿¿El carater es una letra o un número?? "+comprobacion2);

      //  -	Transformación de caracteres
        if (!Character.isDigit(caracterPrimitivo)) {
            //  static char toLowerCase(char ch)
            System.out.println("El carater "+caracterObjeto+" en minúscula "+Character.toLowerCase(caracterObjeto));
            //  static char toUpperCase(char ch)
            System.out.println("El carater "+caracterPrimitivo+" en mayúscula "+Character.toUpperCase(caracterPrimitivo));
        } else {
            System.out.println("Un núnmero no puede convertirse en mayúsculas ni en minúsculas");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce una letra: ");
        String cadena = sc.nextLine();
        char c = cadena.charAt(0);
        if (Character.isDigit(c)) {
            System.out.println("El caracter "+c+" introducido es un número");
        } else {
            System.out.println("El caracter "+c+" introducido es una letra");
        }



    }
}
