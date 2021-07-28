package herencias_interface.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("pan",3);
        Producto producto2 = new Producto("Leche",5);
        Producto producto3 = new Producto("Manzanas",6);
        Producto producto4 = new Producto("Brocoli",7);
        Producto producto5 = new Producto("Carne",10);
        Producto producto6 = new Producto("Pescado",1);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        System.out.println("Lista completa");
        Iterator it = productos.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        productos.remove(0);
        productos.remove(3);
        System.out.println("Lista despues de borrar dos elementos");
        for(int i = 0; i < productos.size();i++){
            System.out.println(productos.get(i));
        }

        System.out.println();
        productos.add(1,producto6);
        System.out.println("Lista Despues de añadir un elemento nuevo");
        Iterator iter = productos.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("La lista ha sido borrada");
        productos.clear();

        for(int i = 0; i < productos.size();i++){
            System.out.println(productos.get(i));
        }
    }
}
