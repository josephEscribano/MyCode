package Clases.EjerciciosClases.Clases;

public class EjercicioD4Articulo {
    private String nombreArticulo;
    private double precio;
    private int cantidad;
    private int almacen;
    private final double IVA = 0.21;

    //constructor

    public EjercicioD4Articulo(String nombreArticulo, double precio,int cantidad){
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cantidad = cantidad;
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

    public int getAlmacen() {
        return almacen;
    }

    //set

    public void setNombreArticulo(String nombreArticulo){
        this.nombreArticulo = nombreArticulo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setAlmacen(int almacen){
        this.almacen = almacen;
    }

    //metodos
    public void imprimir(){
        System.out.println("Nombre: " + nombreArticulo + " tiene un precio de  " + precio + " sin iva  y con iva es de " + getPVP() +  " y en stock tenemos " + cantidad);
    }

    public double getPVP(){
        double preciofinal = precio * IVA + precio;

        return preciofinal;
    }

    public double PVPdescuento(int descuento){
        double precioConDescuento = getPVP() - (descuento / 100 * getPVP());

        return precioConDescuento;
    }

    public boolean vendido(int cantidadVendida){
        if (cantidadVendida > cantidad){

            return false;
        }else{
            cantidad = cantidad - cantidadVendida;
            return true;
        }
    }

    public boolean almacenar(int cantidadAlmacenada){
        if (cantidadAlmacenada > cantidad){
            return false;
        }else{
            almacen = almacen + cantidadAlmacenada;
            return true;
        }
    }

}
