package herencias_interface.Ejercicio7Herencias;

public abstract class vehiculos {
    private final String Matrícula;
    private final String Modelo;

    //constructor

    public vehiculos(String matrícula, String modelo) {
        Matrícula = matrícula;
        Modelo = modelo;
    }


    //getter and setter

    public String getMatrícula() {
        return Matrícula;
    }

    public String getModelo() {
        return Modelo;
    }


    //metodos

    @Override
    public String toString() {
        return "vehiculos{" +
                "Matrícula='" + Matrícula + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    public abstract void Imprimir();
}
