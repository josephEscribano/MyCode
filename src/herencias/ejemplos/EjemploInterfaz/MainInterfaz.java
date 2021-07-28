package pooAv.ejemploInterfaz;

import java.util.ArrayList;

public class MainInterfaz {
    public static void main(String[] args) {
        Figura cuadrado1 = new Cuadrado(3.5f);
        Figura cuadrado2 = new Cuadrado(2.2f);
        Figura cuadrado3 = new Cuadrado(8.9f);

        Figura circulo1 = new Circulo(3.5f);
        Figura circulo2 = new Circulo(4f);

        Figura rectangulo1 = new Rectangulo(2.25f, 2.55f);
        Figura rectangulo2 = new Rectangulo(12f, 13f);

        ArrayList<Figura> misFiguras = new ArrayList<>();
        misFiguras.add(cuadrado1);
        misFiguras.add(cuadrado2);
        misFiguras.add(cuadrado3);
        misFiguras.add(circulo1);
        misFiguras.add(circulo2);
        misFiguras.add(rectangulo1);
        misFiguras.add(rectangulo2);

        float areaTotal = 0;
        for (Figura fig: misFiguras) {
            System.out.println(fig.area());
            areaTotal += fig.area();
        }
        System.out.println("Hay un total de "+ misFiguras.size()+" figuras.");
        System.out.println("El área total es de "+ areaTotal+" unidades cuadradas.");
    }
}
