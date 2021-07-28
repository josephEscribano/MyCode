package herencias_interface.Ejercicio7Herencias;

public class aviones extends aereos{
    private double tiempoVueloMax;

    //constructores

    public aviones(String matrícula, String modelo, int nasientos, double tiempoVueloMax) {
        super(matrícula, modelo, nasientos);
        this.tiempoVueloMax = tiempoVueloMax;
    }

    //getter and setter


    public double getTiempoVueloMax() {
        return tiempoVueloMax;
    }

    public void setTiempoVueloMax(double tiempoVueloMax) {
        this.tiempoVueloMax = tiempoVueloMax;
    }

    //metodos


    @Override
    public String toString() {
        return "aviones{" +
                "tiempoVueloMax=" + tiempoVueloMax +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("El tiempo de vuelo maximo de este avion es de " + getTiempoVueloMax() + " horas");
    }
}
