package Clases.EjerciciosClases.Clases;

public class Ejercicio9f {
    private static int PotenciaTotal;
    private int potencia;
    private boolean estado;
    private String Nombre;

    //constructor

    public Ejercicio9f(int potencia, boolean estado, String Nombre){
        this.potencia = potencia;
        if (estado == true){
            PotenciaTotal += potencia;
            this.estado = estado;
        }else {
            this.estado = estado;
        }
        this.Nombre = Nombre;
    }

    //getter

    public int getPotencia(){
        return potencia;
    }

    public static int getPotenciaTotal() {
        return PotenciaTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getNombre() {
        return Nombre;
    }

    //setter

    public static void setPotenciaTotal(int potenciaTotal) {
        PotenciaTotal = potenciaTotal;
    }
    public void setPotencia(int Potencia){
        this.potencia = Potencia;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public String toString() {
        return "Ejercicio7fAparatoElectrico{" +
                "potencia=" + potencia +
                ", estado=" + estado +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
