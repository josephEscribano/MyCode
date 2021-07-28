package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteServicios {
    private ArrayList<Cantante> Cantantes = new ArrayList<Cantante>();



    public void AñadirCantante(){
        Scanner sc = new Scanner(System.in);
        String Nombre;
        String  titulo;
        int numeroVentas;
        String respuesta;
        boolean opcion = false;
        int contador = 0;
        System.out.println("Introduce el nombre del cantante");
        Nombre = sc.nextLine();
        System.out.println("Introduce el titulo del disco");
        titulo = sc.nextLine();
        System.out.println("Introduce el numero de discos vendidos");
        numeroVentas = sc.nextInt();
        sc.nextLine();
        this.Cantantes.add(new Cantante(Nombre,titulo,numeroVentas));

        do {
            System.out.println("¿Quieres añadir otro disco?");
            if (sc.nextLine().equals("si")){
                opcion = true;
            }else{
                opcion = false;
            }

            if (opcion){
                System.out.println("Introduce el titulo del disco");
                titulo = sc.nextLine();
                System.out.println("Introduce el numero de discos vendidos");
                numeroVentas = sc.nextInt();
                sc.nextLine();

                this.Cantantes.get(contador).getDiscografia().add(new Disco(titulo,numeroVentas));
            }
        }while(opcion != false);
        contador++;

    }

    public void EliminarCantante(){
        Scanner sc = new Scanner(System.in);
        String Nombre;
        System.out.println("Dime el nombre del cantante o grupo que quieres elimnar");
        Nombre = sc.nextLine();
        int contador = 0;
        Iterator<Cantante> it = Cantantes.iterator();
        while (it.hasNext()){
            Cantante t = it.next();
            if (t.getNombre().equals(Nombre)){
                System.out.println("Se a eliminado el cantante: " + t.getNombre());
                System.out.println(t.getDiscografia());
                it.remove();
                contador++;
            }else if (!it.hasNext() && contador == 0){
                System.out.println("No existe el cantante o grupo");
            }
        }

    }

    public void DiscoMasVendido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un cantante: ");
        String cantante = sc.nextLine();

        System.out.println("Cantante " + cantante);
        boolean encontrado = false;
        int aux = 0;
        for (int i = 0 ; i < Cantantes.size(); i++){
            if (Cantantes.get(i).getNombre().equals(cantante)){
                aux = i;
                i = Cantantes.size();
                encontrado = true;

            }
        }
        if (encontrado) {
            Collections.sort(Cantantes.get(aux).getDiscografia());
            System.out.println("Disco mas vendido: " + Cantantes.get(aux).getDiscografia().get(0).getTitulo() + " numero de discos vendidos: " + Cantantes.get(aux).getDiscografia().get(0).getNumeroVendidos() );
        } else {
            System.out.println("No existe el cantante que has introducido");
        }


    }

    public void MostrarDiscosYcantantes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el cantante del que quieres conocer los discos");
        String cantante = sc.nextLine();

        System.out.println("Cantante: " + cantante);
        boolean encontrado = false;
        int aux = 0;
        for (int i = 0 ; i < Cantantes.size(); i++){
            if (Cantantes.get(i).getNombre().equals(cantante)){
                aux = i;
                i = Cantantes.size();
                encontrado = true;

            }
        }
        if (encontrado) {
            for(int i = 0; i < Cantantes.get(aux).getDiscografia().size();i++){
                System.out.println(Cantantes.get(aux).getDiscografia().get(i).getTitulo() + " Ejemplares vendidos - " + Cantantes.get(aux).getDiscografia().get(i).getNumeroVendidos() );
            }
        } else {
            System.out.println("No existe el cantante que has introducido");
        }

    }






}
