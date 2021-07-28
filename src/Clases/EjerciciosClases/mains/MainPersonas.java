package Clases.EjerciciosClases.mains;



import Clases.EjerciciosClases.Clases.Personas;

import java.util.Scanner;

public class MainPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nombre;
        int Edad;
        String Sexo;
        String DNI;
        double Peso;
        double Altura;

        System.out.println("Introduce tu nombre: ");
        Nombre = sc.nextLine();

        System.out.println("Introduce tu DNI");
        DNI = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        Edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce tu sexo");
        Sexo = sc.nextLine();

        System.out.println("Introduce tu peso");
        Peso = sc.nextDouble();
        System.out.println("Introduce tu altura");
        Altura = sc.nextDouble();


        Personas persona1 = new Personas(Nombre,Edad,Sexo,DNI,Peso,Altura);

        sc.nextLine();
        System.out.println("Introduce tu nombre: ");
        Nombre = sc.nextLine();


        System.out.println("Introduce tu edad: ");
        Edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce tu sexo");
        Sexo = sc.nextLine();

        Personas persona2 = new Personas(Nombre,Edad,Sexo);
        Personas persona3 = new Personas();

        persona2.setPeso(70);
        persona2.setAltura(1.70);
        persona3.setNombre("Patricia");
        persona3.setEdad(59);
        persona3.setPeso(80);
        persona3.setAltura(1.60);
        persona3.setSexo("Mujer");

        for (int i = 0; i < 3; i++){
            if (i == 0){
                if (persona1.CalcularIMC() == -1){
                    System.out.println(persona1.getNombre() + " Esta por debajo del peso ideal");
                }else if (persona1.CalcularIMC() == 0){
                    System.out.println(persona1.getNombre() + " Esta en su peso ideal");
                }else if (persona1.CalcularIMC() == 1){
                    System.out.println(persona1.getNombre() + " Esta por encima de su peso ideal");
                }
                persona1.ComprobarSexo(persona1.getSexo().charAt(0));
                persona1.EsMayor();
                System.out.println(persona1.toString());
            }else if(i == 1){
                if (persona2.CalcularIMC() == -1){
                    System.out.println(persona1.getNombre() + " Esta por debajo del peso ideal");
                }else if (persona2.CalcularIMC() == 0){
                    System.out.println(persona1.getNombre() + " Esta en su peso ideal");
                }else if (persona2.CalcularIMC() == 1){
                    System.out.println(persona1.getNombre() + " Esta por encima de su peso ideal");
                }
                persona2.ComprobarSexo(persona2.getSexo().charAt(0));
                persona2.EsMayor();
                System.out.println(persona2.toString());
            }else if (i == 2){
                if (persona3.CalcularIMC() == -1){
                    System.out.println(persona1.getNombre() + " Esta por debajo del peso ideal");
                }else if (persona3.CalcularIMC() == 0){
                    System.out.println(persona1.getNombre() + " Esta en su peso ideal");
                }else if (persona3.CalcularIMC() == 1){
                    System.out.println(persona1.getNombre() + " Esta por encima de su peso ideal");
                }
                persona2.ComprobarSexo(persona2.getSexo().charAt(0));
                persona3.EsMayor();
                System.out.println(persona3.toString());
            }
        }




    }
}
