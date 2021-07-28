package ProyectoVerano.DAO.MODELOS;

import java.util.Objects;

public class Directivos extends Personas{
    private int A_Experiencia;

    public Directivos(String DNI, String nombre, double sueldo, int a_Experiencia) {
        super(DNI, nombre, sueldo);
        A_Experiencia = a_Experiencia;
    }


    public int getA_Experiencia() {
        return A_Experiencia;
    }

    public void setA_Experiencia(int a_Experiencia) {
        A_Experiencia = a_Experiencia;
    }


    @Override
    public String toString() {
        return "Directivos: " + '\n' +"DNI:  " +  getDNI() + '\n' +
                "NOMBRE: " + getNombre() + '\n' +
                "SUELDO: " + getSueldo() + '\n' +
                "AÑOS DE EXPERIENCIA: " + getA_Experiencia() + '\n' +
                "------------------------" + '\n' ;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) ;
    }
}
