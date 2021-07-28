package herencias_interface.Ejercicio7Herencias;

public class coches extends terrestres{
    private boolean aireAcondicionado;

    //constructor


    public coches(String matrícula, String modelo, int nruedas, boolean aireAcondicionado) {
        super(matrícula, modelo, nruedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    //getter and setter


    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    //metodos


    @Override
    public String toString() {
        return "coches{" +
                "aireAcondicionado=" + aireAcondicionado +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        if (aireAcondicionado){
            System.out.println("El coche dispone de aire acondicionado");
        }else{
            System.out.println("No tiene aire acondicionado");
        }
    }
}
