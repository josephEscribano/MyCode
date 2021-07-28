package srcSegunda.src.Clases.EjemplosTeoría.ejemploStatic;

public class Bicicleta {
    private int numMarchas;
    private int diametroRueda;
    private int velocidad;
    private String id;


    //Variable estática
    //Compartida para todas las instancias.
    private static int numeroDeBiciletas = 0;


    public static int getNumeroDeBicicletas() {
        //No podemos usar this
        //return this.numeroDeBiciletas;
        return numeroDeBiciletas;
    }

    public Bicicleta(int numMarchas, int diametroRueda, int velocidad) {
        this.numMarchas = numMarchas;
        this.diametroRueda = diametroRueda;
        this.velocidad = velocidad;
        numeroDeBiciletas++; //como instanciamos una bicicleta, contamos el número que llevamos
        id = "BICI"+numeroDeBiciletas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }


    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }


    public int getDiametroRueda() {
        return diametroRueda;
    }


    public void setDiametroRueda(int diametroRueda) {
        this.diametroRueda = diametroRueda;
    }


    public int getVelocidad() {
        return velocidad;
    }


    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda + ", velocidad=" + velocidad
                + ", id=" + id + "]";
    }




}
