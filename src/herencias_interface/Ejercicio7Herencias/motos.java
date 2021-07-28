package herencias_interface.Ejercicio7Herencias;

public class motos extends terrestres{
    private String color;

    //constructores

    public motos(String matrícula, String modelo, int nruedas, String color) {
        super(matrícula, modelo, nruedas);
        this.color = color;
    }

    //getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metodos

    @Override
    public String toString() {
        return "motos{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Moto de color " + getColor());
    }
}
