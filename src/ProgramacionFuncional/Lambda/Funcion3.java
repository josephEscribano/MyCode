package ProgramacionFuncional.Lambda;

public class Funcion3 {

    public static void main(String[] args) {

        IFuncion3 esPar = (numero) -> {
            if (numero % 2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
        };

        esPar.esPar(9);
    }
}
