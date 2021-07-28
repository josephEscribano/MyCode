package com.company;

public class Main {

    public static void main(String[] args) {
        String cad1 = "PUERTA";
        String cad2 = "ALMACEN";
        int prueba = cad2.compareTo(cad1);
        System.out.println(prueba);

        if(cad1.compareTo(cad2) < 0){
            System.out.println("Orden alfabético: " + cad1 + cad2);


        }else if (cad1.compareTo(cad2) > 0){
            System.out.println("Orden alfabético: " + cad2 + cad1);

        }else{
            System.out.println("son iguales");

        }
    }
}
