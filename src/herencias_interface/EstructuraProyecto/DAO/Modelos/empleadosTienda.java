package herencias_interface.EstructuraProyecto.DAO.Modelos;

public class empleadosTienda extends personas{

    private tareas tarea;

    //constructor


    public empleadosTienda(String DNI, String nombre, double sueldo, tareas tarea) {
        super(DNI, nombre, sueldo);
        this.tarea = tarea;
    }

    //getter and setter

    public tareas getTarea() {
        return tarea;
    }

    public void setTarea(tareas tarea) {
        this.tarea = tarea;
    }

    //metodos


    @Override
    public String toString() {
        return "empleadosTienda{" +
                "tarea=" + tarea +
                '}';
    }

    @Override
    public void MostrarPeronas() {
        System.out.println("Directivo --> " + " DNI: " + getDNI() + " Nombre: " + getNombre() + " Sueldo: " + getSueldo() + " Tarea que realiza " + tarea);
    }
}
