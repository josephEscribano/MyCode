package herencias_interface.Ejercicio4Herencias;

public class Gatos extends Mascotas{
    private String color;
    private boolean PeloLargo;

    //constructor


    public Gatos(String nombre, int edad, String estado, String fecha, String tipo, String color, boolean peloLargo) {
        super(nombre, edad, estado, fecha, tipo);
        this.color = color;
        PeloLargo = peloLargo;
    }

    //getter and setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return PeloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        PeloLargo = peloLargo;
    }

    //metodos


    @Override
    public String toString() {
        return "Nombre: " + getNombre() +"\n"+
                "Edad: " + getEdad() + "\n"+
                "Estado: " + getEstado() + "\n" +
                "Nacido: " + getFecha() +"\n" +
                "Raza: " + color + "\n" +
                "Pulgas: " + isPeloLargo();
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Nacido: " + getFecha());
        System.out.println("Raza: " + color);
        System.out.println("Pulgas: " + isPeloLargo());
    }

    @Override
    public boolean habla() {
        return false;
    }
}
