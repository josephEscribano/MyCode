package herencias_interface.Ejercicio4Herencias;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    ArrayList<Mascotas> registro = new ArrayList<>();


    //constructor


    public Inventario() {
    }

    //getter and setter


    public ArrayList<Mascotas> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Mascotas> registro) {
        this.registro = registro;
    }

    //metodos


    @Override
    public String toString() {
        return "Inventario{" +
                "registro=" + registro +
                '}';
    }

    public void mostrarLista(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String control;
        for (int i  = 0; i < registro.size();i++){
            if (i == 0){
                System.out.println("*****LISTA DE ANIMALES*****");
            }
            System.out.println((i+1)+": " + registro.get(i).getNombre() + " " + registro.get(i).getTipo());

        }
        System.out.println("¿quieres mostrar algun animal?");
        control = sc.nextLine();

        if (control.equals("si")){
            System.out.println("Selecciona un animal para saber sus datos: ");
            opcion = sc.nextInt();

            if (opcion > 5){
                System.out.println("No existen tantos animales");
            }else{
                registro.get(opcion-1).muestra();
            };
        }
    }

    public void MostrarDatos(){
        for (int i = 0; i < registro.size();i++){
            System.out.println("****MASCOTA " + (i+1) + "*****");
            System.out.println(registro.get(i).toString());
        }
    }

    public void InsertarAnimales(Mascotas m){

        registro.add(m);
    }

    public void EliminarMascota(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("dime el nombre del animal que quieres eliminar: ");
        nombre = sc.nextLine();
        for (int i = 0; i < registro.size();i++){
            if (registro.get(i).getNombre().equals(nombre)){
                registro.remove(i);

            }
        }

    }

    public void Vaciar(){
        registro.clear();
    }




}
