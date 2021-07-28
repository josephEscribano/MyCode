package herencias.ejemplos.Ejemplo1;

import java.util.ArrayList;

public class Alumno extends Persona {
    private int exp;
    private String ciclo;
    private int curso;
    private ArrayList<Integer> notas;
    //al constructor se le pasaría los atributos de la clase Persona y de la clase Alumno
    public Alumno(String nombre, String dni, String direccion, int telefono,
                  int exp, String ciclo, int curso, ArrayList<Integer> notas) {
        //llamamos al constructor de la clase Persona
        super(nombre, dni, direccion, telefono);
        this.exp = exp;
        this.ciclo = ciclo;
        this.curso = curso;
        this.notas = notas;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    @Override
    public void mostrarPersona() {
        //llamamos al método de la superclase para que
        //muestre los datos de Persona
        super.mostrarPersona();
        System.out.println("Nº Expediente: "+this.exp +
                "\nCiclo: "+ this.ciclo +
                "\nCurso: "+ this.ciclo +
                "\nNotas: ");
        for (Integer nota : this.notas) {
            System.out.println("\tNota: " + nota);
        }
    }
    public void calculoNotas () {
        System.out.print("Notassssss");
    }
}
