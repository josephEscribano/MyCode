package Clases.EjerciciosClases.Clases;


public class Jugador {
    private final int idJugador;
    private String Nombre;
    private boolean Salud;

    //Constructor

    public Jugador(int idJugador){
        this.idJugador = idJugador;
        this.Nombre = "Jugador" + this.idJugador;
        this.Salud = true;
    }

    //getter

    public int getIdJugador(){
        return idJugador;
    }

    public String getNombre(){
        return Nombre;
    }

    public boolean isSalud(){
        return Salud;
    }


    //setter

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setSalud(boolean salud) {
        Salud = salud;
    }


    //Metodos
    public void Ejecutar(Revolver r){

        System.out.println("El " + Nombre + " se apunta con el arma");

        if (r.Disparar()){
            this.Salud = false;
            System.out.println("El " + Nombre + " a encontrado la bala, ha muerto");
        }else{
            System.out.println("Sigue probando, lo mismo la proxima tienes suerte");
        }

    }

    // Imprimir


    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", Nombre='" + Nombre + '\'' +
                ", Salud=" + Salud +
                '}';
    }
}
