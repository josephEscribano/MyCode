package Clases.EjerciciosClases.Clases;

public class EjercicioA2 {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    private static int numeropersonas = 0;

    //constructor
    public EjercicioA2(){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        numeropersonas++;
    }
    public EjercicioA2(String dni,String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        numeropersonas++;
    }

    //get

    public String getDni(){
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public static int getNumeropersonas(){
        return numeropersonas;
    }



    //set

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }


    //Imprimir

    @Override
    public String toString(){
        return nombre + "" + apellidos + " tiene " + dni + " y " + edad + " años";
    }

}
