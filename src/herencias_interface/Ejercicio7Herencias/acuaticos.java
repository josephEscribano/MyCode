package herencias_interface.Ejercicio7Herencias;

public class acuaticos extends vehiculos{
    private final double eslora;

    //constructor


    public acuaticos(String matrícula, String modelo, double eslora) {
        super(matrícula, modelo);
        this.eslora = eslora;
    }

    //getter and setter

    public double getEslora() {
        return eslora;
    }


    //metodos


    @Override
    public String toString() {
        return "aereos{" +
                "eslora=" + eslora +
                '}';
    }

    @Override
    public void Imprimir() {
        System.out.println("Vehículo acuático: " + " Matrícula: " + getMatrícula() + " Modelo: " + getModelo() + " Eslora: " + getEslora());
    }
}
