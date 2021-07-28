package pooAv.ejemploInterfaz;

public class Circulo implements Figura{
    private float diametro;
    //constructor
    public Circulo(float diametro) {
        this.diametro = diametro;
    }
    //getter y setter
    public float getDiametro() {
        return diametro;
    }
    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    //implementando el método de la interfaz
    @Override
    public float area() {
        return (PI*diametro*diametro/4f);
        //PI es una constante que está en la
        // interefaz por lo que podemos usarla
    }
}
