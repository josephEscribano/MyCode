package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.EjerciciosE2;

public class MainE2 {
    public static void main(String[] args){

        EjerciciosE2 persona1 = new EjerciciosE2("0228434G","joseph","escribano",25);

        persona1.Imprime();
        if (persona1.esMenor()){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("es mayor de edad");
        }
    }
}
