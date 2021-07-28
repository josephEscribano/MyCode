package ColeccionesYmaps;

public class Persona implements Comparable<Persona>{
    private String Nombre;
    private int edad;


    // constructores



    public Persona()  {
    }

    public Persona(String nombre, int edad) {
        Nombre = nombre;
        this.edad = edad;
    }

    // getter and setter


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // toString


    @Override
    public String toString() {
        return Nombre  + " - " + edad + ",";
    }

    @Override
    public int compareTo(Persona o) {
        Integer Edad = o.getEdad();
        return Edad.compareTo(o.getEdad());
    }
}
