package srcSegunda.src.Clases.EjemplosTeoría.ejemplo1;

public class Articulo {
    //atributos de la clase
    private String codigoArticulo;
    private String titulo;
    private String formato;
    private double precioAlquiler;

    //métodos de la clase
    //constructor vacío
    public Articulo() {
    }
    //constructor
    public Articulo(String codigoArticulo, String titulo, String formato, double precioAlquiler) {
        this.codigoArticulo = codigoArticulo;
        this.titulo = titulo;
        this.formato = formato;
        this.precioAlquiler = precioAlquiler;
    }
    //getters and setters: get --> obtener // setter --> modificar

    public String getCodigoArticulo() {
        return codigoArticulo;
    }
    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    //Otros métodos
    public double calcularPrecio1() {
        return precioAlquiler;
    }
    public double calcularPrecio2() {
        double precioTotal = precioAlquiler * 1.8;
        return precioTotal;
    }
    public double calcularPrecioSemana() {
        return precioAlquiler * 5;
    }
}
