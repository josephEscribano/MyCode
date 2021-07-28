package herencias_interface.Ejercicio4Herencias;

public class Main4 {
    public static void main(String[] args) {
        Inventario in = new Inventario();
        Mascotas mascota1 = new Perros("Firulais",1,"Feliz","abri-2020","Perro","Cocker",false);
        Perros perro1 = new Perros("Jake",7,"durmiendo","sept - 2013","Perro","Bichon Maltes",false);
        Loros loro1 = new Loros("perico",20,"piando","abril 2000","Loro","Corto",true,"Africa",true);
        // motrar animales
        in.InsertarAnimales(perro1);
        in.InsertarAnimales(loro1);
        in.mostrarLista();

        // Mostrar datos de todos los animales

        in.MostrarDatos();

        // insertar animal

        in.InsertarAnimales(mascota1);
        in.mostrarLista();

        //eliminar animal

        in.EliminarMascota();
        in.mostrarLista();

        // vaciar lista

        in.Vaciar();



    }

}
