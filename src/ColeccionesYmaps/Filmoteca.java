package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Filmoteca {
    private ArrayList<Peliculas> ListaPeliculas;

    public Filmoteca() {
        this.ListaPeliculas = new ArrayList<Peliculas>();
    }

    public Filmoteca(ArrayList<Peliculas> listaPeliculas) {
        ListaPeliculas = listaPeliculas;
    }



    public ArrayList<Peliculas> getListaPeliculas() {
        return ListaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Peliculas> listaPeliculas) {
        ListaPeliculas = listaPeliculas;
    }

    public void AñadirPeliculas(){
        String Nombre;
        int anio;
        String Director;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre de la pelicula");
        Nombre = sc.nextLine();
        System.out.println("Dime el año de la pelicula");
        anio = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el director");
        Director = sc.nextLine();
        ListaPeliculas.add(new Peliculas(Nombre,anio,Director));

    }

    public void EliminarPeliculaid (){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int id;
        System.out.println("Dime el id de la pelicula que quieres eliminar");
        id = sc.nextInt();

        Iterator<Peliculas> it = ListaPeliculas.iterator();
        while (it.hasNext()){
            Peliculas t = it.next();
            if (t.getId() == id){
                it.remove();
            }
        }
    }

    public void EliminarPelicula(Peliculas p){
        ListaPeliculas.remove(p);
    }

    public void MostrarPeliculas(){
        for (int i = 0; i < ListaPeliculas.size(); i++){
            if (i == 0){
                if (i == ListaPeliculas.size() - 1 ){
                    System.out.println("[ " + ListaPeliculas.get(i) + " ]");
                }else{
                    System.out.println("[ " + ListaPeliculas.get(i) + ", ");
                }

            }else if (i == ListaPeliculas.size() - 1){
                System.out.println(ListaPeliculas.get(i) + " ]");
            }else{
                System.out.println(ListaPeliculas.get(i) + ", ");
            }
        }
    }

    public void CantidadPeliculas(){
       System.out.println("Hay " +  ListaPeliculas.size() + " peliculas");
    }
}
