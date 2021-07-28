package ColeccionesYmaps;

public class Ejercicio4Partidos {
    private String EquipoLocal;
    private String EquipoVisitante;
    private int GolesLocal;
    private int GolesVisitantes;

    //constructores


    public Ejercicio4Partidos() {
    }

    public Ejercicio4Partidos(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitantes) {
        EquipoLocal = equipoLocal;
        EquipoVisitante = equipoVisitante;
        GolesLocal = golesLocal;
        GolesVisitantes = golesVisitantes;
    }

    //getter and setter


    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        EquipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        EquipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return GolesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        GolesLocal = golesLocal;
    }

    public int getGolesVisitantes() {
        return GolesVisitantes;
    }

    public void setGolesVisitantes(int golesVisitantes) {
        GolesVisitantes = golesVisitantes;
    }

    //toString


    @Override
    public String toString() {
        return "Ejercicio4Partidos{" +
                "EquipoLocal='" + EquipoLocal + '\'' +
                ", EquipoVisitante='" + EquipoVisitante + '\'' +
                ", GolesLocal=" + GolesLocal +
                ", GolesVisitantes=" + GolesVisitantes +
                '}';
    }


}
