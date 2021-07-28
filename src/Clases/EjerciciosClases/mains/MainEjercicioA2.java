package Clases.EjerciciosClases.mains;



import Clases.EjerciciosClases.Clases.EjercicioA2;

import java.util.Scanner;

public class MainEjercicioA2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String dni;
        String nombre;
        String apellidos;
        int edad;
        int contador= 0;

        EjercicioA2 persona1 = new EjercicioA2();
        EjercicioA2 persona2 = new EjercicioA2();


        do{
            System.out.println("Introduce tus datos pulsa 0 para salir: ");
            System.out.println("Dime tu dni: ");
            dni= sc.nextLine();

            System.out.println("Dime tu nombre: ");
            nombre= sc.nextLine();

            System.out.println("Dime tus apellidos: ");
            apellidos= sc.nextLine();

            System.out.println("Dime tu edad: ");
            edad = sc.nextInt();

            sc.nextLine();
            if(contador == 0){
                persona1.setDni(dni);
                persona1.setnombre(nombre);
                persona1.setApellidos(apellidos);
                persona1.setEdad(edad);
            }else if(contador == 1){
                persona2.setDni(dni);
                persona2.setnombre(nombre);
                persona2.setApellidos(apellidos);
                persona2.setEdad(edad);
            }
            contador++;
        }while(contador < 2);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println("hay " + EjercicioA2.getNumeropersonas() + " personas");

        for(int i = 1; i < 3;i++){
            if(i == 1){
                if(persona1.getEdad() >= 18){
                    System.out.println(persona1 + " es mayor de edad");
                }else{
                    System.out.println(persona1 + " no es mayor de edad");
                }
            }else if(i == 2){
                if(persona1.getEdad() >= 18){
                    System.out.println(persona2 + " es mayor de edad");
                }else{
                    System.out.println(persona2 + " no es mayor de edad");
                }
            }
        }




    }
}
