package Clases.EjerciciosClases.Clases;

import Clases.EjerciciosClases.mains.Main3f;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3f {
    Random rand = new Random();
    private String nombre;
    private int n_matricula = 0;
    private static int numero = 100;
    private double[] calificaciones;


    // constructor

    public Ejercicio3f(){

    }

    public Ejercicio3f(String nombre, int n_matricula){
        Scanner sc = new Scanner(System.in);
        this.nombre = nombre;
        if (n_matricula > numero){
            this.n_matricula = numero;
        }else{
            while(n_matricula <= numero){
                System.err.println("El numero de matrícula que has introducido ya existe, por favor introduce uno superior a " + numero);
                n_matricula = sc.nextInt();

                if (n_matricula > numero ){
                    this.n_matricula = numero;
                }

            }
        }
        numero++;
        this.calificaciones = new double[5];


    }

    //get

    public String getNombre() {
        return nombre;
    }

    public int getN_matricula() {
        return n_matricula;
    }

    public static int getNumero() {
        return numero;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    //metodo

    public void Imprimir(){
        System.out.println("El alumno " + nombre + " tiene las siguientes notas" + Arrays.toString(calificaciones));
    }

    public double MediaAlumno(){
        double media = 0;
        double suma = 0;
        int matriculado = 0;
        for (int i = 0; i < this.calificaciones.length;i++){
            suma = suma + this.calificaciones[i];
            if (this.calificaciones[i] != 0){
                matriculado++;
            }if (i == this.calificaciones.length -1){
                media = suma / matriculado;
            }
        }
        return media;
    }



    @Override
    public String toString() {
        return "Ejercicio3f{" +
                "nombre='" + nombre + '\'' +
                ", n_matricula=" + n_matricula +
                ", calificaciones=" + Arrays.toString(calificaciones) +
                '}';
    }
}
