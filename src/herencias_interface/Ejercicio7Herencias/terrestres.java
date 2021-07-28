package herencias_interface.Ejercicio7Herencias;

public class terrestres extends vehiculos{
    private final int Nruedas;

    //constructor


    public terrestres(String matrícula, String modelo, int nruedas) {
        super(matrícula, modelo);
        Nruedas = nruedas;
    }

    //getter and setter

    public int getNruedas() {
        return Nruedas;
    }

    //metodos


    @Override
    public String toString() {
        return "terrestres{" +
                "Nruedas=" + Nruedas +
                '}';
    }

    @Override
    public void Imprimir() {
        System.out.println("Vehículo terrestre --> " + "Matricula: " + getMatrícula() + "Modelo: " + getModelo() + " Nº ruedas: " + getNruedas() );
    }
}
