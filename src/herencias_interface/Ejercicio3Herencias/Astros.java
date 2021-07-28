package herencias_interface.Ejercicio3Herencias;

public abstract class Astros {
    private String Nombre;
    private double Radio;
    private double Rotacion;
    private double Masa;
    private double Temperatura;
    private double Gravedad;

    // constructores


    public Astros(String nombre, double radio, double rotacion, double masa, double temperatura, double gravedad) {
        Nombre = nombre;
        Radio = radio;
        Rotacion = rotacion;
        Masa = masa;
        Temperatura = temperatura;
        Gravedad = gravedad;
    }

    //getter and setter


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getRotacion() {
        return Rotacion;
    }

    public void setRotacion(double rotacion) {
        Rotacion = rotacion;
    }

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double masa) {
        Masa = masa;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double temperatura) {
        Temperatura = temperatura;
    }

    public double getGravedad() {
        return Gravedad;
    }

    public void setGravedad(double gravedad) {
        Gravedad = gravedad;
    }

    //Metodos


    public abstract void Muestraplanetas(Object a);

}