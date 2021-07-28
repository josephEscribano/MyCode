package Clases.EjerciciosClases.mains;


import Clases.EjerciciosClases.Clases.Ejercicio2f;

import java.util.Scanner;

public class Main2f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int contador = 0;

        Ejercicio2f raton1 = new Ejercicio2f("","","","",0.0);
        Ejercicio2f raton2 = new Ejercicio2f("","","","",0.0);
        Ejercicio2f raton3 = new Ejercicio2f("","","","",0.0);
        Ejercicio2f raton4 = new Ejercicio2f("","","","",0.0);
        do {
            System.out.println("¿Quieres seguir introduciendo valores? Pulsa 0 para salir, sino pulsa 1: ");
            opcion = sc.nextInt();

            if(opcion != 0){
                System.out.println("¿Cuántos ratones quieres modificar?");
                contador = sc.nextInt();

                for (int i = 0; i < contador;i++){
                    if (i == 0){
                        while (raton1.getMarca().equals("") || raton1.getMarca().equals(null) ){
                            System.err.println("Necesito que introduzcas una marca");
                            sc.nextLine();
                            System.out.println("Dime la marca: ");
                            raton1.setMarca(sc.nextLine());
                        }
                        while (raton1.getModelo().equals("") || raton1.getModelo().equals(null)){
                            System.err.println("Necesito que introduzcas un modelo");
                            System.out.println("Dime el modelo: ");
                            raton1.setModelo(sc.nextLine());
                        }
                        System.out.println("Dime el tipo: ");
                        raton2.setTipo(sc.nextLine());
                        while (!raton1.getConexion().equals("inalambrico") && !raton1.getConexion().equals("USB") && !raton1.getConexion().equals("PS/2")){
                            System.err.println("El valor introducido no es correcto");
                            System.out.println("Dime el tipo de conexion ");
                            raton1.setConexion(sc.nextLine());
                        }
                        while (raton1.getPrecio() <= 0){
                            System.err.println("El precio no es valido");
                            System.out.println("Dime el precio");
                            raton1.setPrecio(sc.nextDouble());
                        }
                    }if(i == 1){
                        while (raton2.getMarca().equals("") || raton2.getMarca().equals(null) ){
                            System.err.println("Necesito que introduzcas una marca");
                            sc.nextLine();
                            System.out.println("Dime la marca: ");
                            raton2.setMarca(sc.nextLine());
                        }
                        while (raton2.getModelo().equals("") || raton2.getModelo().equals(null)){
                            System.err.println("Necesito que introduzcas un modelo");
                            System.out.println("Dime el modelo: ");
                            raton2.setModelo(sc.nextLine());
                            sc.nextLine();
                        }
                        System.out.println("Dime el tipo: ");
                        raton2.setTipo(sc.nextLine());
                        sc.nextLine();
                        while (!raton2.getConexion().equals("inalambrico") || !raton2.getConexion().equals("USB") || !raton2.getConexion().equals("PS/2")){
                            System.err.println("El valor introducido no es correcto");
                            System.out.println("Dime el tipo de conexion ");
                            raton2.setConexion(sc.nextLine());
                            sc.nextLine();
                        }
                        while (raton2.getPrecio() <= 0){
                            System.err.println("El precio no es valido");
                            System.out.println("Dime el precio");
                            raton2.setPrecio(sc.nextDouble());
                        }

                    }if (i == 2){
                        while (raton3.getMarca().equals("") || raton3.getMarca().equals(null) ){
                            System.err.println("Necesito que introduzcas una marca");
                            sc.nextLine();
                            System.out.println("Dime la marca: ");
                            raton3.setMarca(sc.nextLine());
                        }
                        while (raton3.getModelo().equals("") || raton3.getModelo().equals(null)){
                            System.err.println("Necesito que introduzcas un modelo");
                            System.out.println("Dime el modelo: ");
                            raton3.setModelo(sc.nextLine());
                            sc.nextLine();
                        }
                        System.out.println("Dime el tipo: ");
                        raton3.setTipo(sc.nextLine());
                        sc.nextLine();
                        while (!raton3.getConexion().equals("inalambrico") || !raton3.getConexion().equals("USB") || !raton3.getConexion().equals("PS/2")){
                            System.err.println("El valor introducido no es correcto");
                            System.out.println("Dime el tipo de conexion ");
                            raton3.setConexion(sc.nextLine());
                            sc.nextLine();
                        }
                        while (raton3.getPrecio() <= 0){
                            System.err.println("El precio no es valido");
                            System.out.println("Dime el precio");
                            raton3.setPrecio(sc.nextDouble());
                        }
                    }if(i == 3){
                        while (raton4.getMarca().equals("") || raton4.getMarca().equals(null) ){
                            System.err.println("Necesito que introduzcas una marca");
                            sc.nextLine();
                            System.out.println("Dime la marca: ");
                            raton4.setMarca(sc.nextLine());
                        }
                        while (raton4.getModelo().equals("") || raton4.getModelo().equals(null)){
                            System.err.println("Necesito que introduzcas un modelo");
                            System.out.println("Dime el modelo: ");
                            raton4.setModelo(sc.nextLine());
                            sc.nextLine();
                        }
                        System.out.println("Dime el tipo: ");
                        raton4.setTipo(sc.nextLine());
                        sc.nextLine();
                        while (!raton4.getConexion().equals("inalambrico") || !raton4.getConexion().equals("USB") || !raton4.getConexion().equals("PS/2")){
                            System.err.println("El valor introducido no es correcto");
                            System.out.println("Dime el tipo de conexion ");
                            raton4.setConexion(sc.nextLine());
                            sc.nextLine();
                        }
                        while (raton4.getPrecio() <= 0){
                            System.err.println("El precio no es valido");
                            System.out.println("Dime el precio");
                            raton4.setPrecio(sc.nextDouble());
                        }
                    }
                }
            }
        }while(opcion != 0);

        raton1.imprimir();
        raton2.imprimir();
        raton3.imprimir();
        raton4.imprimir();



    }
}
