package EjerciciosPOO;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio6POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = "";
        boolean comprobar = false;
        do{
            System.out.println("Dime la contraseña de tu cuenta");
            password = sc.nextLine();
            if(comprobar = password.matches("(.*[0-9]+.*[A-Z]+.*[a-z]+.*)\\w{8,16}")){
                System.out.println("La contraseña es correcta");
            }else{
                System.out.println("La contraseña es incorrecta, vuelve a intentarlo");
            }
        }while(!comprobar);
    }
}
