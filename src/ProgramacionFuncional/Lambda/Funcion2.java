package ProgramacionFuncional.Lambda;

public class Funcion2 {

    public static void main(String[] args) {
        IFuncion2 Cfactorial = (numero) -> {
            int resultado = 1;
            for (int i = 1; i <= numero; i++){
                resultado = resultado * i;
            }

            return resultado;
        };

        System.out.println(Cfactorial.calcula(6));
    }
}
