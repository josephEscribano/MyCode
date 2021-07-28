package herencias_interface.Ejercicio1Herencias;

public class Departamentos {
    private final int id;
    private String nombre;
    private String localizacion;
    private Empresa Empresa;
    private static int numero = 1;

    // constructores

    public Departamentos(String nombre, String localizacion, herencias_interface.Ejercicio1Herencias.Empresa empresa) {
        this.id = numero;
        this.nombre = nombre;
        this.localizacion = localizacion;
        Empresa = empresa;
        numero++;
    }

    public Departamentos() {
        this.id = numero;
        numero++;
    }

    // getter and setter

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public herencias_interface.Ejercicio1Herencias.Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(herencias_interface.Ejercicio1Herencias.Empresa empresa) {
        Empresa = empresa;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Departamentos.numero = numero;
    }


    //Metodos


    @Override
    public String toString() {
        return "Departamentos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", Empresa=" + Empresa +
                '}';
    }
}
