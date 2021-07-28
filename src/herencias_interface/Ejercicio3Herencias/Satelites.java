package herencias_interface.Ejercicio3Herencias;

public class Satelites extends Astros{
    private double Distancia_planeta;
    private double Orbita;
    private Planetas planeta;

    //constructor
    public Satelites(String nombre, double radio, double rotacion, double masa, double temperatura, double gravedad, double distancia_planeta, double orbita, Planetas planeta) {
        super(nombre, radio, rotacion, masa, temperatura, gravedad);
        Distancia_planeta = distancia_planeta;
        Orbita = orbita;
        this.planeta = planeta;
    }

    //getter and setter

    public double getDistancia_planeta() {
        return Distancia_planeta;
    }

    public void setDistancia_planeta(double distancia_planeta) {
        Distancia_planeta = distancia_planeta;
    }

    public double getOrbita() {
        return Orbita;
    }

    public void setOrbita(double orbita) {
        Orbita = orbita;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }

    //Metodos


    @Override
    public String toString() {
        super.toString();
        return "Satelites{" +
                "Distancia_planeta=" + Distancia_planeta +
                ", Orbita=" + Orbita +
                ", planeta=" + planeta +
                '}';
    }

    @Override
    public void Muestraplanetas(Object a) {
        Satelites satelite = (Satelites) a;

        System.out.println("*** Satelite: " + satelite.getNombre() + "***");
        System.out.println("Radio: " + satelite.getRadio());
        System.out.println("Rotación: " + satelite.getRotacion());
        System.out.println("Masa: " + satelite.getMasa());
        System.out.println("Temperatura: " + satelite.getTemperatura());
        System.out.println("Gravedad: " + satelite.getGravedad());
        System.out.println("Distancia al planeta: " + satelite.Distancia_planeta);
        System.out.println("Orbita planeta: " + satelite.Orbita);
        System.out.println("Planeta al que pertenece: " + satelite.planeta );
    }
}
