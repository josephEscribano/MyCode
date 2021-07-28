package srcSegunda.src.Clases.EjemplosTeoría.ejemploPaquetes.paquete2;


import srcSegunda.src.Clases.EjemplosTeoría.ejemploPaquetes.paquete1.EjemploPak;

public class Main {
    public static void main(String[] args) {
     //   EjemploPakA a = new EjemploPakA();  //A no es accesible, aunque esté en un subpaquete
        EjemploPakB b = new EjemploPakB("hola B");
        System.out.println(b.getAtributoB());

        EjemploPak c = new EjemploPak();
        //System.out.println(c.c); //Si intentamos acceder al atributo, error
        System.out.println(c.getAtributo());
    }
}
