package EjerciciosPOO;

public class EjerciciosStringBuilder {
    public static void main(String[] args){
        StringBuilder texto1 = new StringBuilder("Hola desde Java");
        System.out.println("El texto 1 es "+texto1);
        StringBuilder texto2 = new StringBuilder("");
        System.out.println("El texto 2 es "+texto2);
        StringBuilder texto3 = new StringBuilder("En un lugar de la mancha de cuyo nombre....");
        System.out.println("El texto 3 es "+texto3);
        StringBuilder texto4 = texto3.append("!!!");
        System.out.println("El texto 4 es "+texto4);
        StringBuilder texto5 = texto4.insert(39, " no me acuerdo");
        System.out.println("El texto 5 es "+texto5);
        StringBuilder texto6 = texto5.delete(12,25);
        System.out.println("El texto 6 es "+texto6);
        String texto7 = texto6.toString().replaceAll("no me acuerdo","no tengo ni idea");
        System.out.println("Texto 7: " + texto7);

        System.out.println("texto1 al reves: "+texto1.reverse());

        StringBuilder texto8 = new StringBuilder("no tengo un buen dia");
        System.out.println("texto8: " + texto8.delete(0,3));
    }
}
