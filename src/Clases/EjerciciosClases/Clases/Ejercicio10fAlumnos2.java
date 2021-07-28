package Clases.EjerciciosClases.Clases;

public class Ejercicio10fAlumnos2 {
    private int NIA;
    private String Nombre;
    private String apellidos;
    private int Asignaturas;
    private double[] calificaciones;
    private int[] horas;

    //constructor
    public Ejercicio10fAlumnos2(){

    }
    public Ejercicio10fAlumnos2(int NIA, String Nombre, String Apellidos, int Asignaturas){
        this. NIA = NIA;
        this.Nombre = Nombre;
        this.apellidos = Apellidos;
        this.Asignaturas = Asignaturas;
        this.calificaciones = new double[Asignaturas];
        this.horas = new int[Asignaturas];

    }

    //getter

    public int getNIA(){
        return NIA;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAsignaturas() {
        return Asignaturas;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public int[] getHoras(){
        return horas;
    }
    //setter

    public void setNIA(int NIA){
        this.NIA = NIA;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAsignaturas(int asignaturas) {
        Asignaturas = asignaturas;
        this.calificaciones = new double[this.Asignaturas];
        this.horas = new int[this.Asignaturas];
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setHoras(int[] horas){
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Alumnos: " + '\n' +
                "   - NIA=" + NIA + '\n' +
                "   - Nombre, apellidos = " + Nombre + apellidos + '\n' +
                "   - Asignaturas=" + Asignaturas;
    }
}
