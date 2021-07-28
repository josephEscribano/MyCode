package herencias_interface.Ejercicio7Herencias;

public class aereos extends vehiculos{
    private final int Nasientos;

    // constructores

    public aereos(String matrícula, String modelo, int nasientos) {
        super(matrícula, modelo);
        Nasientos = nasientos;
    }

    //getter and setter


    public int getNasientos() {
        return Nasientos;
    }

    //metodos


    @Override
    public String toString() {
        return "aereos{" +
                "Nasientos=" + Nasientos +
                '}';
    }

    @Override
    public void Imprimir() {
        System.out.println("Vehículo aéreo: " + " Matrícula: " + getMatrícula() + " Modelo: " + getModelo() + " Eslora: " + getNasientos());
    }
}
