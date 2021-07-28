package herencias_interface.Ejercicio1Herencias;

public class Empleados {
    private String dni;
    private String Nombre;
    private int Edad;
    private int sueldo_bruto;
    private String Categoría;
    private Departamentos departamento;

    //constructores

    public Empleados(String dni, String nombre, int edad, int sueldo_bruto, String categoría, Departamentos departamento) {
        this.dni = dni;
        Nombre = nombre;
        Edad = edad;
        this.sueldo_bruto = sueldo_bruto;
        Categoría = categoría;
        this.departamento = departamento;
    }

    public Empleados() {
    }

    //getter and setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String categoría) {
        Categoría = categoría;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }


    // Metodos


    @Override
    public String toString() {
        return "Empleados{" +
                "dni='" + dni + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", sueldo_bruto=" + sueldo_bruto +
                ", Categoría='" + Categoría + '\'' +
                ", departamento=" + departamento +
                '}';
    }

    public double sueldoNeto(double retencion){
        return this.sueldo_bruto -(this.sueldo_bruto*retencion/100);
    }


}
