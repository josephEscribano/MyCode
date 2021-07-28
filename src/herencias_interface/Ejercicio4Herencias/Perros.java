package herencias_interface.Ejercicio4Herencias;

public class Perros extends Mascotas{
    private String raza;
    private boolean pulgas;

    //constructor


    public Perros(String nombre, int edad, String estado, String fecha, String tipo, String raza, boolean pulgas) {
        super(nombre, edad, estado, fecha, tipo);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    // getter and setter


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    // Metodos


    @Override
    public String toString() {
        return "Nombre: " + getNombre() +"\n"+
                "Edad: " + getEdad() + "\n"+
                "Estado: " + getEstado() + "\n" +
                "Nacido: " + getFecha() +"\n" +
                "Raza: " + raza + "\n" +
                "Pulgas: " + isPulgas();
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Nacido: " + getFecha());
        System.out.println("Raza: " + raza);
        System.out.println("Pulgas: " + isPulgas());
    }

    @Override
    public boolean habla() {
        return false;
    }
}
