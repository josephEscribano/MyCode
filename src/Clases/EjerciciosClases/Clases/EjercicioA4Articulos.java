package Clases.EjerciciosClases.Clases;

public class EjercicioA4Articulos {
    private String nombreArticulo;
    private double precio;
    private int cantidad;
    private final double IVA = 0.21;
    private static int CuantosQuedan = 10;

    //constructor

    public EjercicioA4Articulos(String nombreArticulo, double precio,int cantidad){
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cantidad--;
        CuantosQuedan--;
    }

    //get

    public String getNombreArticulo(){
        return nombreArticulo;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public int getCuantosQuedan(){
        return CuantosQuedan;
    }

    //set

    public void setNombreArticulo(String nombreArticulo){
        this.nombreArticulo = nombreArticulo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    //metodos

    public static double PrecioFinal(double precio, double IVA){
        double preciofinal = precio * IVA + precio;

        return preciofinal;
    }

    //to string

    public String toString(){
        return nombreArticulo + " Precio: " + precio + " IVA: " + IVA + " PVP: " + PrecioFinal(precio,IVA);
    }
}
