package ProgramacionFuncional.Lambda;

public class Funcion5 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,4,4,5,5,6};

        IFuncion5 repite = numero -> {
            int numerorepite = 0;
            int contador = 0;
            int veces = 0;
            int aux = 0;
            for (int i: numeros){
                for (int j:numeros){
                    if(i == j){
                        contador++;
                        if (veces < contador){
                            veces = contador;
                            aux = i;
                        }
                    }
                }

                contador = 0;
            }

            return aux;
        };

        System.out.println(repite.repite(numeros));
    }
}
