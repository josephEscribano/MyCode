package srcSegunda.src.Clases.EjemplosTeoría.ejemplo3y4;

public class Articulo2 {
    //atributos de la clase
    private String codigoArticulo;
    private String titulo;
    private String formato;
    private double precioAlquiler;
    public static final double IVA = 0.21;
    private static int stock = 0;
    private String identificador;

    //métodos de la clase
    //constructor vacío
    public Articulo2() {
        stock++;
        this.identificador ="00"+stock;
    }
    //constructor

    public Articulo2(String codigoArticulo, String titulo, String formato, double precioAlquiler) {
        this.codigoArticulo = codigoArticulo;
        this.titulo = titulo;
        this.formato = formato;
        this.precioAlquiler = precioAlquiler;
        stock++;
        this.identificador ="00"+stock;
    }

    //getters and setters: get --> obtener // setter --> modificar

    public static double getIVA() {
        return IVA;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Articulo2.stock = stock;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

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
