package Clases.EjerciciosClases.Clases;

public class EjercicioD1Punto {

    private double x;
    private double y;

    //Métodos contrctores.

    public EjercicioD1Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    //devolver datos.

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //cambiar valores.

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y =y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Metodos

    public void imprime(double x, double y){
        System.out.println("El punto tiene las coordenadas " + x + " " + y );
    }

    public void desplaza(double dx, double dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public double distancia(EjercicioD1Punto punto){
        double coordenadas = Math.sqrt(Math.pow(this.x - punto.x,2)+ Math.pow(this.y - punto.y,2));

        return coordenadas;
    }

    @Override
    public String toString(){
        return "Coordenadas del punto 1 son " + "(" + x + "," +  y + ")";
    }
}
