package ProyectoVerano.DAO.MODELOS;

import java.util.Objects;

public class EmpleadosTienda extends Personas{

    private Tareas Tareas;

    public EmpleadosTienda(String DNI, String nombre, double sueldo, ProyectoVerano.DAO.MODELOS.Tareas tareas) {
        super(DNI, nombre, sueldo);
        Tareas = tareas;
    }

    public ProyectoVerano.DAO.MODELOS.Tareas getTareas() {
        return Tareas;
    }

    public void setTareas(ProyectoVerano.DAO.MODELOS.Tareas tareas) {
        Tareas = tareas;
    }

    @Override
    public String toString() {
        return "EmpleadosTienda: " + getDNI() + '\n' + getNombre() + '\n' + getSueldo() + '\n' + Tareas;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
