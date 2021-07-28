package herencias.ejemplos.EjemploMadre;

public class EjemploMainMadre {
    public static void main(String[] args) {
        Madre madre = new Madre();
        Madre h1 = new Hija1();
        Madre h2 = new Hija2();

        madre.llamame();
        h1.llamame();
        h2.llamame();
    }
}
