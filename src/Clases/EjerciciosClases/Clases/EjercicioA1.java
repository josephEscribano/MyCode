package Clases.EjerciciosClases.Clases;


public class EjercicioA1 {
    private int x;
    private int y;

    //Métodos contrctores.

    public EjercicioA1(int x, int y){
        this.x = x;
        this.y = y;
    }

    //devolver datos.

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //cambiar valores.

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y =y;
    }



    @Override
    public String toString(){
        return "Coordenadas del punto 1 son " + "(" + x + "," +  y + ")";
    }
}
