package herencias_interface.Ejercicio16Herencias;

import java.util.Calendar;

public class coches extends vehiculos{
    private String Marca;
    private String Modelo;
    private double Largo;



    //constructores


    public coches(String matricula, String marca, String modelo, double largo) {
        super(matricula);
        Marca = marca;
        Modelo = modelo;
        Largo = largo;

    }

    //getter and setter


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    //modelos


    @Override
    public String toString() {
        return "coches{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Largo=" + Largo +
                '}';
    }



    @Override
    public double CalcularImporte(int tiempoSalida) {
        double importe = 0;
        if (Largo > 4.5){
            importe = 0.30 * (tiempoSalida - getTiempoEntrada() );
        }else{
            importe = 0.20 * ( tiempoSalida - getTiempoEntrada());
        }

        return importe;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Matrícula: " + getMatricula() + " Coche: " + Marca + " " + Modelo + " Fecha: " + getFecha());
    }
}
