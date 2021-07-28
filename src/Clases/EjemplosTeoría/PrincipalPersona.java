package Clases.EjemplosTeoría;

public class PrincipalPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 30);
        Persona persona2 = new Persona("Juan", 20);
        Persona persona3 = new Persona();
        persona3.setNombre("Ana");
        persona3.setEdad(16);

        persona1.imprimeNombre();
        System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad());
        if (persona3.esMayorEdad()) {
            System.out.println("Es mayor de edad. Tiene "+persona3.getEdad()+ " años");
        } else {
            System.out.println("Es menor de edad. Tiene "+persona3.getEdad()+ " años");
        }

       // System.out.println(persona1);
      //  System.out.println(persona1.toString());
/*
        Persona persona4 = new Persona("Juan", 20);
        if (persona2.equals(persona4)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }


        System.out.println("Antes de referenciar");
        System.out.println(persona1);
        System.out.println(persona2);
        if (persona1.equals(persona2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        persona1 = persona2; //esto no copia los valores de persona2 a persona1, le da la misma referencia
        System.out.println("Después de referenciar");
        System.out.println(persona1);
        System.out.println(persona2);
//probando equals
        if (persona1.equals(persona2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        System.out.println("Nombre de persona1 "+ persona1.getNombre());
        System.out.println("Nombre de persona2 "+ persona2.getNombre());
        persona1.setNombre("MArina"); //cuidado porque hemos referenciado así k ambos objetos apuntan
        //a la misma referencia
        System.out.println("Nombre de persona2 "+ persona2.getNombre());
  */
    }


}
