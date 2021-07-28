package Clases.EjerciciosClases.Clases;

import java.util.Random;

public class Personas {
    private String Nombre;
    private int Edad;
    private String Sexo;
    private String DNI;
    private double Peso;
    private double Altura;

    //Constructores


    public Personas() {
        this.Nombre = "";
        this.Edad = 0;
        this.Sexo = "Hombre";
        this.Peso = 0;
        this.Altura = 0;
        this.DNI = CalcularDNI();
    }

    public Personas(String nombre, int edad, String sexo) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Sexo = sexo;
        this.Peso = 0;
        this.Altura = 0;
        this.DNI = CalcularDNI();
    }

    public Personas(String nombre, int edad, String sexo, String DNI, double peso, double altura) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        this.DNI = DNI;
        Peso = peso;
        Altura = altura;
    }

    // getter

    public String getNombre(){
        return Nombre;
    }

    public int getEdad(){
        return Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public double getPeso() {
        return Peso;
    }

    public double getAltura() {
        return Altura;
    }

    //setter


    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    // Metodos

    public void EsMayor(){
        if (this.Edad >= 18){
            System.out.println(this.Nombre + " es mayor de edad");
        }else{
            System.out.println(this.Nombre + "es menor de edad");
        }
    }

    public void ComprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M'){
            System.out.println("El genero introducido no es correcto");
            this.Sexo = "Hombre";
        }
    }

    public int CalcularIMC(){
        double IMC = this.Peso / Math.pow(this.Altura, 2);
        int tipo = 0;
        if (IMC < 18.5){
            tipo = -1;

        }else if(IMC >= 18.5 && IMC <=24.9){
            tipo = 0;
        }else if (IMC > 24.9){
            tipo = 1;
        }

        return tipo;
    }

    public String CalcularDNI(){
        int numero = (int) Math.floor(Math.random()*(99999999-10000000+1)+10000000);
        int calculo = numero % 23;
        String opciones = "TRWAGMYFPDXBNJZSQVHLCKE";
        char NIF = opciones.charAt(calculo);
        String dni = String.valueOf(numero).concat(Character.toString(NIF));
        return dni;
    }
    //toString


    @Override
    public String toString() {
        return "Personas{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad= " + Edad +
                ", Sexo= " + Sexo +
                ", DNI='" + DNI + '\'' +
                ", Peso=" + Peso +
                ", Altura=" + Altura +
                '}';
    }
}
