package herencias_interface.Ejercicio4Herencias;

public abstract class Aves extends Mascotas {
     private String pico;
     private boolean vuela;


     //constructor


    public Aves(String nombre, int edad, String estado, String fecha, String tipo, String pico, boolean vuela) {
        super(nombre, edad, estado, fecha, tipo);
        this.pico = pico;
        this.vuela = vuela;
    }

    //getter and setter


    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    // metodos

    public abstract boolean volar();

}
