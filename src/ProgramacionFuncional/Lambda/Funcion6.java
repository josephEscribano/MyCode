package ProgramacionFuncional.Lambda;

public class Funcion6 {

    public static void main(String[] args) {


        IFuncion6 mayor3 = (numero1, numero2, numero3) -> {
            if (numero1 > numero2 && numero1 > numero3){
                System.out.println("El mayor es " + numero1);
            }else if (numero2 > numero3){
                System.out.println("El mayor es " + numero2);
            }else {
                System.out.println("El mayor es " + numero3);
            }
        };

        mayor3.mayor3(5,8,12);
    }
}
