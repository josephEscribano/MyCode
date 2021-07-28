package herencias_interface.Ejercicio7Herencias;

import java.util.ArrayList;

public class service {

    private static ArrayList<vehiculos> vehiculos = new ArrayList<>();

    public void añadirVehiculos(vehiculos vehiculo){
        vehiculos.add(vehiculo);
    }

    public void mostrarDatos(){
        for (int i  = 0; i < vehiculos.size(); i++){
            vehiculos.get(i).Imprimir();
        }
    }
}
