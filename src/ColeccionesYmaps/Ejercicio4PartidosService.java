package ColeccionesYmaps;

import java.util.ArrayList;

public class Ejercicio4PartidosService {


    public static void Resultado(ArrayList<Ejercicio4Partidos> Partidos){
        int contadorLocal = 0;
        int contadorVistitante = 0;
        int contadorEmpate = 0;
        int mayor = 0;
        int diferencia;
        int aux = 0;
        for (int i  = 0; i < Partidos.size(); i++){
            if (Partidos.get(i).getGolesLocal() > Partidos.get(i).getGolesVisitantes()){
                contadorLocal++;
            }else if (Partidos.get(i).getGolesVisitantes() > Partidos.get(i).getGolesLocal()){
                contadorVistitante++;
            }else{
                contadorEmpate++;
            }
            //Mayor goleada
            diferencia = Math.abs(Partidos.get(i).getGolesLocal() - Partidos.get(i).getGolesVisitantes());
            if (mayor < diferencia){
                mayor = diferencia;
                aux = i;

            }

        }

        System.out.println("El numero de victorias locales es de: " + contadorLocal);
        System.out.println("El numero de victorias visitantes es de: " + contadorVistitante);
        System.out.println("El numero de empates es de: " + contadorEmpate);
        System.out.println("La mayor goleada ha sido en el partido " + Partidos.get(aux).getEquipoLocal() +" " + Partidos.get(aux).getGolesLocal() + " - " + Partidos.get(aux).getEquipoVisitante() + " " + Partidos.get(aux).getGolesVisitantes());
        if (Partidos.get(aux).getGolesLocal() > Partidos.get(aux).getGolesVisitantes()){
            System.out.println("Equipo goleador " + Partidos.get(aux).getEquipoLocal());
        }else{
            System.out.println("Equipo goleador " + Partidos.get(aux).getEquipoVisitante());
        }
    }


}
