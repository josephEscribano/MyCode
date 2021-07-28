package herencias_interface.Ejercicio7Herencias;

public class helicopteros extends aereos{
    private int NumHelices;

    //constructor


    public helicopteros(String matrícula, String modelo, int nasientos, int numHelices) {
        super(matrícula, modelo, nasientos);
        NumHelices = numHelices;
    }

    // getter and setter


    public int getNumHelices() {
        return NumHelices;
    }

    public void setNumHelices(int numHelices) {
        NumHelices = numHelices;
    }

    //metodos


    @Override
    public String toString() {
        return "helicopteros{" +
                "NumHelices=" + NumHelices +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Tiene " + getNumHelices() + " hélices");
    }
}
