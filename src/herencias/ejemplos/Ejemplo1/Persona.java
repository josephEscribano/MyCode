package herencias.ejemplos.Ejemplo1;

public class Persona {
    private String nombre;
    private String dni;
    private String direccion;
    private int telefono;
    public Persona(String nombre, String dni, String direccion, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre+
                "\nDNI: " + this.dni +
                "\nDirección: " + this.direccion +
                "\nTeléfono: " + this.telefono);
    }
}
