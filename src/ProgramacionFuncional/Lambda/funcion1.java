package ProgramacionFuncional.Lambda;

public class funcion1 {

    public static void main(String[] args) {
        int [] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;


        IFuncion1 media = (prueba) -> {
            float promedio = 0;
            for (int i = 0; i < numeros.length; i++){
                promedio = promedio + numeros[i];
            }

            promedio = promedio / numeros.length;

            return promedio;
        };

        System.out.println(media.media(numeros));
    }
}
