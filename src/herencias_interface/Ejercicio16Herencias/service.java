package herencias_interface.Ejercicio16Herencias;

import java.util.*;

public class service {
    HashMap<String,vehiculos> Parking = new HashMap<>();


    public void Menu(){
        System.out.println("*****BIENVENIDO AL APARCAMIENTO******");
        System.out.println("¿QUE DESEA HACER?");
        System.out.println("1-  Mostrar los vehíclos que hay en el aparcamiento");
        System.out.println("2-  Saber si el aparcamento está completo");
        System.out.println("3-  Sacar un vehículo");
        System.out.println("4-  Introducir un vehículo");
        System.out.println("5-  Salir de la aplicación");
    }

    public void cargaDatos(){
        vehiculos vehiculo1 = new coches("1234jkl","Audi","A4",4.6);
        vehiculos vehiculo2 = new coches("1890uik","BMW","318",4);
        vehiculos vehiculo3 = new coches("1544WEW","Renault","Kangoo",3.8);
        vehiculos vehiculo4 = new coches("1254rty","Peugeot","Parnet",3.5);
        vehiculos vehiculo5 = new coches("1578tgb","Citroen","C5",4.8);
        vehiculos vehiculo6 = new coches("1978klñ","Toyota","Yaris",3);
        vehiculos vehiculo7 = new camiones("4562jkg",8);
        vehiculos vehiculo8 = new camiones("5236poi",6);
        vehiculos vehiculo9 = new camiones("7415tyr",4);
        vehiculos vehiculo10 = new camiones("7892sdf",8);

        Parking.put(vehiculo1.getMatricula(),vehiculo1);
        Parking.put(vehiculo2.getMatricula(),vehiculo2);
        Parking.put(vehiculo3.getMatricula(),vehiculo3);
        Parking.put(vehiculo4.getMatricula(),vehiculo4);
        Parking.put(vehiculo5.getMatricula(),vehiculo5);
        Parking.put(vehiculo6.getMatricula(),vehiculo6);
        Parking.put(vehiculo7.getMatricula(),vehiculo7);
        Parking.put(vehiculo8.getMatricula(),vehiculo8);
        Parking.put(vehiculo9.getMatricula(),vehiculo9);
        Parking.put(vehiculo10.getMatricula(),vehiculo10);

    }
    public void mostrarVehículos(){
        ArrayList<vehiculos> vh = new ArrayList<>(Parking.values());
        Collections.sort(vh);
        for(int i = 0; i < vh.size();i++){
            vh.get(i).ImprimirDatos();
        }
    }

    public boolean AparcamientoCompleto(){
        boolean completo = false;
        if (Parking.size() >= 12){
            completo = true;
            System.out.println("El aparcamiento esta completo");
        }else{
            completo = false;
            System.out.println("Quedan " + (12 - Parking.size()) + " placas libres");
        }

        return completo;
    }

    public void SacarVehículo(){
        Calendar calendario = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la matrícla del vehículo que quieres sacar");
        String matricula = sc.nextLine();
        int TimepoSalida = calendario.get(Calendar.SECOND);
        if (Parking.containsKey(matricula)){
            Iterator<String> it = Parking.keySet().iterator();
            while (it.hasNext()){
                String clave = it.next();
                if (Parking.get(clave).getMatricula().equals(matricula)){
                    System.out.println("El coste del aparcamiento es de " + Parking.get(clave).CalcularImporte(TimepoSalida) + " euros");
                    it.remove();
                    System.out.println("El vehículo ha sido eliminado");
                }

            }
        }else{
            System.out.println("El vehículo que quieres sacar no se encuentra en el aparcamiento");
        }

    }

    public void IntroducirVehículo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que vehículo vas a querer introducir: ");
        String vehiculo = sc.nextLine();

        if (vehiculo.equals("coche")){
            vehiculos vehiculonuevo = new coches("1735nmv","Toyota","Land Cruiser",5);
            if (Parking.containsKey(vehiculonuevo.getMatricula())){
                System.out.println("El vehículo que intentas introducir ya se encuentra en el aparcamiento");

            }else{
                if (AparcamientoCompleto()){
                    System.out.println("El aparcamiento esta lleno");
                }else{
                    Parking.put(vehiculonuevo.getMatricula(),vehiculonuevo);
                }
            }
        }else{
            vehiculos vehiculonuevo2 = new camiones("5731pqñ",6);
            if (Parking.containsKey(vehiculonuevo2.getMatricula())){
                System.out.println("El vehículo que intentas introducir ya se encuentra en el aparcamiento");

            }else{
                if (AparcamientoCompleto()){
                    System.out.println("El aparcamiento esta lleno");
                }else{
                    Parking.put(vehiculonuevo2.getMatricula(),vehiculonuevo2);
                }
            }
        }
    }

    public void SalirAplicacion(){
        System.out.println("GRACIAS POR USAR LA APLICACION");
    }


}
