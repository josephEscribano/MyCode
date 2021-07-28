package pooAv.ejemploInterfaz;

public class Rectangulo implements Figura{
    private float lado;
    private float altura;
    //constructor
    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    //getter y setter
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //implementando el método de la interfaz
    @Override
    public float area() {
        return lado * altura;
    }
}
