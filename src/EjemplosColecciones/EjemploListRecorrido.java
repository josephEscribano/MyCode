package EjemplosColecciones;

import java.util.*;

public class EjemploListRecorrido {
    public static void main(String[] args) {

        ejemplo1Recorrido();



    }


    private static void ejemplo1Recorrido() {

        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(10);
        numeros.add(11);
        numeros.add(21);
        numeros.add(31);
        numeros.add(41);

        System.out.println("Ha introducido: " + numeros.size() + " números");

        //mostrar el arrayList completo
        System.out.println(numeros);

        //recorrido usando un bucle for
        System.out.println("--- 1 Recorrido usando un bucle for:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        //recorrido usando un bucle foreach
        System.out.println("--- 2 Recorrido usando un bucle foreach:");
        for(Integer num: numeros){
            System.out.println(num);
        }

        //recorrido usando un iterador para mostrar un elemento por línea
        System.out.println("--- 3 Recorrido usando Iterator");
        Iterator it = numeros.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //recorrido usando un ListIterator para mostrar un elemento por línea
        System.out.println("--- 4 Recorrido usando ListIterator");
        ListIterator ltr = numeros.listIterator();
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }


        System.out.println("--- 5 Recorrido usando Iterator con tipo");
        ArrayList<Integer> lista=new ArrayList<Integer>();
        for (int i=0;i <10;i++) {
            lista.add(i);
        }
        Iterator<Integer>itt=lista.iterator();
        while (itt.hasNext()) {
            Integer t=itt.next();
            if (t%2==0) itt.remove();
        }
        for(Integer num: lista){
            System.out.println(num);
        }
        System.out.println("--- 6 Recorrido usando Iterator sin tipo");
        ArrayList<Integer> lista2=new ArrayList<Integer>();
        for (int i=0;i <10;i++) {
            lista2.add(i);
        }
        Iterator ittt=lista2.iterator();
        while (ittt.hasNext()) {
            Integer t= (Integer) ittt.next();
            if (t%2==0) {
                ittt.remove();
            }
        }
        for(Integer num: lista2){
            System.out.println(num);
        }
        System.out.println("--- 7 Recorrido usando Iterator con tipo REMOVE del ArrayList");
        ArrayList<Integer> lista3=new ArrayList<Integer>();
        for (int i=0;i <10;i++) {
            lista3.add(i);
        }
        Iterator<Integer>itt3=lista.iterator();
        int i=0;
        while (itt3.hasNext()) {
            Integer t=itt3.next();
            if (t%2==0) {
                lista3.remove(lista3.get(i)); //hay inconsistencia
            }
            i++;
        }
        System.out.println(lista3);



    }
}
