package herencias.ejemplos.Ejemplo1;

import java.util.ArrayList;

public class Profesor extends Persona {
    private int cod;
    private String departamento;
    private ArrayList<String> modulos;
    private String horario;
    //al constructor se le pasaría los atributos de la clase Persona
    // y de la clase Profesor
    public Profesor(String nombre, String dni, String direccion, int telefono,
                    int cod, String departamento,
                    ArrayList<String> modulos, String horario) {
        super(nombre, dni, direccion, telefono);
        this.cod = cod;
        this.departamento = departamento;
        this.modulos = modulos;
        this.horario = horario;
    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public ArrayList<String> getModulos() {
        return modulos;
    }
    public void setModulos(ArrayList<String> modulos) {
        this.modulos = modulos;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    @Override
    public void mostrarPersona() {
        //llamamos al método de la superclase para que
        //muestre los datos de Persona
        super.mostrarPersona();
        System.out.println("Código: "+this.cod +
                "\nDepartamento: "+ this.departamento +
                "\nHorario: "+ this.horario +
                "\nNotas: ");
        for (String modulo : this.modulos) {
            System.out.println("\tMódulo: " + modulo);
        }

    }

   
}
