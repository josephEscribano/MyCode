package Clases.EjerciciosClases.Clases;

public class EjercicioB3Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //constructores

    public EjercicioB3Rectangulo(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x1 >= x2 || y1 >= y2){
            System.err.println(" ERROR al instanciar el rectángulo, los valores no son correctos");
        }

    }
    //metodos

    public int perimetro(){
        int perimetro = x1 + y1 + x2 + y2;
        return perimetro;

    }

    public int area(){
        int area = (x1 + y1) * (x2 + y2);
        return area;
    }
    //get

    public int getX1(){
        return x1;
    }

    public int getX2(){
        return x2;
    }

    public int getY1(){
        return y1;
    }

    public int getY2(){
        return y2;
    }

    //set

    public void setX1(int x1){
        this.x1 = x1;
    }

    public  void setX2 (int x2){
        this.x2 = x2;
    }

    public void setY1(int y1){
        this.y1 = y1;
    }

    public void setY2(int y2){
        this.y2 = y2;
    }

    //toString

    @Override
    public String toString(){
        return "las coordenadas del rectangulo1 son " + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")";
    }


}
