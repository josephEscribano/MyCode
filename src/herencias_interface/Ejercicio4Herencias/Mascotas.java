package herencias_interface.Ejercicio4Herencias;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String Estado;
    private String fecha;
    private String tipo;

    //constructores
    public Mascotas(String nombre, int edad, String estado, String fecha,String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        Estado = estado;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    // getter and setter


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Metodos

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", Estado='" + Estado + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public abstract void muestra();
    public void cumpleaños(){
        System.out.println("Es tu cumpleaños!!!! ");
    }

    public void morir(){
        System.out.println("Ha fallecido");
    }

    public abstract boolean habla();

}
