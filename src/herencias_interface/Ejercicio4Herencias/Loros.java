package herencias_interface.Ejercicio4Herencias;

import java.util.List;

public class Loros extends Aves{
    private String origen;
    private boolean habla;

    //constructor


    public Loros(String nombre, int edad, String estado, String fecha, String tipo, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fecha, tipo, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    // getter and setter


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    // metodos

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +"\n"+
                "Edad: " + getEdad() + "\n"+
                "Estado: " + getEstado() + "\n" +
                "Nacido: " + getFecha() +
                "Pico: " + getPico() + "\n" +
                "Vuela: " + volar() + "\n" +
                "Origen: " + origen + "\n" +
                "Habla: " + habla();
    }

    @Override
    public boolean volar() {
        return isVuela();
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Nacido: " + getFecha());
        System.out.println("Pico: " + getPico());
        System.out.println("Vuela: " + volar());
        System.out.println("Raza: " + origen);
        System.out.println("Pulgas: " + habla());
    }

    @Override
    public boolean habla() {
        return isHabla();
    }

    public void saluda(){
        System.out.println("Holaaaaa");
    }


}
