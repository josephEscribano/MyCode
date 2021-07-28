package herencias_interface.Ejercicio3Herencias;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ArrayList<Astros> Astros = new ArrayList<>();

    Planetas planeta1 = new Planetas("Tierra",5.97E24,12742.0,1.0,365.25,9.78,14.05,1.466E8,true);
    Satelites Luna = new Satelites("Luna",14.5,100.9,300.00,-400,0,300000.9,12,planeta1);


    public void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        planeta1.nuevoSatelite(Luna);
        Astros.add(planeta1);
        Astros.add(Luna);
        do{

            System.out.println("***Lista de Astros***");
            for (int i = 0; i < Astros.size();i++){
                System.out.println("Astro " + (i+1) +" "+ Astros.get(i).getNombre());
            }
            System.out.println("Selecciona uno de los Astros para ver su información");
            opcion = sc.nextInt();
            if (opcion == 1){
                Astros.get(0).Muestraplanetas(planeta1);
            }if (opcion == 2){
                Astros.get(1).Muestraplanetas(Luna);
            }
        }while (opcion != 0);
    }
}
