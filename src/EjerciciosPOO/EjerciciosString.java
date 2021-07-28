package EjerciciosPOO;

public class EjerciciosString {
    public static void main (String[] args){
        String texto1 = "Hola desde Java";
        String texto = "Hola";
        String texto2 = texto + " desde Java";
        String texto3 = new String("Hola desde Java");
        String texto4 = new String("Hola desde Java");
        double coma = 1.98765432;
        String texto5 = String.valueOf(coma);
        String texto6 = "hola";
        String texto7 = " Desde";
        String texto8 = " Java";
        String texto9 = texto6.concat(texto7.concat(texto8));
        String texto10 = texto1.substring(0,4);
        String texto11 = "He dibujado un bonito dibujo";
        StringBuilder texto12 = new StringBuilder("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
        String texto13 = "abc";
        String texto14 = "abc";
        String texto15 = "ABC";
        String texto16 = "bcd";
        texto12.delete(18,19);
        texto12.insert(18,"c");
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto4);
        System.out.println(texto5);

        System.out.println("La longitud de texto1 es: " + texto1.length());
        System.out.println("La longitud de la palabra hola es " + "hola".length());
        System.out.println("Usando el operador mas las variables desde texto6 a tecto 8 quedan asi: " + texto6 + texto7 + texto8 );
        System.out.println("El texto9 usando concat: " + texto9);
        System.out.println("La primera letra del texto1 es: " + texto1.charAt(0));
        System.out.println("La segunda letra del texto1 es: " + texto1.charAt(1));
        System.out.println("Los primeros 5 caracteres de Hola desde Java son: " + texto10);
        for(int i = 0; i < texto10.length();i++){
            System.out.println("La " + i + " letra " + " del texto uno es " + texto10.charAt(i));
        }


        System.out.println("La primera posicion que aparece dibu " + texto11.indexOf("dibu") + " y  la ultima posicion es " + texto11.lastIndexOf("dibu"));
        System.out.println(texto12);
        System.out.println(texto1.toLowerCase());
        System.out.println(texto1.toUpperCase());

        if(texto13.equals(texto14)){
            System.out.println("texto13 y texto14 son iguales");
        }if(!texto13.equals(texto14)){
            System.out.println("texto13 y texto14 no son iguales");
        }if(texto13.equalsIgnoreCase(texto15)){
            System.out.println("texto13 es igual al texto15");
        }if(!texto13.equalsIgnoreCase(texto15)){
            System.out.println("texto13 y texto15 son distintos");
        }if(texto13.compareTo(texto16) < 0){
            System.out.println("el orden es: " + texto13 + " y " + texto16 );
        }if(texto13.compareTo(texto16) > 0){
            System.out.println("el orden es: " + texto16 + " y " + texto13);
        }


    }

}
