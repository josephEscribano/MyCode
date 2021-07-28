package cifrasyletras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejemplo4Math {

    public static void main(String[] args) {
        double num1 = -10.570;
        double num2 = 4.10;
        int num3 = 10;
        int num4 = 38;

        System.out.println ("El valor absoluto de "+num1+" es "+ Math.abs(num1));
        System.out.println ("El máximo de "+num3+" y "+num4+" es "+Math.max (num3, num4));
        System.out.println ("El mínimo de "+num3+" y "+num4+" es "+ Math.min (num3, num4));
        System.out.println ("El valor de e es "+ Math.E);
        System.out.println ("exp ("+num3+") es "+Math.exp (num3));
        System.out.println ("log ("+num4+") es "+Math.log (num4));
        System.out.println (num2+" elevado a "+num3+" es "+Math.pow (num2, num3));
        System.out.println ("La raiz cuadrada de ("+num2+") es "+Math.sqrt (num2));


    }
}
