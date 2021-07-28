package EjerciciosPOO;

import java.util.Scanner;

public class Ejercicio15POO {
    public static void main(String[] args){
        menu();


    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio = radio();
        do{
            System.out.println("Dime una opcion: ");
            System.out.println("1.Circunferencia");
            System.out.println("2. Área");
            System.out.println("3. Volumen");
            System.out.println("4. Todas las anteriores");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println(circunferencia(radio));
            }else if (opcion == 2){
                System.out.println(area(radio));
            }else if(opcion == 3){
                System.out.println(volumen(radio));
            }else if(opcion == 4){
                System.out.println(circunferencia(radio));
                System.out.println(area(radio));
                System.out.println(volumen(radio));

            }

        }while(opcion != 0);

        return opcion;

    }

    public static double radio(){
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Dime el radio para calcular todas las opciones");
        radio = sc.nextDouble();

        return radio;
    }

    public static double circunferencia (double radio){

        double Longitud = 2*Math.PI*radio;

        return Longitud;
    }

    public static double area ( double radio){

        double area = Math.PI * Math.pow(radio,2);

        return area;
    }

    public static double volumen (double radio){
        double fraccion = (double)4/3;

        double volumen =fraccion*Math.PI*Math.pow(radio,3);

        return volumen;
    }
}
