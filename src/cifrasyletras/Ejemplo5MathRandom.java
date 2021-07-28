package cifrasyletras;

import java.util.Random;

public class Ejemplo5MathRandom {

    public static void main(String[] args) {
       //random devuelve un número aleatorio entre 0.0 y 1.0
        /*
        double aleatorio = Math.random();
        System.out.println("Random Math.random(); --->>> " + aleatorio);
        //como es un número entre 0.0 y 1.0,
        // ¿cómo hacemos para que muestre un número aleatorio entre dos números,
        //por ejemplo, entre 0 y 20, pues multiplicamos el random obtenido por 20
        System.out.println("Número aleatorio entre 0 y 20");
        double aleatorioEntre0y20 = aleatorio * 20;
        System.out.println(aleatorioEntre0y20);
        //¿y si queremos entre otros dos números, siendo el primero distinto de cero?
        //pues multiplicamos el random obtenido por 20 y, le sumamos 10
        System.out.println("Número aleatorio entre 10 y 20");
        double aleatorioEntre10y20 = (aleatorio* 20) + 10;
        System.out.println(aleatorioEntre10y20);
        //comoo es difícil que sea 20.0, para que también pueda salir el 20,
        //ponemos 21
        System.out.println("Número aleatorio entre 10 y 20 (incluído)");
        double aleatorioEntre10y20Incluido = (aleatorio* 21) + 10;
        System.out.println(aleatorioEntre10y20Incluido);
        //¿Y si queremos que se muestre como número entero?
        //podemos hacer un cast
        int aleatorioEntero = (int)(aleatorio*21)+10;
        //podemos redondear
        System.out.println("Número aleatorio INT entre 10 y 20 (incluído)");
        System.out.println(aleatorioEntero);
*/
        //Hay otra forma y es utilizando la clase util.Random
        Random aleatorioRandom = new Random(); //creas el objeto

        int aleatorioInt = aleatorioRandom.nextInt(21); //devuelve número entero aleatorio entre 0 y 20
        System.out.println(aleatorioInt);
        double aleatorioD=aleatorioRandom.nextDouble();//devuelve número doble aleatorio entre 0,0 y 1,0
        System.out.println(aleatorioD);
        int aleatorioInt2 = aleatorioRandom.nextInt(); //devuelve número entero aleatorio en todo su rango
        System.out.println(aleatorioInt2);
        //devuelve número entero aleatorio entre 1 y 20
        int aleatorioInt3 = aleatorioRandom.nextInt(20) +1;
        System.out.println(aleatorioInt3);




    }
}
