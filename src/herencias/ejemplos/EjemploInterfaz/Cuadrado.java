package pooAv.ejemploInterfaz;

public class Cuadrado implements Figura{
    private float lado;
    //constructor
    public Cuadrado(float lado) {
        this.lado = lado;
    }
//getter y setter
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
//implementando el método de la interfaz
    @Override
    public float area() {
        return lado * lado;
    }
}
