package Clases.EjerciciosClases.Clases;

public class EjercicioD2Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructores

    public EjercicioD2Persona(String dni, String nombre,String apellidos,int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //get

    public String getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    //set

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    //Métodos

    public void Imprime(){
        System.out.println(this.nombre + this.apellidos + " con dni " + this.dni + " tiene " + this.edad + " años");
    }

    public boolean esMenor(){

        return edad < 18;
    }

    public boolean esJubilado(){
        return edad >= 65;
    }

    public int DiferenciaEdad(EjercicioD2Persona persona){
        int diferencia;
        if(this.edad > persona.edad){
            diferencia = this.edad - persona.edad;
        }else{
            diferencia = persona.edad - this.edad;
        }

        return diferencia;
    }
    //toString

    public String toString(){
        return nombre + apellidos + " tiene " + edad + " años y su dni es " + dni;
    }

}
