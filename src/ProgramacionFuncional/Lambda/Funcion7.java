package ProgramacionFuncional.Lambda;

public class Funcion7 {
    public static void main(String[] args) {

        IFuncion7 sumarletras = (palabra, numero) ->{
            String compuesto = "";
            for (int i = 0; i < numero;i++){

                System.out.print(compuesto.concat(palabra + " "));
            }
        };

        sumarletras.sumarletras("Hola",3);
    }
}
