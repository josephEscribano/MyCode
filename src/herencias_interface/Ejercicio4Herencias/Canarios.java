package herencias_interface.Ejercicio4Herencias;

import ColeccionesYmaps.Cantante;

public class Canarios extends Aves{
    private String color;
    private boolean canta;

    //constructor


    public Canarios(String nombre, int edad, String estado, String fecha, String tipo, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fecha, tipo, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    //getter and setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    //metodos


    @Override
    public String toString() {
        return "Nombre: " + getNombre() +"\n"+
                "Edad: " + getEdad() + "\n"+
                "Estado: " + getEstado() + "\n" +
                "Nacido: " + getFecha() +
                "Pico: " + getPico() + "\n" +
                "Vuela: " + volar() + "\n" +
                "Origen: " + color + "\n" +
                "Habla: " + isCanta();
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
        System.out.println("Raza: " + color);
        System.out.println("Pulgas: " + isCanta());
    }

    @Override
    public boolean habla() {
        return false;
    }
}
