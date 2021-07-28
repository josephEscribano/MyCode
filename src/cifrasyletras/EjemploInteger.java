package cifrasyletras;

import java.util.Scanner;

public class EjemploInteger {
    public static void main( String args[] ) {
        Scanner sc = new Scanner(System.in);
        //instanciar
        int variableInt = 20; //variable tipo int con valor 20
        Integer variableInteger = new Integer(5); //creamos objeto Integer con valor 5
        Integer variableInteger2 = 10;
        System.out.println("Variable int primitiva: "+variableInt);
        System.out.println("Variable objeto Integer: "+variableInteger);
        System.out.println("Variable objeto 2 Integer: "+variableInteger2);

        //-	Conversión de Objeto a tipo primitivo:
        int numPrimitivo = variableInteger2.intValue();
        //conversión autoUnBoxing
        int numPrimitivo2 = variableInteger2;
        //-	Conversión de tipo primitivo a Objeto:
        Integer numObjeto = Integer.valueOf(numPrimitivo);
        //de forma automática: autoboxing
        Integer numObjeto2 = numPrimitivo;
        System.out.println("Valor de la variable numObjeto2: "+numObjeto2);

        //conversión de String a int o Integer
        // para convertir un String a un Integer o int usamos ValueOf o ParseInt
        String numeroS = "19";
        Integer variableObjeto = Integer.valueOf(numeroS); //lo convertimos a Integer
        int variableInt2 = Integer.parseInt(numeroS); //lo convertimos a int
        System.out.println("Variable String conversión a int primitiva: "+variableInt2);
        System.out.println("Variable String conversión a objeto Integer: "+variableObjeto);

        //conversión de int o Integer a String
        String numeroS2 = Integer.toString(variableInt);
        String numeroS3 = Integer.toString(variableInteger);
        System.out.println("Variable int conversión a String: "+numeroS2);
        System.out.println("Variable Integer conversión a String: "+numeroS3);

        if (variableInteger.equals(variableInt)) {
            System.out.println("Los dos objetos contienen lo mismo.");
        } else {
            System.out.println("Los dos objetos no contienen lo mismo.");
        }

//Pedimos un número por pantalla al usuario, lo recogemos como String y calculamos
        System.out.println("\nIntroduce un número: ");
        String cad = sc.nextLine();
        int var = Integer.parseInt(cad);
        System.out.println("\nEl cuadrado del número es: "+ var*var);


    }
}
