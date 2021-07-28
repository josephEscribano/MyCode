package herencias_interface.Ejercicio3Herencias;

import java.util.ArrayList;

public class Planetas extends Astros{
    private double Distancia_sol;
    private double Orbita_sol;
    private boolean Satelites;
    private ArrayList<Satelites> sat = new ArrayList<>();

    //constructores


    public Planetas(String nombre, double radio, double rotacion, double masa, double temperatura, double gravedad, double distancia_sol, double orbita_sol, boolean satelites) {
        super(nombre, radio, rotacion, masa, temperatura, gravedad);
        Distancia_sol = distancia_sol;
        Orbita_sol = orbita_sol;
        Satelites = satelites;
    }

    //getter and setter


    public double getDistancia_sol() {
        return Distancia_sol;
    }

    public void setDistancia_sol(double distancia_sol) {
        Distancia_sol = distancia_sol;
    }

    public double getOrbita_sol() {
        return Orbita_sol;
    }

    public void setOrbita_sol(double orbita_sol) {
        Orbita_sol = orbita_sol;
    }

    public boolean isSatelites() {
        return Satelites;
    }

    public void setSatelites(boolean satelites) {
        Satelites = satelites;
    }

    public ArrayList<herencias_interface.Ejercicio3Herencias.Satelites> getSat() {
        return sat;
    }

    public void setSat(ArrayList<herencias_interface.Ejercicio3Herencias.Satelites> sat) {
        this.sat = sat;
    }

    //metodos


    public void nuevoSatelite(Satelites satelite){
        sat.add(satelite);
    }

    @Override
    public String toString() {

        return "Planetas{" +
                "Nombre='" + getNombre() + '\'' +
                ", Radio=" + getRadio() +
                ", Rotacion=" + getRotacion() +
                ", Masa=" + getMasa()+
                ", Temperatura=" + getTemperatura() +
                ", Gravedad=" + getGravedad() +
                "Distancia_sol=" + Distancia_sol +
                ", Orbita_sol=" + Orbita_sol +
                ", Satelites=" + Satelites +
                '}';
    }

    @Override
    public void Muestraplanetas(Object a) {
        Planetas planetas = (Planetas) a;
        System.out.println("***Planeta: " + planetas.getNombre() + "***");
        System.out.println("Radio: " + planetas.getRadio());
        System.out.println("Rotación: " + planetas.getRotacion());
        System.out.println("Masa: " + planetas.getMasa());
        System.out.println("Temperatura: " + planetas.getTemperatura());
        System.out.println("Gravedad: " + planetas.getGravedad());
        System.out.println("Distancia al sol: " + planetas.Distancia_sol);
        System.out.println("Orbita al sol: " + planetas.Orbita_sol);
        System.out.println("Tiene satélites: " + planetas.Satelites);
        if (planetas.isSatelites()){
            for (int i = 0; i < planetas.sat.size(); i++){
                System.out.println("    -Satelite " + (i+1)+planetas.sat.get(i).getNombre());
            }
        }else{
            System.out.println("Este planeta no tiene satélites");
        }

    }


}
