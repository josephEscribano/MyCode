package Clases.EjemplosTeoría;

import java.util.Objects;

/**
 * <h1>Clase Persona</h1>
 * <p>Esta clase persona sirve para tener un molde de personas</p>
 * @author Marina PB
 * @version 2.0
 */
class Persona {
    String nombre;
    int edad;

    //método CONSTRUCTOR
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }
    public Persona(int edad) {

        this.edad = edad;
    }
    //Método CONSTRUCTOR VACÍO
    public Persona() {
        this.nombre="";
        this.edad = 0;
    }
    // Devuelve el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece la edad de la persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve la edad de la persona
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    // Establece la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Devuelve true si es mayor de edad, false en caso contrario
    boolean esMayorEdad() {
        return (edad >= 18);
    }
    // Muestra su nombre por pantalla
    void imprimeNombre() {
        System.out.println(nombre);
    }
/*
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }



    @Override
    public String toString() {
        return "- Nombre: " + nombre +
                "\n- Edad: " + edad;
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //si la referencia es la misma
        if (o == null || getClass() != o.getClass()) return false; //si es null o no pertenecen a la misma clase
        Persona persona = (Persona) o; //casting
        return Objects.equals(getNombre(), persona.getNombre()); //comprueba si son iguales
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
}

