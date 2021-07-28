package Clases.EjerciciosClases.Clases;

public class Ejercicio4f {
    private String color;
    private String marca;
    private int matricula;
    private int numeroPuertas;

    // constructor

    public Ejercicio4f(){

    }
    public Ejercicio4f(String color, String marca, int matricula, int numeroPuertas) {
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
        this.numeroPuertas = numeroPuertas;
    }

    // get


    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    //set


    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    //metodos


    @Override
    public String toString() {
        return "Coche: " +
                "\n- Marca = " + marca +
                "\n- Color = " + color +
                "\n- Matrícula= " + matricula +
                "\n- Número de puertas= " + numeroPuertas;
    }
}
