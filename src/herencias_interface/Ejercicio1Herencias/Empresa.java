package herencias_interface.Ejercicio1Herencias;

public class Empresa {

    private String nombre;
    private String cif;


    //constructores

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    public Empresa() {
    }


    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    //Metodo


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }
}
