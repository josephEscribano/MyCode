package EjerciciosPOO;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16POO {
    public static void main(String[] args){
        menu();

    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int opcion;

        do{
            System.out.println("1-¿Cuánto es 3 elevado a 3?");
            System.out.println("2-¿Cuánto vale la constante matemáticae, uno de los números irracionales más impotantes?");
            System.out.println("3-¿Cuánto vale π(Pi), que es la relación entre longitud de una circunferencia y su diámetro en geometría euclidiana?");
            System.out.println("4-¿Cuál es el seno de un ángulo de 90º?");
            System.out.println("5-¿Cuánto vale la raíz cuadrada de 16?");
            System.out.println("6-Genera un numero aleatorio con JAVA");
            System.out.println("7-Dados los numeros 13 y 69, indicar cuál es el menor y cual el mayor");
            opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println("3 elevado a 3 es igual a: " + Math.pow(3,3));
            }else if (opcion == 2){
                System.out.println("El valor de e es: "+Math.E);
            }else if (opcion == 3){
                System.out.println("Pi es equivalente a: " + Math.PI);
            }else if (opcion == 4){
                System.out.println("El seno de un ángulo de 90ª es: " + Math.sin(90));
            }else if (opcion == 5){
                System.out.println("La raíz cuadrada de 16 es : " + Math.sqrt(16));
            }else if(opcion == 6){
                System.out.println("El numero aleatorio que ha salido es " + aleatorio.nextInt());
            }else if (opcion == 7){
                System.out.println("El mayor de los numeros 13 y 69 es " + Math.max(13,69) + " y el menor es " + Math.min(13,69));
            }
        }while (opcion != 0);

        return opcion;
    }
}
