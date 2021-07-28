package Clases.EjerciciosClases.Service;

import Clases.EjerciciosClases.Clases.Ejercicio7fAparatoElectrico;

public class Ejercicios7fAparatosElectricosServices {
    public void EncenderAparato(Ejercicio7fAparatoElectrico aparato){
        if (aparato.isEstado() == true){
            System.out.println("El aparato " + aparato.getNombre() + " ya esta encendido");
        }else{

            aparato.setEstado(true);
        }
    }

    public void ApagarAparato(Ejercicio7fAparatoElectrico aparato){
        if (aparato.isEstado() == false){
            System.out.println("El aparato " + aparato.getNombre() + " ya esta apagado");
        }else{
            System.out.println("He apagado el aparato");
            aparato.setEstado(false);
        }
    }
}
