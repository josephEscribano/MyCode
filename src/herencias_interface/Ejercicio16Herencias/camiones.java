package herencias_interface.Ejercicio16Herencias;

public class camiones extends vehiculos {
    private int Nruedas;

    //constructores


    public camiones(String matricula, int nruedas) {
        super(matricula);
        Nruedas = nruedas;
    }


    //getter and setter


    public int getNruedas() {
        return Nruedas;
    }

    public void setNruedas(int nruedas) {
        Nruedas = nruedas;
    }

    //metodos


    @Override
    public String toString() {
        return "camiones{" +
                "Nruedas=" + Nruedas +
                '}';
    }

    @Override
    public double CalcularImporte(int tiempoSalida) {
        double importe = 0;
        if (Nruedas > 6){
            importe = 0.6 * (tiempoSalida - getTiempoEntrada() );
        }else{
            importe = 0.4 * (tiempoSalida - getTiempoEntrada());
        }

        return importe;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println(" Matrícula: " + getMatricula() + " Camion " + Nruedas + " Fecha: " + getFecha());
    }
}
