package Clases.EjerciciosClases.Clases;


public class EjercicioE1 {


    private int x;
    private int y;

    //Métodos contrctores.

    public EjercicioE1(int x, int y){
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

    //Método

    public static EjercicioE1 creaPuntoAleatorio(){
        int aleatoriox = (int) Math.floor(Math.random()*(100-(-100)+1)+(-100));
        int aleatorioy = (int) Math.floor(Math.random()*(100-(-100)+1)+(-100));
        EjercicioE1 nombre = new EjercicioE1(aleatoriox,aleatorioy);

        return nombre;
    }
    @Override
    public String toString(){
        return "Coordenadas del punto 1 son " + "(" + x + "," +  y + ")";
    }
}
