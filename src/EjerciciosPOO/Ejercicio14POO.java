package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio14POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor X: ");
        int x = sc.nextInt();

        System.out.println("Dime el valor y: ");
        int y = sc.nextInt();

        System.out.println("Dime el valor z: ");
        int z = sc.nextInt();

        Pitagoras(x,y,z);
    }

    public static void Pitagoras(int x, int y, int z){

        if(Math.pow(x,2) + Math.pow(y,2) == Math.pow(z,2)){
            System.out.println("el resultado es el mismo");
        }else{
            System.out.println("No son iguales");
        }
    }


}
