package Clases.EjerciciosClases.Clases;

public class Ejercicio2f {
    private String marca;
    private String modelo;
    private String tipo;
    private String conexion;
    private double precio;

    // constructores


    public Ejercicio2f(String marca,String modelo,String tipo, String conexion, double precio){
       this.marca = marca;
       this.modelo = modelo;
        if (tipo.equals("")){
            this.tipo = "optico";
        }else{
            this.tipo = tipo;
        }
       this.conexion = conexion;
       this.precio = precio;
    }

    // get

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getTipo(){
        return tipo;
    }

    public String getConexion(){
        return conexion;
    }

    public double getPrecio(){
        return precio;
    }

    // set

    public void setMarca(String marca){
       this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setConexion(String conexion){
        this.conexion = conexion;
    }

    public void setPrecio (double precio){
        this.precio = precio;
    }

    // metodos

    public void imprimir(){
        if (this.tipo != null){
            System.out.println(this.marca + " " + this.modelo + ", " + this.tipo + "," + this.conexion + "," + this.precio);
        }else{
            System.out.println(this.marca + " " + this.modelo + ", " + this.conexion + "," + this.precio);
        }

    }
}
