package ProgramacionFuncional.Lambda;

public class Funcion4 {

    public static void main(String[] args) {

        int[] numeros = {2,1,9,5,4};

        IFuncion4 maximo = numero -> {
            int max = 0;

            for (int i: numeros){
                if (max < i){
                    max = i;
                }
            }

            return max;
        };

        System.out.println(maximo.max(numeros));
    }
}
