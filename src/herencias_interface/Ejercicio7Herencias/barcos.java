package herencias_interface.Ejercicio7Herencias;

public class barcos extends acuaticos{
    private boolean Motor;


    //constructor

    public barcos(String matrícula, String modelo, double eslora, boolean motor) {
        super(matrícula, modelo, eslora);
        Motor = motor;
    }

    //getter and setter


    public boolean isMotor() {
        return Motor;
    }

    public void setMotor(boolean motor) {
        Motor = motor;
    }

    //metodos

    @Override
    public String toString() {
        return "barcos{" +
                "Motor=" + Motor +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        if (isMotor()){
            System.out.println("Este barco tiene motor");
        }else{
            System.out.println("Este barco no tiene motor");
        }
    }
}
