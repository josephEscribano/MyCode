package ColeccionesYmaps;

import java.util.HashMap;

public class Ejercicio11service {

    public static void MostrarMap(HashMap<String,Ejercicio11Jugador> jugadores){
        for (String clave: jugadores.keySet()){
            System.out.println(clave +"--> " + jugadores.get(clave).getNumero() + "-" + jugadores.get(clave).getNombre() + "-" + jugadores.get(clave).getPosicion() );
        }
    }

    public static void SegunPosicion (HashMap<String,Ejercicio11Jugador> jugadores, String posicion){
        boolean encontrado = false;
        String aux = "";
        for (String clave: jugadores.keySet()){
            if (jugadores.get(clave).getPosicion().equals(posicion)){
                encontrado = true;
                aux = clave;
                break;
            }
        }

        if (encontrado){
            System.out.println(aux +"--> " + jugadores.get(aux).getNumero() + "-" + jugadores.get(aux).getNombre() + "-" + jugadores.get(aux).getPosicion() );
        }else{
            System.out.println("No existe ningun portero");
        }
    }
}
