package Clases.EjerciciosClases.Service;


import Clases.EjerciciosClases.Clases.Ejercicio9f;
import Clases.EjerciciosClases.Utils.UtilsConstantes9f;

public class Ejercicio9fService {
    public void EncenderAparato(Ejercicio9f aparato){
        int contador = 0;
        if (aparato.isEstado() == true ){
            System.out.println(UtilsConstantes9f.Aparato_Encendido_Ya);
        }else if (Ejercicio9f.getPotenciaTotal() < UtilsConstantes9f.Potencia_110 ){
            if (Ejercicio9f.getPotenciaTotal() >= UtilsConstantes9f.Potencia_Maxima && contador == 0){
                System.out.println(UtilsConstantes9f.Mensaje_Encendido);
                aparato.setEstado(true);
                contador++;
            }else if (contador == 1){
                System.out.println(UtilsConstantes9f.Potencia_Aparatos);
            }
            if (Ejercicio9f.getPotenciaTotal() < UtilsConstantes9f.Potencia_Maxima ){
                aparato.setEstado(true);
                Ejercicio9f.setPotenciaTotal(Ejercicio9f.getPotenciaTotal() + aparato.getPotencia());
                System.out.println(UtilsConstantes9f.Mensaje_Encendido);
                System.out.println(UtilsConstantes9f.Mensaje_Potencia_Total + Ejercicio9f.getPotenciaTotal());
                if (Ejercicio9f.getPotenciaTotal() >= UtilsConstantes9f.Potencia_75){
                    System.out.println(UtilsConstantes9f.Mensaje_Potencia_75);
                }



            }

        }else{
            System.out.println(UtilsConstantes9f.Mensaje_Llega_Potencia_Max + ", " + UtilsConstantes9f.Mensaje_Potencia_Superada);
        }
    }

    public void ApagarAparato(Ejercicio9f aparato){
        if (aparato.isEstado() == false){
            System.out.println(UtilsConstantes9f.Aparato_Apagado_Ya);
        }else{
            aparato.setEstado(false);
            Ejercicio9f.setPotenciaTotal(Ejercicio9f.getPotenciaTotal() - aparato.getPotencia());
            System.out.println(UtilsConstantes9f.Mensaje_Apagado);

        }
    }
}
