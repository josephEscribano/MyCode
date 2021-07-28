package herencias_interface.Ejercicio7Herencias;

public class submarinos extends acuaticos{
    private double profundidadmax;

    //constructores

    public submarinos(String matrícula, String modelo, double eslora, double profundidadmax) {
        super(matrícula, modelo, eslora);
        this.profundidadmax = profundidadmax;
    }

    //getter and setter

    public double getProfundidadmax() {
        return profundidadmax;
    }

    public void setProfundidadmax(double profundidadmax) {
        this.profundidadmax = profundidadmax;
    }

    //metodos


    @Override
    public String toString() {
        return "submarinos{" +
                "profundidadmax=" + profundidadmax +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Este submarino puede llegar a  " + getProfundidadmax() + " metros");
    }
}
