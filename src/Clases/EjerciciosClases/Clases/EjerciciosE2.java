package Clases.EjerciciosClases.Clases;

import java.util.Scanner;

public class EjerciciosE2 {
    Scanner sc = new Scanner(System.in);
    private final String dni;
    private static final int esMayor = 18;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructores

    public EjerciciosE2(String dni, String nombre,String apellidos,int edad){
          if (validarDNI(dni)){
                this.dni = dni;
          }else{
              boolean ok = false;
              while (!ok){
                  System.out.println("introduce dni");
                  ok = validarDNI(sc.nextLine());
              }
              this.dni = dni;
          }

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
        System.out.println(this.nombre + " " + this.apellidos + " con dni " + this.dni + " tiene " + this.edad + " años");
    }

    public boolean esMenor(){

        return this.edad < esMayor;
    }

    public static boolean validarDNI(String dni){
        if (dni.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$")){
            System.out.println("El dni es valido");
            return true;
        }else{
            System.err.println("El dni no es válido");
            return false;
        }
    }

    public boolean esJubilado(){
        return edad >= 65;
    }

    public int DiferenciaEdad(EjerciciosE2 persona){
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


