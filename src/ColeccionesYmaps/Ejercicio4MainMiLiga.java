package ColeccionesYmaps;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio4MainMiLiga {
    public static void main(String[] args) {
        ArrayList<Ejercicio4Partidos> Partidos = new ArrayList<>();

        Partidos.add(new Ejercicio4Partidos("Guadalcacín F.S", "Leganés FSF", 1,7));
        Partidos.add(new Ejercicio4Partidos("Jimbee Roldán F.SF.", "F.S.F. Móstoles", 2, 2));
        Partidos.add(new Ejercicio4Partidos("Burela F.S", "A.D. Sala Zaragoza F.S", 2, 0));
        Partidos.add(new Ejercicio4Partidos("A.E. Penya Esplugues", "Viaxes Amarelle F.S", 1,0));
        Partidos.add(new Ejercicio4Partidos("Femisport Palau Club","C.D. Universidad De Alicante",2,2));
        Partidos.add(new Ejercicio4Partidos("Majadahonda F.S.F","C.D. Universidad De Alicante",1,6));
        Partidos.add(new Ejercicio4Partidos("C.D. Futsi Alético Feminas", "UCAM El Pozo Murcia FS ",8,0));
        Partidos.add(new Ejercicio4Partidos("A.D. Alcorcón F.S", "Ourense Envialia C.F",3,4));

        //d
        Iterator <Ejercicio4Partidos> Iter = Partidos.iterator();
        while (Iter.hasNext()){
            Ejercicio4Partidos P = Iter.next();
            System.out.println(P.getEquipoLocal() +" " + P.getGolesLocal() + " - " + P.getEquipoVisitante() + " " + P.getGolesVisitantes());
        }
        System.out.println();

        // e

        Ejercicio4PartidosService.Resultado(Partidos);

    }
}
