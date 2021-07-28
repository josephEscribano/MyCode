package srcSegunda.src.Clases.EjemplosTeoría.ejemplo3y4;

public class MainArticulos2 {
    public static void main(String[] args) {
        //se instancian dos objetos tipo Articulo
        Articulo2 articulo1 = new Articulo2(); //utilizando constructor vacío
        //utilizando los setters le damos valor a sus atributos
        articulo1.setCodigoArticulo("1");
        articulo1.setTitulo("titulo 1");
        articulo1.setFormato("DVD");
        articulo1.setPrecioAlquiler(2.5);

        //utilizando constructor con parámetros
        Articulo2 articulo2 = new Articulo2("2", "titulo articulo 2", "CD" , 3);
        Articulo2 articulo3 = new Articulo2("3", "titulo articulo 3", "DVD" , 5);

        //Utilizando sus métodos
        System.out.println ("Alquiler artículo "+articulo1.getCodigoArticulo() +", 1 día: "+articulo1.calcularPrecio1());
        System.out.println ("Alquiler artículo "+articulo2.getCodigoArticulo() +", 1 día: "+articulo2.calcularPrecio1());

        System.out.println("Número de artículos: "+Articulo2.getStock());
        System.out.println("Identificador del artículo 1: "+articulo1.getIdentificador());
        System.out.println("Identificador del artículo 2: "+articulo2.getIdentificador());
        System.out.println("Identificador del artículo 3: "+articulo3.getIdentificador());
        System.out.println("Precio con IVA del artículo 1, 1 día: "+(articulo1.calcularPrecio1() * (1+Articulo2.IVA)));
        System.out.println("Precio con IVA del artículo 2, 1 día: "+(articulo2.calcularPrecio1() * (1+Articulo2.IVA)));
    }
}
