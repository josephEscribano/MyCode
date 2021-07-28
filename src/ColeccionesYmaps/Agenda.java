package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Contactos> agenda;

    // constructor


    public Agenda() {
        this.agenda = new ArrayList<Contactos>();
    }

    // metodos

    public void nuevoContacto(Contactos otroContacto){
        // comprobar que el nombre y el apellido no estan repetidos.
        if (agenda.contains(otroContacto) && agenda.contains(otroContacto)){
            System.out.println("Ya existe un contacto con ese nombre y apellido");
        }else {
            this.agenda.add(new Contactos(otroContacto.getNombre(),otroContacto.getApellidos(),otroContacto.getTelefono()));
        }

    }

    public void nuevoContacto(Contactos otroContacto,int posicion){
        if (agenda.contains(otroContacto)){
            System.out.println("Ya existe un contacto con ese nombre y apellido");
        }else{
            this.agenda.add(posicion,new Contactos(otroContacto.getNombre(), otroContacto.getApellidos(), otroContacto.getTelefono()));
        }

    }

    public void MostrarAgenda(){
        Collections.sort(agenda);
        for (int i = 0; i < agenda.size(); i++){
            if (i == 0){
                if (i == agenda.size() - 1 ){
                    System.out.println("[ " + agenda.get(i) + " ]");
                }else{
                    System.out.println("[ " + agenda.get(i) + ", ");
                }

            }else if (i == agenda.size() - 1){
                System.out.println(agenda.get(i) + " ]");
            }else{
                System.out.println(agenda.get(i) + ", ");
            }
        }
    }

    public int BuscarTelefono(String Nombre, String Apellido){
        int contador = 0;
        int telefono = 0;
        for (int i  = 0; i < agenda.size(); i++){
            if (this.agenda.get(i).getNombre().equals(Nombre) && this.agenda.get(i).getApellidos().equals(Apellido)){
                telefono =  agenda.get(i).getTelefono();
                contador++;
            }else if (i == agenda.size() - 1 && contador == 0){
                System.out.println("El contacto no existe");
            }
        }
        return telefono;
    }

    public Contactos BuscarNombreApellido(int Telefono){
        int contador = 0;
        String Nombre = "";
        String Apellido = "";
        for (int i  = 0; i < agenda.size(); i++){
            if (agenda.get(i).getTelefono() == Telefono){
                Nombre = agenda.get(i).getNombre();
                Apellido = agenda.get(i).getApellidos();
                contador++;
            }else if (i == agenda.size() - 1 && contador == 0){
                System.out.println("El contacto no existe");
            }
        }

        Contactos contacto = new Contactos(Nombre,Apellido);
        return contacto;
    }

    public void EliminarContacto(String Nombre, String Apllidos){
        int contador = 0;
        for (int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getNombre().equals(Nombre) && agenda.get(i).getApellidos().equals(Apllidos)){
                agenda.remove(i);
                contador++;
            }else if (i == agenda.size() - 1 && contador == 0){
                System.out.println("El contacto que quieres borrar no existe");
            }
        }
    }


}
