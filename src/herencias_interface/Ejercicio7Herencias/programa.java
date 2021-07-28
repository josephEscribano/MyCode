package herencias_interface.Ejercicio7Herencias;

public class programa {
    public static void main(String[] args) {
        service service = new service();
        terrestres terrestre = new terrestres("1234ABC","Deportivo",4);
        coches coche = new coches("8524KSY","Todo terreno",5,true);
        motos moto1 = new motos("12345gh","GT",2,"roja");
        acuaticos acuatico1 = new acuaticos("ABC","Fuera borda",10.2);
        barcos barco1 = new barcos("dlkfjdalkds","vela",14.4,false);
        submarinos submarino1 = new submarinos("dlkfjalkdsjf","ruso",50.20,10000);
        aereos aereo1 = new aereos("kldjflskd","modelo1",12);
        aviones avion1 = new aviones("jsdlkfjdaslkdj", "747",200,12);
        helicopteros helicoptero1 = new helicopteros("djflska", "apache",6,6);


        service.añadirVehiculos(terrestre);
        service.añadirVehiculos(coche);
        service.añadirVehiculos(moto1);
        service.añadirVehiculos(acuatico1);
        service.añadirVehiculos(barco1);
        service.añadirVehiculos(submarino1);
        service.añadirVehiculos(aereo1);
        service.añadirVehiculos(avion1);
        service.añadirVehiculos(helicoptero1);

        service.mostrarDatos();
    }

}
