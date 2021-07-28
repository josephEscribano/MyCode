package herencias_interface.EstructuraProyecto.DAO.Modelos;

public class directivos extends personas{

    private int aniosExp;


    //constructores

    public directivos(String DNI, String nombre, double sueldo, int aniosExp) {
        super(DNI, nombre, sueldo);
        this.aniosExp = aniosExp;
    }

    //getter and setter

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    //metodos


    @Override
    public String toString() {
        return "directivos{" +
                "aniosExp=" + aniosExp +
                '}';
    }

    @Override
    public void MostrarPeronas() {
        System.out.println("Directivo --> " + " DNI: " + getDNI() + " Nombre: " + getNombre() + " Sueldo: " + getSueldo() + " Años de experiencia: " + aniosExp);
    }
}
