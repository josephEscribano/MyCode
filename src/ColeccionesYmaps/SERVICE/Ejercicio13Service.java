package ColeccionesYmaps.SERVICE;

import ColeccionesYmaps.MODELO.Ejercicio13Coche;
import ColeccionesYmaps.UTILS.Ejercicio13Marcas;

import java.util.*;

public class Ejercicio13Service {
    HashMap <String, Ejercicio13Coche> CochesLista = new HashMap<>();





    public boolean AñadirCoche(Ejercicio13Coche coche){
        boolean encontrado = true;
        for (String clave: CochesLista.keySet()){
            if (coche.equals(CochesLista.get(clave))){
                encontrado = false;
            }
        }

        if (encontrado){
            CochesLista.put(coche.getMatrícula(),coche);
        }

        return encontrado;
    }

    public boolean EliminarCoche(String Matricula){
        boolean encontrado = false;
        Iterator<String> it = CochesLista.keySet().iterator();
        while (it.hasNext()){
            String clave = it.next();

            if (CochesLista.get(clave).getMatrícula().equals(Matricula)){
                encontrado = true;
                it.remove();
            }
        }

        return encontrado;
    }

    public void mostrarCochesMarca (Ejercicio13Marcas Marca){
        for(String clave: CochesLista.keySet()){
            if (CochesLista.get(clave).getMarca().equals(Marca)){
                System.out.println(CochesLista.get(clave));
            }
        }
    }

    public void OrdenarCoches(int opcion){
        ArrayList<Ejercicio13Coche> CochesOrdenados = new ArrayList<>(CochesLista.values());
        if (opcion == 4){
            //Ordenado por Marca
            Comparator <Ejercicio13Coche> comparator = new Comparator<Ejercicio13Coche>() {
                @Override
                public int compare(Ejercicio13Coche o1, Ejercicio13Coche o2) {
                    return o1.getMarca().name().compareTo(o2.getMarca().name());
                }
            };
            Collections.sort(CochesOrdenados,comparator);


            for (int i = 0; i < CochesOrdenados.size(); i++){
                System.out.println(CochesOrdenados.get(i));
            }
        }else if (opcion == 5){
            //Ordenado por matricula

            Collections.sort(CochesOrdenados);

            for (int i = 0; i < CochesOrdenados.size(); i++){
                System.out.println(CochesOrdenados.get(i));
            }
        }
    }
}
